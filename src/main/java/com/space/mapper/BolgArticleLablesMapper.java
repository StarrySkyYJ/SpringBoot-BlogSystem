package com.space.mapper;

import com.space.entity.BolgArticleLables;
import com.space.entity.BolgArticleLablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BolgArticleLablesMapper {
    int countByExample(BolgArticleLablesExample example);

    int deleteByExample(BolgArticleLablesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BolgArticleLables record);

    int insertSelective(BolgArticleLables record);
    
    //批量 添加
    int insertBALList(List<BolgArticleLables> list);

    List<BolgArticleLables> selectByExample(BolgArticleLablesExample example);

    BolgArticleLables selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BolgArticleLables record, @Param("example") BolgArticleLablesExample example);

    int updateByExample(@Param("record") BolgArticleLables record, @Param("example") BolgArticleLablesExample example);

    int updateByPrimaryKeySelective(BolgArticleLables record);

    int updateByPrimaryKey(BolgArticleLables record);
}