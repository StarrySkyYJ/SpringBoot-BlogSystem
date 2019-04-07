package com.space.dao;

import java.util.List;
import java.util.Map;

import com.space.entity.BlogLables;
/**
 * 标签 
 * @author Administrator
 *
 */
public interface LabelsDao extends BaseDao<BlogLables>{
	//查询 最热标签
	public List<BlogLables> findLablesByHot(String mapper , Map<String ,Object> parameter) throws Exception; 
}
