package com.space.mapper;

import com.space.entity.BlogCommentsReply;
import com.space.entity.BlogCommentsReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogCommentsReplyMapper {
    int countByExample(BlogCommentsReplyExample example);

    int deleteByExample(BlogCommentsReplyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BlogCommentsReply record);

    int insertSelective(BlogCommentsReply record);

    List<BlogCommentsReply> selectByExample(BlogCommentsReplyExample example);

    BlogCommentsReply selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BlogCommentsReply record, @Param("example") BlogCommentsReplyExample example);

    int updateByExample(@Param("record") BlogCommentsReply record, @Param("example") BlogCommentsReplyExample example);

    int updateByPrimaryKeySelective(BlogCommentsReply record);

    int updateByPrimaryKey(BlogCommentsReply record);
}