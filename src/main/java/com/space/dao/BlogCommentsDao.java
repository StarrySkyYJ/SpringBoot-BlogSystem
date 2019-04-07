package com.space.dao;

import java.util.List;
import java.util.Map;

import com.space.entity.BlogComments;

public interface BlogCommentsDao extends BaseDao<BlogComments> {
	
	//根据博文ID 查询评论
	List<BlogComments> findByArticleID(String mapper,Map<String ,Object> parameter) throws Exception;
}
