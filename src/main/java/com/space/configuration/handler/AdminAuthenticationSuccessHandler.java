package com.space.configuration.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

/**
 * 登录成功 跳转路径
 * @author Administrator
 *
 */
@Component
public class AdminAuthenticationSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {
	 private Logger logger = LoggerFactory.getLogger(getClass());

	    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
	        //打印认证信息
	    	 System.out.println("自定义成功处理逻辑--------------------------");

	         //创建一个SecurityContext对象，并且设置上一步得到的Authentication
	         SecurityContextHolder.getContext().setAuthentication(authentication);
	         HttpSession session = request.getSession();

	         //将上一部得到的SecurityContext对象放入session中。到此，自定义用户信息的处理已经完成
	         session.setAttribute("SPRING_SECURITY_CONTEXT", SecurityContextHolder.getContext().getAuthentication());
	         System.out.println("--------------结束认证");
	         System.out.println("将用户信息存储在session中");
	        
	    	super.setDefaultTargetUrl("/admins/json");
	    	super.onAuthenticationSuccess(request, response, authentication);
	    }

}
