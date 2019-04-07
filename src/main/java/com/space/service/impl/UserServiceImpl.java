package com.space.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.space.dao.UserDao;
import com.space.entity.User;
import com.space.service.UserService;

@Service("userServiceImpl")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

	@Resource(name="userDaoImpl")
	private UserDao userDao ;
	
	@Override
	public User selectByUsernameAndPassword(String mapper, Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return userDao.selectByUsernameAndPassword(mapper, parameter);
	}

	@Override
	public int saveUserList(String mapper, List<User> entitys) throws Exception {
		// TODO Auto-generated method stub
		return userDao.saveUserList(mapper, entitys);
	}

	@Override
	public User findByPrimaryKey(String mapper, Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return userDao.findByPrimaryKey(mapper, parameter);
	}

	@Override
	public User selectALLById(String mapper, Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return userDao.selectALLById(mapper, parameter);
	}

	@Override
	public List<User> findAll(String mapper, Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return userDao.findAll(mapper, parameter);
	}

	@Override
	public int updateUserInfo(String mapper, User user) throws Exception {
		// TODO Auto-generated method stub
		return userDao.updateUserInfo(mapper, user);
	}

}
