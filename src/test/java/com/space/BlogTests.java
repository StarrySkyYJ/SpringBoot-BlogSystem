package com.space;

import static org.mockito.Matchers.anyBoolean;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

import com.space.entity.BlogArticle;
import com.space.entity.BlogArticleCategories;
import com.space.entity.BlogComments;
import com.space.service.BlogACategoriesService;
import com.space.service.BlogCommentsService;
import com.space.service.BlogService;
import com.space.util.DateTimeUtil;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogTests {
	@Resource
	private BlogService blogService;
	
	@Resource
	private BlogCommentsService blogcommentsService;
	
	@Resource
	private BlogACategoriesService blogACategoriesService;
	
	@Resource
	private DateTimeUtil dateTimeUtil;
	
	@Test
	public void findById() throws Exception {
		Map<String, Object> parameter = new HashMap<>();
		parameter.put("id", 1);
		BlogArticle blogArticle = blogService.findBlogArticleById("BlogArticleMapper.selectById", parameter);
		System.out.println(blogArticle);
	}
	
	@Test
	public void findComments() throws Exception {
		Map<String, Object> parameter = new HashMap<>();
		parameter.put("id", 1);
		List<BlogComments> commentsList = blogcommentsService.findByArticleID("BlogCommentsMapper.selectByArticleID", parameter);
		System.out.println(commentsList);
	}
	
	@Test
	public void saveBAC() throws Exception {
		BlogArticleCategories blogArticleCategories = new BlogArticleCategories() ;
		blogArticleCategories.setId(null);
		blogArticleCategories.setArticleId(1);
		blogArticleCategories.setCategories(10);
		BlogArticleCategories bac = blogACategoriesService.saveBAC("BlogArticleCategoriesMapper.insertBAC", blogArticleCategories);
		System.out.println(bac);
	}
	
	@Test
	public void findByDate() throws Exception {
		Date date = dateTimeUtil.getNowDate();
		//2019-03-26 15:25:20
		Map<String, Object> parameter = new HashMap<>();
		parameter.put("date", "2019-03-26 15:25:20");
		BlogArticle blogArticle2 = blogService.findByDate("BlogArticleMapper.selectByDate", parameter);
		System.out.println(blogArticle2.getId());
	}
	
	
	@SuppressWarnings("null")
	@Test
	public void test() throws Exception {
//		List<Integer> list = new ArrayList<>();
//		int[] array = {1,2,3,4,5};
//		for (int i : array) {
//			System.out.println(i);
//			list.add(i);
//		}
		HttpServletRequest request = null ;
		
		System.out.println("路径："+request.getSession().getServletContext().getContextPath());
		
	}
}
