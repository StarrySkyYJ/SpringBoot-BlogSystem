package com.space.entity;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.type.Alias;

@Alias("blogComments")
public class BlogComments {
    private Integer id;

    private Integer userId;

    private Integer articleId;

    private Long commentsNumLike;

    private Date commentsDate;

    private Integer parentCommentsId;

    private String commentsContent;
    
    private User user ;
    
    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	//二级评论集合
    private List<BlogCommentsReply>  blogCommentsReplies;    

    public List<BlogCommentsReply> getBlogCommentsReplies() {
		return blogCommentsReplies;
	}

	public void setBlogCommentsReplies(List<BlogCommentsReply> blogCommentsReplies) {
		this.blogCommentsReplies = blogCommentsReplies;
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

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Long getCommentsNumLike() {
        return commentsNumLike;
    }

    public void setCommentsNumLike(Long commentsNumLike) {
        this.commentsNumLike = commentsNumLike;
    }

    public Date getCommentsDate() {
        return commentsDate;
    }

    public void setCommentsDate(Date commentsDate) {
        this.commentsDate = commentsDate;
    }

    public Integer getParentCommentsId() {
        return parentCommentsId;
    }

    public void setParentCommentsId(Integer parentCommentsId) {
        this.parentCommentsId = parentCommentsId;
    }

    public String getCommentsContent() {
        return commentsContent;
    }

    public void setCommentsContent(String commentsContent) {
        this.commentsContent = commentsContent == null ? null : commentsContent.trim();
    }
}