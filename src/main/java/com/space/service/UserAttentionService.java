package com.space.service;

import java.util.List;
import java.util.Map;

import com.space.entity.UserAttention;

public interface UserAttentionService extends BaseService<UserAttention> {
	public List<UserAttention> selectByorderByClause(String mapper, Map<String,Object> parameter)throws Exception;
}
