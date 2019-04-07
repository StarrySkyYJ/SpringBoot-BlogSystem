package com.space.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

/**
 * 	时间工具： 时间转化 Date——simpleDateFormat
 * 	时间 获取；
 * 	时间 计时；
 * @author Administrator
 *
 */
@Component
public class DateTimeUtil {
	
	private Date date ;
	//时间固定格式
	public final static String PATTERN_TIME = "yyyy-MM-dd HH:mm:ss" ;
	
	/*
	 * 获取时间  Date类型
	 */
	public Date getNowDate() {
		date = new Date();
		return date;
	}
	
	/*
	 * 获取时间 yyyy-MM-dd HH:mm:ss 类型
	 */
	public String getNowDateTime() {
		date  = new Date();
		SimpleDateFormat sdFormat = new SimpleDateFormat(PATTERN_TIME);	
		return sdFormat.format(date);
	}
	
	/**
	 * 格式转化 Date 转 simpleDateFormat
	 */
	public String getSimpleDateFormat(Date d) {
		SimpleDateFormat sdFormat = new SimpleDateFormat(PATTERN_TIME);	
		return sdFormat.format(d);
	}
	
}
