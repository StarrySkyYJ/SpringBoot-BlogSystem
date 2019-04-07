package com.space;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.space.entity.User;
import com.space.util.DateTimeUtil;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpaceblogApplicationTests {

	@Resource
	private DateTimeUtil dateTimeUtil ;
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void getDateTime() {
		String dateTime = dateTimeUtil.getNowDateTime();
		System.out.println("simpleDateFormat时间："+dateTime);
		
		Date nowDate = dateTimeUtil.getNowDate();
		System.out.println("Date时间："+nowDate);
		
		String format = dateTimeUtil.getSimpleDateFormat(nowDate);
		System.out.println("格式转化:"+format);
		
		
	}
	
	
}
