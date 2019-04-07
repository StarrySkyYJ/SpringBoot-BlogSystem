package com.space.entity;

import org.apache.ibatis.type.Alias;

@Alias("bolgArticleLables")
public class BolgArticleLables {
    private Integer id;

    private Integer articleId;

    private Integer lableId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getLableId() {
        return lableId;
    }

    public void setLableId(Integer lableId) {
        this.lableId = lableId;
    }
}