package com.space.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.space.dao.BlogDao;
import com.space.entity.BlogArticle;
import com.space.service.BlogService;

@Service("blogServiceImpl")
public class BlogServiceImpl extends BaseServiceImpl<BlogArticle> implements BlogService{

	@Resource(name="blogDaoImpl")
	private BlogDao blogDao ;
	
	@Override
	public List<BlogArticle> findBlogByOrderByClause(String mapper, Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return blogDao.findBlogArticleByDateTime(mapper, parameter);
	}

	@Override
	public BlogArticle findBlogArticleById(String mapper, Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return blogDao.findBlogArticleById(mapper, parameter);
	}

	@Override
	public List<BlogArticle> findByUserIdAndOrder(String mapper, Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return blogDao.findByUserIdAndOrder(mapper, parameter);
	}

	@Override
	public BlogArticle saveArticleSelective(String mapper, BlogArticle blogArticle) throws Exception {
		// TODO Auto-generated method stub
		return blogDao.saveArticleSelective(mapper, blogArticle);
	}

	@Override
	public BlogArticle findByDate(String mapper, Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return blogDao.findByDate(mapper, parameter);
	}

}
