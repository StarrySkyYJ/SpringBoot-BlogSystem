package com.space.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
/**
 * 	重写addInterceptors ,自定义拦截器
 * @author Administrator
 *
 */
@Configuration
public class MyWebAppConfigurer extends WebMvcConfigurerAdapter {
	
	@Autowired
	private AdminLoginIntercept adminLoginIntercept;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(adminLoginIntercept).addPathPatterns("/admins/**").excludePathPatterns("/admins/login/**");
		
		super.addInterceptors(registry);
	}

}
