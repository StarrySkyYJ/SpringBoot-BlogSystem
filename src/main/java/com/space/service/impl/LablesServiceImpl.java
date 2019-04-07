package com.space.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.space.dao.LabelsDao;
import com.space.entity.BlogLables;
import com.space.service.LablesService;

@Service("lablesServiceImpl")
public class LablesServiceImpl extends BaseServiceImpl<BlogLables> implements LablesService {

	@Resource(name="labelsDaoImpl")
	private LabelsDao labelsDao;
	
	@Override
	public List<BlogLables> findLablesByHot(String mapper, Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return labelsDao.findLablesByHot(mapper, parameter);
	}



}
