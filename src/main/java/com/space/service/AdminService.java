package com.space.service;

import java.util.List;
import java.util.Map;

import com.space.entity.Admin;

public interface AdminService extends BaseService<Admin> {
	// 根据用户名 查询用户信息及角色信息
	Admin findUserAndRoleByUsername(String mapper, Map<String, Object> parameter) throws Exception;
}
