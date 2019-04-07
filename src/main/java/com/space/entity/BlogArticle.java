package com.space.entity;

import java.util.Date;

import org.apache.ibatis.type.Alias;

@Alias("blogArticle")
public class BlogArticle {
    private Integer id;

    private Integer userId;

    private String articleTitle;

    private Date articleDate;

    private Long articleViews;

    private Long articleNumComments;

    private Long articleNumLike;

    private String articleContent;
    
    //多对一 用户
    private User user ;

    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    public Date getArticleDate() {
        return articleDate;
    }

    public void setArticleDate(Date articleDate) {
        this.articleDate = articleDate;
    }

    public Long getArticleViews() {
        return articleViews;
    }

    public void setArticleViews(Long articleViews) {
        this.articleViews = articleViews;
    }

    public Long getArticleNumComments() {
        return articleNumComments;
    }

    public void setArticleNumComments(Long articleNumComments) {
        this.articleNumComments = articleNumComments;
    }

    public Long getArticleNumLike() {
        return articleNumLike;
    }

    public void setArticleNumLike(Long articleNumLike) {
        this.articleNumLike = articleNumLike;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent == null ? null : articleContent.trim();
    }
}