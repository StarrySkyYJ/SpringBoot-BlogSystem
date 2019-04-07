package com.space.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.space.entity.UserAttention;
import com.space.entity.UserAttentionExample;

public interface UserAttentionMapper {
    int countByExample(UserAttentionExample example);

    int deleteByExample(UserAttentionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserAttention record);

    int insertSelective(UserAttention record);

    List<UserAttention> selectByExample(UserAttentionExample example);

    UserAttention selectByPrimaryKey(Integer id);
    
    //根据排序方式
    List<UserAttention> selectByorderByClause(String orderByClause);

    int updateByExampleSelective(@Param("record") UserAttention record, @Param("example") UserAttentionExample example);

    int updateByExample(@Param("record") UserAttention record, @Param("example") UserAttentionExample example);

    int updateByPrimaryKeySelective(UserAttention record);

    int updateByPrimaryKey(UserAttention record);
}