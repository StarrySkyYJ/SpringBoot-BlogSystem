package com.space.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.space.dao.CategoriesDao;
import com.space.entity.BlogCategories;

@Repository("categotiesDaoImpl")
public class CategoriesDaoImpl extends BaseDaoImpl<BlogCategories> implements CategoriesDao{

	@Override
	public List<BlogCategories> findAllByUserId(String mapper, Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return super.findList(mapper, parameter);
	}

	@Override
	public List<BlogCategories> findAll(String mapper, Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return super.findList(mapper, parameter);
	}
	
}
