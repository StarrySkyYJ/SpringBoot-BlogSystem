package com.space.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.space.dao.LabelsDao;
import com.space.entity.BlogLables;

@Repository("labelsDaoImpl")
public class LabelsDaoImpl extends BaseDaoImpl<BlogLables> implements LabelsDao {

	@Override
	public List<BlogLables> findLablesByHot(String mapper , Map<String ,Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return super.findList(mapper, parameter);
	}

}
