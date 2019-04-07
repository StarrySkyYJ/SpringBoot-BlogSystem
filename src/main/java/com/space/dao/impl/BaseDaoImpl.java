package com.space.dao.impl;


import com.space.dao.BaseDao;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
/*
* BaseDao实现类，使用SqlSessionTemplate 模版
* */
@Repository("daoSupport")
public abstract class BaseDaoImpl<T> implements BaseDao<T>{
    @Resource(name = "sqlSessionTemplate")
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public T save(String mapper, T entity) throws Exception {
        sqlSessionTemplate.insert(mapper,entity);
        return entity;
    }
    
    public int save(String mapper, List<T> entitys) throws Exception{
    	return sqlSessionTemplate.insert(mapper, entitys);
    }
    @Override
    public int save(String mapper, Map<String, Object> parameter) throws Exception {
        return sqlSessionTemplate.insert(mapper,parameter);
    }
    
    public int update(String mapper,T entity)throws Exception {
    	
		return 	sqlSessionTemplate.update(mapper, entity);		    	
    }
    
    @Override
    public int update(String mapper, Map<String, Object> parameter) throws Exception {
        return sqlSessionTemplate.update(mapper,parameter);
    }

    @Override
    public int delete(String mapper, int id) throws Exception {
        return sqlSessionTemplate.delete(mapper,id);
    }

    @Override
    public int delete(String mapper, int[] ids) throws Exception {
        return sqlSessionTemplate.delete(mapper,ids);
    }

    @Override
    public int delete(String mapper, Map<String, Object> parameter) throws Exception {
        return sqlSessionTemplate.delete(mapper,parameter);
    }

    @Override
    public T find(String mapper, Map<String, Object> parameter) throws Exception {
        return sqlSessionTemplate.selectOne(mapper,parameter);
    }

    @Override
    public Object findObj(String mapper, Map<String, Object> parameter) throws Exception {
        return sqlSessionTemplate.selectOne(mapper,parameter);
    }

    @Override
    public List<T> findList(String mapper, Map<String, Object> parameter) throws Exception {
        return sqlSessionTemplate.selectList(mapper,parameter);
    }

    @Override
    public List<Object> findObjList(String mapper, Map<String, Object> parameter) throws Exception {
        return sqlSessionTemplate.selectList(mapper,parameter);
    }

    @Override
    public Map<String, Map<String, String>> findMap(String statement, Map<String, Object> parameter, String mapkey) throws Exception {
        return sqlSessionTemplate.selectMap(statement,parameter,mapkey);
    }
}
