package com.space.dao.impl;

import org.springframework.stereotype.Repository;

import com.space.dao.BlogACategoriesDao;
import com.space.entity.BlogArticleCategories;

@Repository("blogACategoriesDaoImpl")
public class BlogACategoriesDaoImpl  extends BaseDaoImpl<BlogArticleCategories> implements BlogACategoriesDao{

	@Override
	public BlogArticleCategories saveBAC(String mapper, BlogArticleCategories blogArticleCategories) throws Exception {
		// TODO Auto-generated method stub
		return super.save(mapper, blogArticleCategories);
	}

}
