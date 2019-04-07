package com.space.mapper;

import com.space.entity.BlogArticle;
import com.space.entity.BlogArticleExample;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


public interface BlogArticleMapper {
    int countByExample(BlogArticleExample example);

    int deleteByExample(BlogArticleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BlogArticle record);

    int insertSelective(BlogArticle record);
    
    //保存文章
    BlogArticle insertBySelective(BlogArticle record);

    List<BlogArticle> selectByExampleWithBLOBs(BlogArticleExample example);

    List<BlogArticle> selectByExample(BlogArticleExample example);
    
    //根据排序方式
    List<BlogArticle> selectByorderByClause(String orderByClause);
    
    //根据 主键id查询博客及用户
    BlogArticle selectById(Integer id);
    
    //根据 用户主键  及 排序方式查询
    List<BlogArticle> selectByUserIdAndOrder(Map<String, Object> paremeter);
    
    //根据 时间 查询博客 
    BlogArticle selectByUserIdDate(Map<String, Object> paremeter);
    
    BlogArticle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BlogArticle record, @Param("example") BlogArticleExample example);

    int updateByExampleWithBLOBs(@Param("record") BlogArticle record, @Param("example") BlogArticleExample example);

    int updateByExample(@Param("record") BlogArticle record, @Param("example") BlogArticleExample example);

    int updateByPrimaryKeySelective(BlogArticle record);

    int updateByPrimaryKeyWithBLOBs(BlogArticle record);

    int updateByPrimaryKey(BlogArticle record);
}