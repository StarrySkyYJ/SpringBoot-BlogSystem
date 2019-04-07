package com.space.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.MailMessage;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.space.entity.Admin;
import com.space.entity.Role;
import com.space.entity.User;
import com.space.service.AdminService;
import com.space.service.UserService;
import com.space.util.Msg;

/*
 * spring security 认证 。 后续
 * （测试在index中）
 * 
 * 
 */

@Controller
@RequestMapping("/admins")
public class AdminController {

	@Resource(name = "adminServiceImpl")
	private AdminService adminService;

	@Resource(name = "userServiceImpl")
	private UserService userService;

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Resource
	private Msg Msg;

	// 管理员登录： 登录界面
	@RequestMapping("/login/login")
	public String adminLogin() {
		return "/admin/admin-login";
	}

	// 验证登录
	@ResponseBody
	@RequestMapping("/login/islogin")
	public Object adminIsLogin(Admin admin, HttpServletRequest request) throws Exception {
		Map<String, Object> parameter = new HashMap<>();
		parameter.put("username", admin.getUsername());
		Admin adminDb = adminService.findUserAndRoleByUsername("AdminMapper.selectUserAndRoleByUsername", parameter);
		if (adminDb == null || adminDb.getRoles().size() == 0) {
			Msg.setCode(200);
			Msg.setMessage("用户名或密码错误!请重新输入");
		} else {
			Msg.setCode(100);
			Msg.setMessage("验证成功!欢迎进入");
			// 保存到session中
			request.getSession().setAttribute("admin", adminDb);
			List<Role> roles = adminDb.getRoles();
			for (Role role : roles) {
				if ("ROLE_ADMIN".equals(role.getName().trim())) {
					request.getSession().setAttribute("svip", true);
				}
			}
		}

		return Msg;
	}

	// 管理员登陆成功； 进入首页
	@RequestMapping("/index")
	public String adminIndex() {

		return "/admin/admin-index";
	}

	// 退出登陆
	@RequestMapping("/loginOut")
	public String loginOut(HttpServletRequest request) {
		// 注销session
		request.getSession().invalidate();
		return "redirect:/admins/login/login";
	}

	// 管理员退出： 重定向到login
	@RequestMapping("/adminLogout")
	public String admin() {
		return "redirect:/login";
	}

	@RequestMapping("/json")
	@ResponseBody
	public String adminJsonMessage() {
		return "100";
	}

	// 登录失败
	@ResponseBody
	@RequestMapping("/login-error")
	public String loginError(HttpServletRequest request) {
		// 获取异常
		AuthenticationException exception = (AuthenticationException) request.getSession()
				.getAttribute("SPRING_SECURITY_LAST_EXCEPTION");
		return "登录失败" + exception.toString();
	}

	// session 过期；或强制下线
	@ResponseBody
	@RequestMapping("/invalid")
	public String loginInvalid() {
		return "Session 已过期，请重新登录";
	}

	// 用户: 后台管理- 分页查询 所有
	@RequestMapping(value = "/user/list", method = { RequestMethod.POST, RequestMethod.GET })
	public String getUserAll(ModelMap modelMap, int pageNum, int pageSize) throws Exception {
		// 使用分页，单次查询5条数据
		PageHelper.startPage(pageNum, pageSize);
		List<User> userList = userService.findAll("UserMapper.selectAll", null);
		PageInfo<User> pageInfo = new PageInfo<>(userList);
		logger.info("==pageInfo==:{}" + pageInfo);
		modelMap.addAttribute("userPageInfo", pageInfo);
		// System.out.println(pageInfo);
		return "/admin/user/userlist";
	}

	// 用户：修改信息
	@ResponseBody
	@RequestMapping("/user/update")
	public Object setUserEdit(User user) throws Exception {
		logger.info("================id:"+user.getId());		
		int isUpdate = userService.updateUserInfo("UserMapper.updateByPrimaryKeySelective", user);
		if (isUpdate == 1) {
			Msg.setCode(100);
			Msg.setMessage("修改成功");
		}else {
			Msg.setCode(200);
			Msg.setMessage("修改失败");
		}
		
		return Msg;
	}

}
