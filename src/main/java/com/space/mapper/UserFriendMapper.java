package com.space.mapper;

import com.space.entity.UserFriend;
import com.space.entity.UserFriendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserFriendMapper {
    int countByExample(UserFriendExample example);

    int deleteByExample(UserFriendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserFriend record);

    int insertSelective(UserFriend record);

    List<UserFriend> selectByExample(UserFriendExample example);

    UserFriend selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserFriend record, @Param("example") UserFriendExample example);

    int updateByExample(@Param("record") UserFriend record, @Param("example") UserFriendExample example);

    int updateByPrimaryKeySelective(UserFriend record);

    int updateByPrimaryKey(UserFriend record);
}