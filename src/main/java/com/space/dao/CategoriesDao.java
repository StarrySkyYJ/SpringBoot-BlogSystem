package com.space.dao;

import java.util.List;
import java.util.Map;

import com.space.entity.BlogCategories;

public interface CategoriesDao extends BaseDao<BlogCategories>{
	
	//通过userid查询 博文及分类
	public List<BlogCategories> findAllByUserId(String mapper ,Map<String, Object> parameter) throws Exception;
	
	//查询所有 分类
	public List<BlogCategories> findAll(String mapper ,Map<String, Object> parameter) throws Exception;
}
