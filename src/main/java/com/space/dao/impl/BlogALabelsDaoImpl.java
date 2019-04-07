package com.space.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.space.dao.BlogALabelsDao;
import com.space.entity.BolgArticleLables;

@Repository("blogALabelsDaoImpl")
public class BlogALabelsDaoImpl extends BaseDaoImpl<BolgArticleLables> implements BlogALabelsDao{

	@Override
	public int saveBAL(String mapper, List<BolgArticleLables> bolgArticleLables) throws Exception {
		// TODO Auto-generated method stub
		return super.save(mapper, bolgArticleLables);
	}

}
