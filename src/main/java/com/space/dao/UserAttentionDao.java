package com.space.dao;

import java.util.List;
import java.util.Map;

import com.space.entity.UserAttention;

public interface UserAttentionDao extends BaseDao<UserAttention> {
	
	public List<UserAttention> selectByorderByClause(String mapper, Map<String,Object> parameter)throws Exception;
}
