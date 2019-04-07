package com.space.service;

import java.util.List;
import java.util.Map;

import com.space.entity.BlogArticle;

public interface BlogService extends BaseService<BlogArticle> {
	public List<BlogArticle> findBlogByOrderByClause(String mapper, Map<String, Object> parameter) throws Exception;

	// 根据主键 id 查询博客
	public BlogArticle findBlogArticleById(String mapper, Map<String, Object> parameter) throws Exception;

	// 根据 用户主键 及 文章排序 查询
	public List<BlogArticle> findByUserIdAndOrder(String mapper, Map<String, Object> parameter) throws Exception;

	// 根据 用户主键 及 文章排序 查询
	public BlogArticle saveArticleSelective(String mapper, BlogArticle blogArticle) throws Exception;

	// 根据 时间 查询 文章
	public BlogArticle findByDate(String mapper, Map<String, Object> parameter) throws Exception;
}
