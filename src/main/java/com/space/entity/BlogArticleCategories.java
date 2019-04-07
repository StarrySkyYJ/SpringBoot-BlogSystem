package com.space.entity;

import org.apache.ibatis.type.Alias;

@Alias("blogArticleCategories")
public class BlogArticleCategories {
    private Integer id;

    private Integer articleId;

    private Integer categories;

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

    public Integer getCategories() {
        return categories;
    }

    public void setCategories(Integer categories) {
        this.categories = categories;
    }
}