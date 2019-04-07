package com.space.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.space.dao.BlogACategoriesDao;
import com.space.entity.BlogArticleCategories;
import com.space.service.BlogACategoriesService;

@Service("blogACategoriesServiceImpl")
public class BlogACategoriesServiceImpl extends BaseServiceImpl<BlogArticleCategories>  implements BlogACategoriesService{
	
	@Resource(name="blogACategoriesDaoImpl")
	private BlogACategoriesDao blogACategoriesDao;
	
	@Override
	public BlogArticleCategories saveBAC(String mapper, BlogArticleCategories blogArticleCategories) throws Exception {
		// TODO Auto-generated method stub
		return blogACategoriesDao.saveBAC(mapper, blogArticleCategories);
	}

}
