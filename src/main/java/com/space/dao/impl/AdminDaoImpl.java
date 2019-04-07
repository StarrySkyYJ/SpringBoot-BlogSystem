package com.space.dao.impl;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.space.dao.AdminDao;
import com.space.entity.Admin;

@Repository("adminDaoImpl")
public class AdminDaoImpl extends BaseDaoImpl<Admin> implements AdminDao{

	@Override
	public Admin findUserAndRoleByUsername(String mapper, Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return super.find(mapper, parameter);
	}

}
