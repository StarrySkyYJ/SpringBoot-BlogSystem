package com.space.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.RequestMatcher;

import com.space.configuration.handler.AdminAuthenticationFailureHandler;
import com.space.configuration.handler.AdminAuthenticationSuccessHandler;
import com.space.configuration.service.AdminUserDetailsService;
import com.space.configuration.session.AdminExpiredSessionStrategy;

/**
 * spring security 配置类
 * 继承 WebSecurityConfigurerAdapter
 * @author Administrator
 *
 */
@Configuration
@EnableWebSecurity //开启 security 服务
public class SpringWebSecurityConfig extends WebSecurityConfigurerAdapter {

	//注入自定义 UserDetailsService
	@Autowired
	private AdminUserDetailsService adminUserDetailsService;
	
	@Autowired
	private AdminAuthenticationSuccessHandler adminAuthenticationSuccessHandler;
	
	@Autowired
	private AdminAuthenticationFailureHandler adminAuthenticationFailureHandler;
	
	@Autowired
	private AdminExpiredSessionStrategy adminExpiredSessionStrategy;
	
	
	
	//1. 重写configure方法 ，设置不同的url不同的访问权限
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()			
			.antMatchers("/index/**", "/user/**", "/blog/**","/").permitAll() // 都可以访问
			.antMatchers("/h2-console/**").permitAll() // 都可以访问
			.antMatchers("/admins/**").permitAll(); // 需要相应的角色才能访问
			//.antMatchers("/admins/invalid").permitAll()
//			.anyRequest().authenticated() // 需要相应的角色才能访问
//			.and()
//			.formLogin()   //基于 Form 表单登录验证
//			.loginPage("/admins/login").permitAll()// 自定义登录界面 ; 允许所有访问
//			.loginProcessingUrl("/authentication/form") //登陆提交的URL
//			.successHandler(adminAuthenticationSuccessHandler) //使用自定义路径跳转
//			.failureHandler(adminAuthenticationFailureHandler)			
////			.defaultSuccessUrl("/admins/index") //登陆成功界面
////			.failureUrl("/admins/login-error")  //登录失败界面
//			.and()
//			.logout()
//			.logoutUrl("/admin/logout").logoutSuccessUrl("/admin/adminLogout").permitAll()
//			.invalidateHttpSession(true);
//		//限制最大登录数
//		http.sessionManagement()
//			.invalidSessionUrl("/admins/invalid")//session过期后跳转路径
//			.maximumSessions(1)
//			.maxSessionsPreventsLogin(false) //最大值时是否保留用户
//			.expiredSessionStrategy(new AdminExpiredSessionStrategy()); //旧用户强制下线
		http.csrf().disable();	 //禁用 csrf防护  跨域
		
		
		super.configure(http);
	}
	 
//	// 密码加密方式
//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
	
	
	//2. 重写 configure 方法 ; 密码加密（不做）
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// auth.userDetailsService(adminUserDetailsService); // 注入MyUserService，这样SpringSecurity会调用里面的loadUserByUsername(String s)
		
		super.configure(auth);
	}
	
	//3. 静态资源: 忽略的请求
	//Override this method to configure WebSecurity.
	//For example, if you wish to ignore certain requests.
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/images/**", "/resource/**") ;			
		super.configure(web);
	}
}
