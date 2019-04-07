package com.space.dao;

import com.space.entity.BlogArticleCategories;

public interface BlogACategoriesDao extends BaseDao<BlogArticleCategories> {
	//保存
	public BlogArticleCategories saveBAC(String mapper,BlogArticleCategories blogArticleCategories)throws Exception;
}
