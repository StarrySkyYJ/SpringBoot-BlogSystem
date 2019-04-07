package com.space.mapper;

import com.space.entity.BlogCategories;
import com.space.entity.BlogCategoriesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogCategoriesMapper {
    int countByExample(BlogCategoriesExample example);

    int deleteByExample(BlogCategoriesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BlogCategories record);

    int insertSelective(BlogCategories record);
    
    //通过 userid 查询出分类及 博文
    List<BlogCategories> selectAllByUserId(Integer id) ;
    
    //查询所有
    List<BlogCategories> selectAll();

    List<BlogCategories> selectByExample(BlogCategoriesExample example);

    BlogCategories selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BlogCategories record, @Param("example") BlogCategoriesExample example);

    int updateByExample(@Param("record") BlogCategories record, @Param("example") BlogCategoriesExample example);

    int updateByPrimaryKeySelective(BlogCategories record);

    int updateByPrimaryKey(BlogCategories record);
}