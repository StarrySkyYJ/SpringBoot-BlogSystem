package com.space.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.space.dao.BlogALabelsDao;
import com.space.entity.BolgArticleLables;
import com.space.service.BlogALabelsService;

@Repository("blogALabelsServiceImpl")
public class BlogALabelsServiceImpl extends BaseServiceImpl<BolgArticleLables> implements BlogALabelsService{

	@Resource(name="blogALabelsDaoImpl")
	private BlogALabelsDao blogALabelsDao;
	
	@Override
	public int saveBAL(String mapper, List<BolgArticleLables> bolgArticleLables) throws Exception {
		// TODO Auto-generated method stub
		return blogALabelsDao.saveBAL(mapper, bolgArticleLables);
	}

}
