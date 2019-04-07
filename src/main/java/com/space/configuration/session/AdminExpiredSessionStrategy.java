package com.space.configuration.session;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.session.SessionInformationExpiredEvent;
import org.springframework.security.web.session.SessionInformationExpiredStrategy;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.space.util.Msg;

/**
 * 处理 下线用户逻辑
 * @author Administrator
 *
 */
@Component
public class AdminExpiredSessionStrategy implements SessionInformationExpiredStrategy{
	@Autowired
	private Msg Msg ;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@Override
	public void onExpiredSessionDetected(SessionInformationExpiredEvent event) throws IOException, ServletException {
		
		Msg.setCode(200);
		Msg.setMessage("已经另一台机器登录，您被迫下线。" + event.getSessionInformation().getLastRequest());
		String json = objectMapper.writeValueAsString(Msg);
		event.getResponse().setContentType("application/json;charset=UTF-8");
		event.getResponse().getWriter().write(json);
		
		// 如果是跳转html页面，url代表跳转的地址
        // redirectStrategy.sendRedirect(event.getRequest(), event.getResponse(), "url");
	}
	
}
