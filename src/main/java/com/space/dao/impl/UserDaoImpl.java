package com.space.dao.impl;

import com.space.dao.UserDao;
import com.space.entity.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName UserDaoImpl
 * @Description TODO
 * @Author Administrator
 * @Date 2018/10/28 22:51
 * @Version 1.0
 **/
@Repository("userDaoImpl")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {
    @Override
    public List<User> findBlogInFoById(String mapper ,int id) throws Exception {
        Map<String,Object> parameter = new HashMap<>();
        parameter.put("id",id);
        return super.findList(mapper,parameter);
    }

	@Override
	public List<User> selectByorderByClause(String mapper, Map<String,Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return super.findList(mapper, parameter);
	}

	//判断登录
	public User selectByUsernameAndPassword(String mapper, Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return super.find(mapper, parameter);
	}

	//注册保存
	public int saveUserList(String mapper, List<User> entitys) throws Exception {
		// TODO Auto-generated method stub
		return super.save(mapper, entitys);
	}

	//id 查询
	public User findByPrimaryKey(String mapper, Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return super.find(mapper, parameter);
	}

	@Override
	public User selectALLById(String mapper, Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return super.find(mapper, parameter);
	}

	@Override
	public List<User> findAll(String mapper, Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return super.findList(mapper, parameter);
	}

	@Override
	public int updateUserInfo(String mapper, User user) throws Exception {
		// TODO Auto-generated method stub
		return super.update(mapper, user);
	}
}
