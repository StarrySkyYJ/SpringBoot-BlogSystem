package com.space.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.space.dao.CategoriesDao;
import com.space.entity.BlogCategories;
import com.space.service.CategoriesService;

@Service("categoriesServiceImpl")
public class CategoriesServiceImpl extends BaseServiceImpl<BlogCategories> implements CategoriesService {
	
	@Resource(name="categotiesDaoImpl")
	private CategoriesDao categoriesDao ;
	
	@Override
	public List<BlogCategories> findAllByUserId(String mapper, Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return categoriesDao.findAllByUserId(mapper, parameter);
	}

	@Override
	public List<BlogCategories> findAll(String mapper, Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return categoriesDao.findAll(mapper, parameter);
	}

}
