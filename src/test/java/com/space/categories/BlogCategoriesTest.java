package com.space.categories;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.space.dao.CategoriesDao;
import com.space.entity.BlogCategories;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class BlogCategoriesTest {
	@Resource
	private CategoriesDao categoriesDao;
	
	@Test
	public void findAllByUserId() throws Exception {
		Map<String, Object> parameter = new HashMap<>();
		parameter.put("id", 1);
		List<BlogCategories> blogCategoriesList = categoriesDao.findAllByUserId("BlogCategoriesMapper.selectAllByUserId", parameter);
		System.out.println(blogCategoriesList);
	}
}
