package com.space.pagehelper;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.space.entity.User;
import com.space.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
	
	@Resource
	private UserService userService;
	
	/**
	 * PageInfo{
	 * 	pageNum=1, pageSize=5, size=5, startRow=1, endRow=5, total=7, pages=2, 
	 * list=Page{count=true, pageNum=1, pageSize=5, 
	 * 	startRow=0, endRow=5, total=7, pages=2, reasonable=true, pageSizeZero=false}
	 * 
	 * [com.space.entity.User@1cab19e2, 
	 * com.space.entity.User@6879e983, 
	 * com.space.entity.User@196d684b, 
	 * com.space.entity.User@45d38165, 
	 * com.space.entity.User@1f3f434], 
	 *
	 * prePage=0, nextPage=2, isFirstPage=true, 
	 * isLastPage=false, hasPreviousPage=false,
	 *  hasNextPage=true, navigatePages=8, 
	 *  navigateFirstPage=1, navigateLastPage=2, navigatepageNums=[1, 2]}
	 * @throws Exception
	 */
	@Test
	public void  getUserAll() throws Exception {
		PageHelper.startPage(1,5);
		List<User> userList = userService.findAll("UserMapper.selectAll", null);
		PageInfo<User> pageInfo = new PageInfo<>(userList);
		
		System.out.println(pageInfo);
	}
}
