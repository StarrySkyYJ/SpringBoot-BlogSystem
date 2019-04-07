package com.space.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.space.dao.AdminDao;
import com.space.entity.Admin;
import com.space.service.AdminService;

@Service("adminServiceImpl")
public class AdminServiceImpl extends BaseServiceImpl<Admin> implements AdminService{

	@Resource(name="adminDaoImpl")
	private AdminDao adminDao;
	
	@Override
	public Admin findUserAndRoleByUsername(String mapper, Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return adminDao.findUserAndRoleByUsername(mapper, parameter);
	}

}
