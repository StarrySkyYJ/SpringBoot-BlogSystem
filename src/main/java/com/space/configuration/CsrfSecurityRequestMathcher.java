package com.space.configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.web.util.matcher.RequestMatcher;
import org.springframework.stereotype.Component;

/**
 * 	允许请求访问机制
 * @author Administrator
 *
 */
@Component
public class CsrfSecurityRequestMathcher implements RequestMatcher {

	private Pattern allowedMethods = Pattern.compile("^(GET|HEAD|TRACE|OPTIONS)$");
	
	@Override
	public boolean matches(HttpServletRequest request) {
		List<String> unExecludeUrls = new ArrayList<>();
        //unExecludeUrls.add("/api/test");//（不允许post请求的url路径）此处根据自己的需求做相应的逻辑处理
 
        if (unExecludeUrls != null && unExecludeUrls.size() > 0) {
            String servletPath = request.getServletPath();
            request.getParameter("");
            for (String url : unExecludeUrls) {
                if (servletPath.contains(url)) {
                    return true;
                }
            }
        }
        return allowedMethods.matcher(request.getMethod()).matches();

	}

}
