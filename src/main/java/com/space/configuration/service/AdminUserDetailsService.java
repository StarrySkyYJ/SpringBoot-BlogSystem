package com.space.configuration.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.space.entity.Admin;
import com.space.entity.Role;
import com.space.service.AdminService;


/**
 * service 类
 * 自定义 userDetailsService
 * 将用户信息和权限注入进来
 * @author Administrator
 *
 */

@Service("adminUserDetailsService")
public class AdminUserDetailsService  implements UserDetailsService{
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource(name="adminServiceImpl")
	private AdminService adminService ;

	/**
	 * 实现 UserDetailsService ,重写 loadUserByUsername 方法 
	 */
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		logger.info("=======输入的用户名=======:{}",username);
		
		Collection<GrantedAuthority>  authorities = new ArrayList<>();
		Map<String, Object> parameter = new HashMap<>();
		parameter.put("username", username);
		Admin admin = null ;
		
		// 数据库取出数据
		try {
			admin = adminService.findUserAndRoleByUsername("AdminMapper.selectUserAndRoleByUsername", parameter);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		//判断
		if (admin == null || admin.getRoles().size() == 0) {
			logger.info("=======角色不存在=======");
			throw new UsernameNotFoundException("用户不存在");
			
		}
		
		logger.info("=======获取到的密码=======:{}",admin.getPassword());
		logger.info("=======获取到的角色=======:{}",admin.getRoles().get(0).getName());
		
		//添加角色 ;绑定到 该 user
		List<Role> roles = admin.getRoles();
		for (Role role : roles) {
			logger.info("=======遍历的角色=======:{}",role.getName());
			authorities.add(new SimpleGrantedAuthority(role.getName()));
		}
		
		
		//返回UserDatails 对象  org.springframework.security.core.userdetails.User;
		return new User(admin.getUsername(),admin.getPassword(),authorities) ;
	}

}
