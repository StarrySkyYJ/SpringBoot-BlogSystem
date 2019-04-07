package com.space.mapper;

import com.space.entity.BlogImage;
import com.space.entity.BlogImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogImageMapper {
    int countByExample(BlogImageExample example);

    int deleteByExample(BlogImageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BlogImage record);

    int insertSelective(BlogImage record);

    List<BlogImage> selectByExample(BlogImageExample example);

    BlogImage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BlogImage record, @Param("example") BlogImageExample example);

    int updateByExample(@Param("record") BlogImage record, @Param("example") BlogImageExample example);

    int updateByPrimaryKeySelective(BlogImage record);

    int updateByPrimaryKey(BlogImage record);
}