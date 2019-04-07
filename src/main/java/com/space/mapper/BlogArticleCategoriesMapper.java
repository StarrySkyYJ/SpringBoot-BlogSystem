package com.space.mapper;

import com.space.entity.BlogArticleCategories;
import com.space.entity.BlogArticleCategoriesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogArticleCategoriesMapper {
    int countByExample(BlogArticleCategoriesExample example);

    int deleteByExample(BlogArticleCategoriesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BlogArticleCategories record);
    
    //保存
    BlogArticleCategories insertBAC(BlogArticleCategories record);

    int insertSelective(BlogArticleCategories record);

    List<BlogArticleCategories> selectByExample(BlogArticleCategoriesExample example);

    BlogArticleCategories selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BlogArticleCategories record, @Param("example") BlogArticleCategoriesExample example);

    int updateByExample(@Param("record") BlogArticleCategories record, @Param("example") BlogArticleCategoriesExample example);

    int updateByPrimaryKeySelective(BlogArticleCategories record);

    int updateByPrimaryKey(BlogArticleCategories record);
}