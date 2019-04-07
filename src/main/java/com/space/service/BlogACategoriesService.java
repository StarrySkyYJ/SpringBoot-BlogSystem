package com.space.service;

import com.space.entity.BlogArticleCategories;

public interface BlogACategoriesService extends BaseService<BlogArticleCategories> {
	//保存
	public BlogArticleCategories saveBAC(String mapper,BlogArticleCategories blogArticleCategories)throws Exception;
}
