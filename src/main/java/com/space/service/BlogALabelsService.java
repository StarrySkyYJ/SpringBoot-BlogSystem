package com.space.service;

import java.util.List;

import com.space.entity.BolgArticleLables;

public interface BlogALabelsService extends BaseService<BolgArticleLables> {
	// 保存
	public int saveBAL(String mapper, List<BolgArticleLables> bolgArticleLables) throws Exception;
}
