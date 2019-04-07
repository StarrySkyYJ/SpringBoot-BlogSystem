package com.space.mapper;

import com.space.entity.BlogComments;
import com.space.entity.BlogCommentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogCommentsMapper {
    int countByExample(BlogCommentsExample example);

    int deleteByExample(BlogCommentsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BlogComments record);

    int insertSelective(BlogComments record);
    
    //根据博客id 查询 所有 评论
    List<BlogComments> selectByArticleID(Integer id);

    List<BlogComments> selectByExampleWithBLOBs(BlogCommentsExample example);

    List<BlogComments> selectByExample(BlogCommentsExample example);

    BlogComments selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BlogComments record, @Param("example") BlogCommentsExample example);

    int updateByExampleWithBLOBs(@Param("record") BlogComments record, @Param("example") BlogCommentsExample example);

    int updateByExample(@Param("record") BlogComments record, @Param("example") BlogCommentsExample example);

    int updateByPrimaryKeySelective(BlogComments record);

    int updateByPrimaryKeyWithBLOBs(BlogComments record);

    int updateByPrimaryKey(BlogComments record);
}