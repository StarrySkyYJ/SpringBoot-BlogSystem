package com.space.util;

import org.springframework.stereotype.Component;

/**
 * redis 常量
 * @author Administrator
 *
 */
@Component
public class RedisUtil {
	
	//redis list类型 key值
	private final String LIST_REDIS_KEY = "spaceBlog" ;

	public String getLIST_REDIS_KEY() {
		return LIST_REDIS_KEY;
	}
	
}
