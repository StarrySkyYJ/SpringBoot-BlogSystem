package com.space.util;
/**
 * 	返回 消息类; 100 成功；200失败
 * @author Administrator
 *
 */

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class Msg {

	public final static int M_SUCCESS = 100;

	public final static int M_FAIL = 200;

	// 状态码
	private int code;

	// 提示信息
	private String message;

	// 返回的数据
	private Map<String, Object> messageMap = new HashMap<>();

	// 请求成功 消息返回
	public static Msg success() {
		Msg msg = new Msg();
		msg.setCode(M_SUCCESS);
		msg.setMessage("处理成功");
		return msg;
	}

	// 请求成功 消息返回
	public static Msg fail() {
		Msg msg = new Msg();
		msg.setCode(M_FAIL);
		msg.setMessage("处理失败");
		return msg;
	}
	
	/**
	 * 	添加消息 
	 * @param key
	 * @param value
	 * @return
	 */
	public Msg addMessage(String key , Object value) {
		this.getMessageMap().put(key, value);
		return this ;
	}

	//获取 map对象
	public Map<String, Object> getMessageMap(){
		return messageMap ;
	}
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
