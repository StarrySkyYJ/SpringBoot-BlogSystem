package com.space.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.space.dao.BaseDao;
import com.space.service.BaseService;

@Transactional
@Service("baseServcieImpl")
public abstract class BaseServiceImpl<T> implements BaseService<T>{
	
	//不需要加注解
	private BaseDao<T> baseDao ;
	
	//增
	@Transactional
	public T save(String mapper, T entity) throws Exception {
		// TODO Auto-generated method stub
		return baseDao.save(mapper, entity);
	}

	public int save(String mapper, List<T> entitys) throws Exception{
		return baseDao.save(mapper, entitys);
	}
	
	@Transactional
	public int save(String mapper, Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return baseDao.save(mapper, parameter);
	}

	@Transactional
	public int update(String mapper, Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return baseDao.update(mapper, parameter);
	}

	@Transactional
	public int delete(String mapper, int id) throws Exception {
		// TODO Auto-generated method stub
		return baseDao.delete(mapper, id);
	}

	@Transactional
	public int delete(String mapper, int[] ids) throws Exception {
		// TODO Auto-generated method stub
		return baseDao.delete(mapper, ids);
	}

	@Transactional
	public int delete(String mapper, Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return baseDao.delete(mapper, parameter);
	}

	
	public T find(String mapper, Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return baseDao.find(mapper, parameter);
	}

	
	public Object findObj(String mapper, Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return baseDao.findObj(mapper, parameter);
	}

	
	public List<T> findList(String mapper, Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return baseDao.findList(mapper, parameter);
	}

	
	public List<Object> findObjList(String mapper, Map<String, Object> parameter) throws Exception {
		// TODO Auto-generated method stub
		return baseDao.findObjList(mapper, parameter);
	}

	
	public Map<String, Map<String, String>> findMap(String statement, Map<String, Object> parameter, String mapper)
			throws Exception {
		// TODO Auto-generated method stub
		return baseDao.findMap(statement, parameter, mapper);
	}

}
