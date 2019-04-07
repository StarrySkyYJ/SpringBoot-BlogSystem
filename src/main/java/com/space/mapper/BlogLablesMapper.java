package com.space.mapper;

import com.space.entity.BlogLables;
import com.space.entity.BlogLablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogLablesMapper {
    int countByExample(BlogLablesExample example);

    int deleteByExample(BlogLablesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BlogLables record);

    int insertSelective(BlogLables record);

    List<BlogLables> selectByExample(BlogLablesExample example);

    BlogLables selectByPrimaryKey(Integer id);
    
    //根据排序方式
    List<BlogLables> selectByorderByClause(String orderByClause);

    int updateByExampleSelective(@Param("record") BlogLables record, @Param("example") BlogLablesExample example);

    int updateByExample(@Param("record") BlogLables record, @Param("example") BlogLablesExample example);

    int updateByPrimaryKeySelective(BlogLables record);

    int updateByPrimaryKey(BlogLables record);
}