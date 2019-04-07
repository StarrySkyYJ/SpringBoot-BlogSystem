package com.space.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.space.dao.UserAttentionDao;
import com.space.entity.UserAttention;
import com.space.service.UserAttentionService;

@Service("userAttentionServiceImpl")
public class UserAttentionServiceImpl extends BaseServiceImpl<UserAttention> implements UserAttentionService {

	@Resource(name="userAttentionDaoImpl")
	private UserAttentionDao userAttentionDao;
	
	@Override
	public List<UserAttention> selectByorderByClause(String mapper, Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return userAttentionDao.selectByorderByClause(mapper, parameter);
	}
	
}
