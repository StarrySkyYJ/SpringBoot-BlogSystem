package com.space.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.space.entity.BlogArticle;
import com.space.entity.BlogCategories;
import com.space.entity.User;
import com.space.service.BlogService;
import com.space.service.CategoriesService;
import com.space.service.UserService;
import com.space.util.DateTimeUtil;
import com.space.util.Msg;

import ch.qos.logback.classic.Logger;

/**
 * 用户 Controller
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Resource(name = "userServiceImpl")
	private UserService userService;

	@Resource(name = "categoriesServiceImpl")
	private CategoriesService categoriesService;

	@Resource(name = "blogServiceImpl")
	private BlogService blogService;

	@Resource
	private DateTimeUtil dateTimeUtil; // 时间工具
	
	private Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Resource
	private Msg msg; // 返回消息封装

	// 用户登录页面
	@RequestMapping("/login")
	public String userLogin() {
		return "/user/login";
	}

	// 用户注册页面
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String userRegister() {
		return "/user/register";
	}

	// 用户登录: 校验用户名 及 密码
	@SuppressWarnings("unused")
	@ResponseBody
	@RequestMapping(value = "/userLogin", method = RequestMethod.POST)
	public Object isUserLogin(User user, HttpServletRequest request) throws Exception {
		// System.out.println(user.getUsername() + ":" + user.getPassword());
		Map<String, Object> map = new HashMap<>();
		map.put("username", user.getUsername());
		map.put("password", user.getPassword());
		User user2 = userService.selectByUsernameAndPassword("UserMapper.selectByUsernameAndPassword", map);
		// 用户名及密码正确 ;
		if (user2 != null) {
			msg.addMessage("id", user2.getId());
			msg.setMessage("登录成功");
			msg.setCode(100);
			// 保存用户名及密码 到session中
			request.getSession().setAttribute("userSession", user2);
			return msg;
		}
		return Msg.fail();
	}

	// 退出登陆
	@RequestMapping("/loginOut")
	public String loginOut(HttpServletRequest request) {
		// 注销session
		request.getSession().invalidate();
		return "redirect:/index/";
	}

	// 用户名username 唯一校验

	@ResponseBody
	@RequestMapping(value = "/isUsernameExists", method = RequestMethod.POST)
	public String isUsernameExists(@RequestParam(value = "username") String username) throws Exception {
		System.out.println("后台username" + username);
		Map<String, Object> map = new HashMap<>();
		map.put("username", username);
		User user1 = userService.selectByUsernameAndPassword("UserMapper.selectByUsernameAndPassword", map);
		if (user1 != null) {
			return "fail";
		}
		return "success";
	}

	// 用户注册 ; 保存到数据库
	@ResponseBody
	@RequestMapping(value = "/userRegister", method = RequestMethod.POST)
	public String isUserRegister(User user) throws Exception {
		Date date = dateTimeUtil.getNowDate();
		user.setRegisterTime(date);
		List<User> list = new LinkedList<>();
		list.add(user);
		int isSave = userService.saveUserList("UserMapper.saveUserList", list);
		return String.valueOf(isSave);
	}

	/**
	 * 用户主页 -- 通过 用户id 查找 区分大众及个人： session 和 传入id 对比
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/homePage", method = RequestMethod.GET)
	public String homePage(ModelMap modelMap, @RequestParam(value = "id") int id) throws Exception {
		Map<String, Object> parameter = new HashMap<>();
		parameter.put("id", id);
		// 查询 用户信息及文章信息
		User user = userService.selectALLById("UserMapper.selectALLById", parameter);
		modelMap.addAttribute("user", user);

		// 查询文章分类（建表失误-中间表：该直接在博文表中设置分类外键）
		List<BlogCategories> blogCategoriesList = categoriesService
				.findAllByUserId("BlogCategoriesMapper.selectAllByUserId", parameter);

		modelMap.addAttribute("categoriesList", blogCategoriesList);

		return "/user/home";
	}

	/**
	 * 最新： index 最热： indexHot
	 * 
	 * @param modelMap
	 * @param id
	 * @param pageNum
	 * @param isHot
	 * @return
	 * @throws Exception
	 */
	// 用户个人主页 博客items ； 根据用户id 查询
	@RequestMapping("/getUserBlogItems")
	public String getUserBlogItems(ModelMap modelMap, int id, int pageNum, String isHot) throws Exception {
		String blogOrderByClause = "article_date desc";
		if ("indexHot".equals(isHot)) {
			// 获取 最热 : 根据 浏览数 及 点赞数
			blogOrderByClause = "article_views desc ,article_num_like desc";
		} else {
			// 获取
			blogOrderByClause = "article_date desc";
		}
		HashMap<String, Object> parameter = new HashMap<>();
		parameter.put("orderByClause", blogOrderByClause);
		parameter.put("id", id);

		// 分页 默认10页
		PageHelper.startPage(pageNum, 10);
		// 查询 用户信息及文章信息 ;
		List<BlogArticle> blogArticles = blogService.findByUserIdAndOrder("BlogArticleMapper.selectByUserIdAndOrder",
				parameter);
		PageInfo<BlogArticle> pageInfo = new PageInfo<>(blogArticles);

		// modelMap.addAttribute("user", uList);

		modelMap.addAttribute("blogList", pageInfo);
		modelMap.addAttribute("isHot", isHot);
		modelMap.addAttribute("userId", id);
		return "/user/home-blogitems";
	}

	// 图片上传 imageUpload
	@ResponseBody
	@RequestMapping(value = "/imageUpload", method = RequestMethod.POST)
	public String fileUpload(@RequestParam("file") MultipartFile multFile, HttpServletRequest request) {
		// 获取上传文件名并打印
		String multFileName = multFile.getOriginalFilename();
		System.out.println("文件名为：" + multFileName);
		// 获取上传文件大小并打印
		long size = multFile.getSize();
		System.out.println("文件大小：" + size);

		// 获取文件后缀
		String suffix = multFileName.substring(multFileName.lastIndexOf("."));
		System.out.println("文件后缀名" + suffix);

		User user = (User) request.getSession().getAttribute("userSession");
		String preName = user.getUsername() + "-imageIcon"+user.getId();
		// ***. 文件上传(主要）
		String localpath = request.getContextPath();
		String l2 = request.getServletContext().getRealPath("../static/images/headIcon");
		logger.info("路径："+localpath);
		logger.info("路径：L2"+l2);
		
		String path = "E:/FileUpload";
		File newFile = new File(path + "/" + preName + suffix);
		/*if (!newFile.getParentFile().exists()) { // 判断文件父目录是否存在
			newFile.getParentFile().mkdirs();
		}*/

		
		try {
			multFile.transferTo(newFile);
		} catch (IllegalStateException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "上传成功";
	}

}
