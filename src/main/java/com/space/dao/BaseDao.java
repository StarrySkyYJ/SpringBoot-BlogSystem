package com.space.dao;

import java.util.List;
import java.util.Map;

public interface BaseDao<T> {

    //增
    public T save(String mapper,T entity)throws Exception;
    public int save(String mapper, List<T> entitys) throws Exception;
    public  int save(String mapper,Map<String ,Object> parameter)throws Exception;

    //改
    public int update(String mapper,T entity)throws Exception;
    public int update(String mapper,Map<String ,Object> parameter)throws Exception;

    //删
    public int delete(String mapper,int id)throws Exception;
    public int delete(String mapper,int[] ids)throws Exception;
    public int delete(String mapper,Map<String ,Object> parameter)throws Exception;

    //查
    public T find(String mapper,Map<String ,Object> parameter)throws Exception;
    public Object findObj(String mapper,Map<String ,Object> parameter)throws Exception;
    public List<T> findList(String mapper,Map<String ,Object> parameter)throws Exception;
    public List<Object> findObjList(String mapper,Map<String ,Object> parameter)throws Exception;
    public Map<String, Map<String, String>> findMap(String statement, Map<String, Object> parameter, String mapper) throws Exception;

}
