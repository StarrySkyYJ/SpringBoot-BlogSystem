package com.space.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.space.dao.BlogDao;
import com.space.entity.BlogArticle;

@Repository("blogDaoImpl")
public class BlogDaoImpl extends BaseDaoImpl<BlogArticle> implements BlogDao {

	@Override
	public List<BlogArticle> findBlogArticleByDateTime(String mapper, Map<String, Object> parameter) throws Exception {
		
		return super.findList(mapper, parameter);
	}

	@Override
	public BlogArticle findBlogArticleById(String mapper, Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return super.find(mapper, parameter);
	}

	@Override
	public List<BlogArticle> findByUserIdAndOrder(String mapper, Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return super.findList(mapper, parameter);
	}

	@Override
	public BlogArticle saveArticleSelective(String mapper, BlogArticle blogArticle) throws Exception {
		// TODO Auto-generated method stub
		return super.save(mapper, blogArticle);
	}

	@Override
	public BlogArticle findByDate(String mapper, Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return super.find(mapper, parameter);
	}

	

}
