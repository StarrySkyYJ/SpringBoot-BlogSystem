package com.space.mapper;

import com.space.entity.User;
import com.space.entity.UserExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);
    
    //批量添加
    int	saveUserList(List<User> list);
    
    int saveRegister(User user);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);
    
    //后台管理：查询所有 
    List<User> selectAll();
    
    //查询数量
    int selectByUsernameAndPassword(Map<String, Object> parameter);
    
    //根据主键 查询 
    User selectALLById(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}