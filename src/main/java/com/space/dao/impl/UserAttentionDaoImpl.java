package com.space.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import com.space.dao.UserAttentionDao;
import com.space.entity.UserAttention;

@Repository("userAttentionDaoImpl")
public class UserAttentionDaoImpl extends BaseDaoImpl<UserAttention> implements UserAttentionDao{

	@Override
	public List<UserAttention> selectByorderByClause(String mapper, Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return super.findList(mapper, parameter);
	}

}
