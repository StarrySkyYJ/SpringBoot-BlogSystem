package com.space.dao;

import java.util.List;

import com.space.entity.BolgArticleLables;

public interface BlogALabelsDao  extends BaseDao<BolgArticleLables>{
	
	//保存
	public int saveBAL(String mapper, List<BolgArticleLables> bolgArticleLables) throws Exception;

}
