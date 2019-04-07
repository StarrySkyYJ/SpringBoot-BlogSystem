package com.space.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.space.dao.BlogDao;
import com.space.entity.BlogArticle;
import com.space.entity.BlogArticleCategories;
import com.space.entity.BlogCategories;
import com.space.entity.BlogComments;
import com.space.entity.BlogLables;
import com.space.entity.BolgArticleLables;
import com.space.service.BlogACategoriesService;
import com.space.service.BlogALabelsService;
import com.space.service.BlogCommentsService;
import com.space.service.BlogService;
import com.space.service.CategoriesService;
import com.space.service.LablesService;
import com.space.util.DateTimeUtil;
import com.space.util.Msg;

@Controller
@RequestMapping("/blog")
public class BlogArticleController {
	
	@Resource(name="blogServiceImpl")
	private BlogService blogService;
	
	@Resource(name="categoriesServiceImpl")
	private CategoriesService categoriesService;
	
	@Resource(name="blogCommentsServiceImpl")
	private BlogCommentsService blogCommentsService;
	
	@Resource(name="lablesServiceImpl")
	private LablesService labelsService;
	
	@Resource(name="blogDaoImpl")
	private BlogDao blogDao ;
	
	@Resource(name="blogACategoriesServiceImpl")
	private BlogACategoriesService blogACategoriesService;
	
	@Resource(name="blogALabelsServiceImpl")
	private BlogALabelsService blogALabelsService;
	
	@Resource
	private DateTimeUtil dateTimeUtil;
	
	@Resource
	private Msg msg;
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	/*
	 * 	跳转文章主要内容
	 * 	id: 博客主键
	 */
	@RequestMapping("/content")
	public String mainContent(ModelMap modelMap,@RequestParam(value="id") Integer id) throws Exception {
		Map<String, Object> parameter = new HashMap<>();
		parameter.put("id", id);
		//查询出文章信息
		BlogArticle blogArticle = blogService.findBlogArticleById("BlogArticleMapper.selectById", parameter);
		modelMap.addAttribute("blogArticle", blogArticle);
		//查询分类: 用户id
		Map<String, Object> cParameter = new HashMap<>();
		cParameter.put("id", blogArticle.getUserId());
		List<BlogCategories> blogCategoriesList = categoriesService.findAllByUserId("BlogCategoriesMapper.selectAllByUserId", cParameter);
		modelMap.addAttribute("categoriesList", blogCategoriesList);
		
		//评论信息:  博客主键
		List<BlogComments> commentsList = blogCommentsService.findByArticleID("BlogCommentsMapper.selectByArticleID", parameter);
		modelMap.addAttribute("commentsList", commentsList);
		return "/blog/blogcontent";
	}
	
	/**
	 * 跳转  创建博客 页面
	 * @throws Exception 
	 */
	@RequestMapping("/blogWrite")
	public String writeNewArticle(ModelMap modelMap) throws Exception  {
		Map<String, Object> parameter = new HashMap<>();
		//查询 博客分类
		List<BlogCategories> blogCategories = categoriesService.findAll("BlogCategoriesMapper.selectAll", null);
		modelMap.addAttribute("blogCategories",blogCategories);
		
		//查询最热 标签
		PageHelper.startPage(1, 10);
		String labelsOrderByClause = "lables_num_hot DESC";
		parameter.put("orderByClause", labelsOrderByClause);
		List<BlogLables> labelsList = labelsService.findLablesByHot("BlogLablesMapper.selectByorderByClause", parameter);
		PageInfo<BlogLables> pageInfo = new PageInfo<>(labelsList);
		modelMap.addAttribute("labels", pageInfo);
		return "/blog/blogwrite";
	}
	
	/**
	 * 保存 文章到数据库: 3张表
	 * 用户id : 
	 * 文章标题:
	 * 文章内容:
	 * （时间）
	 * 
	 * 文章分类:
	 * 
	 * 文章标签:
	 * @return
	 * @throws Exception 
	 */
	@ResponseBody
	@RequestMapping(value="/saveArticle",method=RequestMethod.POST)											// 加上注解 ；否则为 null
	public Object saveNewArticle(int userId ,String articleTitle ,String articleContent ,int categoriesId ,@RequestParam(value="labelsId[]") String[] labelsId ) throws Exception {
		Date date = dateTimeUtil.getNowDate();
		String dateFormat = dateTimeUtil.getSimpleDateFormat(date);
		logger.info("时间："+dateFormat);
		BlogArticle blogArticle = new BlogArticle();
		blogArticle.setUserId(userId);
		blogArticle.setArticleTitle(articleTitle);
		blogArticle.setArticleContent(articleContent);
		blogArticle.setArticleDate(date);
		//1. 文章表： 
		//	用户id：userId ; 文章标题：articleTitle ；文章内容： articleContent ； 时间：articleDate		
		logger.info("获取的内容："+blogArticle+";"+categoriesId+";"+labelsId);
		BlogArticle articleSelective = blogDao.saveArticleSelective("BlogArticleMapper.insertBySelective", blogArticle);
		if (StringUtils.isEmpty(articleSelective)) {
			msg.setCode(200);
			msg.setMessage("保存失败");
			return msg ;
		}
		//根据 保存时间及用户ID 查询 博客主键
		Map<String, Object> parameter = new HashMap<>();
		parameter.put("userId", userId);
		parameter.put("date", dateFormat);
		BlogArticle blogArticle2 = blogService.findByDate("BlogArticleMapper.selectByUserIdDate", parameter);
		logger.info("保存后的主键:"+blogArticle2.getId());
		//2.  根据新增的博客主键 插入到 分类表中
		BlogArticleCategories blogArticleCategories = new BlogArticleCategories() ;
		blogArticleCategories.setArticleId(blogArticle2.getId());
		blogArticleCategories.setCategories(categoriesId);
		blogACategoriesService.saveBAC("BlogArticleCategoriesMapper.insertBAC", blogArticleCategories);
		
		//3. 保存 标签
		BolgArticleLables bolgArticleLables =  new BolgArticleLables();
		List<BolgArticleLables> LabelsList = new ArrayList<>();		
		for (String string : labelsId) {
			bolgArticleLables.setArticleId(blogArticle2.getId());
			bolgArticleLables.setLableId(Integer.parseInt(string));
			LabelsList.add(bolgArticleLables);
		}
		int saveBAL = blogALabelsService.saveBAL("BolgArticleLablesMapper.insertBALList", LabelsList);
		if (saveBAL == 0) {
			msg.setCode(200);
			msg.setMessage("发布失败");
			return msg;
		}
		
		msg.setCode(100);
		msg.setMessage("发布成功");
		
		return msg ;
	}

}
