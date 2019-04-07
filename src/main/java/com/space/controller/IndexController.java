package com.space.controller;

import java.io.Reader;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.space.entity.BlogArticle;
import com.space.entity.BlogLables;
import com.space.entity.UserAttention;
import com.space.entity.UserAttentionExample;
import com.space.entity.UserAttentionExample.Criteria;
import com.space.service.BlogService;
import com.space.service.LablesService;
import com.space.service.UserAttentionService;

import ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy;

/**
 * 首页Controller ; 查找最新的文章
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/index")
public class IndexController {

	@Resource(name = "blogServiceImpl")
	private BlogService blogService;

	@Resource(name = "lablesServiceImpl")
	private LablesService lablesService;

	@Resource(name = "userAttentionServiceImpl")
	private UserAttentionService userAttentionService;

	@RequestMapping("/")
	public String reindex() {
		return "redirect:index/index";
	}

	/**
	 * 首页
	 * 
	 * index: 最新内容标识：indexHot
	 * 
	 * @param modelMap
	 * @return
	 * @throws Exception
	 */
	// 获取最新内容
	@RequestMapping("/index/{index}")
	public String index(ModelMap modelMap , @PathVariable(value="index") String index) throws Exception {
//		String blogOrderByClause = "article_date desc" ;
//		if("indexHot".equals(index)) {
//			blogOrderByClause = "article_views desc ,article_num_comments desc" ;
//		}
		System.out.println("index");
		HashMap<String, Object> map = new HashMap<>();
//		map.put("orderByClause", blogOrderByClause);
//		// 1. 按之间先后顺序查询博文(默认一页 查询十条数据)
//		PageHelper.startPage(1, 10);
//		List<BlogArticle> blogList = blogService.findBlogByOrderByClause("BlogArticleMapper.selectByorderByClause",
//				map);
//		PageInfo<BlogArticle>  pageInfo = new PageInfo<>(blogList);
		
		// 2. 查询出热门标签
		String labelsOrderByClause = "lables_num_hot DESC";
		map.put("orderByClause", labelsOrderByClause);
		List<BlogLables> labelsList = lablesService.findLablesByHot("BlogLablesMapper.selectByorderByClause", map);
		// 3. 查询热门用户
		String attentionOrderByClause = "ua.attention_id DESC";
		map.replace("orderByClause", attentionOrderByClause);
		List<UserAttention> attentionsList = userAttentionService
				.selectByorderByClause("UserAttentionMapper.selectByorderByClause", map);

		//modelMap.addAttribute("blogList", pageInfo);
		modelMap.addAttribute("isHot",index);
		modelMap.addAttribute("hotLabels", labelsList);
		modelMap.addAttribute("attentions", attentionsList);
		return "index";
	}

	// 获取最热内容 (根据访问量及评论量)
//	@RequestMapping("/indexHot")
//	public String indexHot(ModelMap modelMap) throws Exception {
//		String blogOrderByClause = "article_views desc ,article_num_comments desc";
//		HashMap<String, Object> map = new HashMap<>();
//		map.put("orderByClause", blogOrderByClause);
//		// 1. 按之间先后顺序查询博文
//		List<BlogArticle> blogList = blogService.findBlogByOrderByClause("BlogArticleMapper.selectByorderByClause",
//				map);
//		// 2. 查询出热门标签
//		String labelsOrderByClause = "lables_num_hot DESC";
//		map.replace("orderByClause", labelsOrderByClause);
//		List<BlogLables> labelsList = lablesService.findLablesByHot("BlogLablesMapper.selectByorderByClause", map);
//		// 3. 查询热门用户
//		String attentionOrderByClause = "ua.attention_id DESC";
//		map.replace("orderByClause", attentionOrderByClause);
//		List<UserAttention> attentionsList = userAttentionService
//				.selectByorderByClause("UserAttentionMapper.selectByorderByClause", map);
//
//		modelMap.addAttribute("blogList", blogList);
//		modelMap.addAttribute("hotLabels", labelsList);
//		modelMap.addAttribute("attentions", attentionsList);
//		return "index";
//	}
	
	/**
	 * 最新： index
	 * 最热： indexHot
	 *  
	 * @param pageNum
	 * @param isHot
	 * @return
	 * @throws Exception 
	 */
	//主页 博客items  
	@RequestMapping("/getBlogItems")
	public String getBlogItems(ModelMap modelMap,int pageNum, String isHot) throws Exception {
		String blogOrderByClause = "article_date desc" ;
		if("indexHot".equals(isHot)) {
			//获取 最热 : 根据 浏览数 及 点赞数
			blogOrderByClause = "article_views desc ,article_num_like desc" ;
		}else {
			//获取 
			blogOrderByClause = "article_date desc" ;
		}
		HashMap<String, Object> map = new HashMap<>();
		map.put("orderByClause", blogOrderByClause);
		// 分页
		PageHelper.startPage(pageNum, 10);
		List<BlogArticle> blogList = blogService.findBlogByOrderByClause("BlogArticleMapper.selectByorderByClause",
				map);
		PageInfo<BlogArticle>  pageInfo = new PageInfo<>(blogList);
			
		modelMap.addAttribute("blogList", pageInfo);
		modelMap.addAttribute("isHot", isHot);
		return "index-blogitem";
	}
	
		
	/**
	 * 后台管理测试 ;(测试使用)
	 */
//	@RequestMapping("/admintest")
//	public String admin_login() {
//		return "/admin/admin-test";
//	}
	
	@RequestMapping("/admintable")
	public String admin_table() {
		return "/admin/admin-testtable";
	}
}
