package com.space.plugin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.RequestToViewNameTranslator;

import com.space.util.RedisUtil;


@Component("redisPlugin")
public class RedisPlugin {

	@Resource(name="stringRedisTemplate")
	private StringRedisTemplate redisTemplate ;
	
	@Resource
	private RedisUtil redisUtil;
	
	/**
	 * string类型
	 * @param key
	 * @param value
	 */
	//插入
	public void add(String key ,String value) {
		this.redisTemplate.opsForValue().set(key, value);
	}
	//获取
	public String get(String key) {
		return this.redisTemplate.opsForValue().get(key);
	}
	//删除
	public void delete(String key) {
		this.redisTemplate.delete(key);
	}
	
	/**
	 * hash 类型
	 * 作用： 保存每一条留言信息
	 * 
	 * @param key
	 * @param value
	 */
	//单个添加
	public void hashPut(String key,String hashKey ,String value) {
		this.redisTemplate.opsForHash().put(key, hashKey, value);
	}
	
	//添加多个 map：hashKey-value
	//昵称+时间作为key ；标题、邮箱等为hashkey ；值为value 
	public void hashPutALL(String key ,HashMap< String, String> m) {
		this.redisTemplate.opsForHash().putAll(key, m);
	}
	
	//获取 map值 key-value
	public Map<Object, Object> getHashMap(String key){
		return this.redisTemplate.opsForHash().entries(key);
	}
	
	/*
	 * list 类型
	 *  按顺序保存及取出数据
	 */
	//从右边保存数据;即 尾部添加数据 ; 先进先出
	public void rListPush(String value) {
		this.redisTemplate.opsForList().rightPush(redisUtil.getLIST_REDIS_KEY(), value);
	}
	
	//从左边保存数据; 即 首部添加数据，先进后出
	public void lListPush(String value) {
		this.redisTemplate.opsForList().leftPush(redisUtil.getLIST_REDIS_KEY(), value);
	}
	
	//元素个数
	public long getListLen() {
		long size = this.redisTemplate.opsForList().size(redisUtil.getLIST_REDIS_KEY());
		return size ;
	}
	//取出数据
	public List<String> getList() {
		List<String> list = new ArrayList<>();
		list = this.redisTemplate.opsForList().range(redisUtil.getLIST_REDIS_KEY(), 0, getListLen());
		return list ;
	}
}
 