package com.space.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.space.dao.BlogCommentsDao;
import com.space.entity.BlogComments;
import com.space.service.BlogCommentsService;

@Service("blogCommentsServiceImpl")
public class BlogCommentsServiceImpl extends BaseServiceImpl<BlogComments> implements BlogCommentsService {

	@Resource(name="blogCommentsDaoImpl")
	private BlogCommentsDao blogCommentsDao;
	
	@Override
	public List<BlogComments> findByArticleID(String mapper, Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return blogCommentsDao.findByArticleID(mapper, parameter);
	}

}
