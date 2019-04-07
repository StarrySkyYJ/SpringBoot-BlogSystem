package com.space.dao;

import com.space.entity.User;

import java.util.List;
import java.util.Map;

/**
 * @Author SPACE
 * @Description 用户所有信息
 * @Date  2018/10/28 22:48
 * @Param
 * @return
 **/
public interface UserDao extends BaseDao<User> {
    public List<User> findBlogInFoById(String mapper ,int id) throws Exception;
    
    //
    public List<User> selectByorderByClause(String mapper, Map<String,Object> parameter)throws Exception;
    
    //登录  用户名或 用户名和密码判断
    public User selectByUsernameAndPassword(String mapper, Map<String,Object> parameter)throws Exception;
    
    //注册保存
    public int saveUserList(String mapper,List<User> entitys)throws Exception;
    
    //通过id查找
    public User findByPrimaryKey(String mapper,Map<String,Object> parameter)throws Exception ;
    
    //查询 用户和文章 并分页
    public User selectALLById(String mapper,Map<String,Object> parameter)throws Exception;
    
    //后台管理：查询所有
    public List<User> findAll(String mapper,Map<String,Object> parameter)throws Exception;
    
    //后台管理：修改用户信息
    public int updateUserInfo(String mapper,User user)throws Exception;
}
