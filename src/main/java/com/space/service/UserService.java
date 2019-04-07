package com.space.service;

import java.util.List;
import java.util.Map;

import com.space.entity.User;

public interface UserService extends BaseService<User> {
	public User selectByUsernameAndPassword(String mapper, Map<String, Object> parameter) throws Exception;

	// 注册保存
	public int saveUserList(String mapper, List<User> entitys) throws Exception;

	// 通过id查找
	public User findByPrimaryKey(String mapper, Map<String, Object> parameter) throws Exception;
	
	//查询 用户和文章 
    public User selectALLById(String mapper,Map<String,Object> parameter)throws Exception;
    
  //后台管理：查询所有
    public List<User> findAll(String mapper,Map<String,Object> parameter)throws Exception;
    
  //后台管理：修改用户信息
    public int updateUserInfo(String mapper,User user)throws Exception;
}
