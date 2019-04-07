package com.space.service;

import java.util.List;
import java.util.Map;

import com.space.entity.BlogLables;

public interface LablesService extends BaseService<BlogLables> {
	// 查询 最热标签
	public List<BlogLables> findLablesByHot(String mapper, Map<String, Object> parameter) throws Exception;
}
