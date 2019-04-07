package com.space.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.space.dao.BlogCommentsDao;
import com.space.entity.BlogComments;

@Repository("blogCommentsDaoImpl")
public class BlogCommentsDaoImpl extends BaseDaoImpl<BlogComments> implements BlogCommentsDao {

	@Override
	public List<BlogComments> findByArticleID(String mapper, Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return super.findList(mapper, parameter);
	}

}
