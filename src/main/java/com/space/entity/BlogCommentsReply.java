package com.space.entity;

import java.util.Date;

import org.apache.ibatis.type.Alias;

@Alias("blogCommentsReply")
public class BlogCommentsReply {
    private Integer id;

    private Integer blogId;

    private Integer userId;

    private Integer replgUserId;

    private String content;

    private Integer contentNumLike;

    private Date createtime;

    private Date updatetime;
    
    //回复评论的用户（查询用户名及 头像）
    private User user;  
    
    //被回复评论的用户： 评论用户： 被回复评论的用户（查询昵称）
    private User replyUser ;
    
    public User getReplyUser() {
		return replyUser;
	}

	public void setReplyUser(User replyUser) {
		this.replyUser = replyUser;
	}

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

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getReplgUserId() {
        return replgUserId;
    }

    public void setReplgUserId(Integer replgUserId) {
        this.replgUserId = replgUserId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getContentNumLike() {
        return contentNumLike;
    }

    public void setContentNumLike(Integer contentNumLike) {
        this.contentNumLike = contentNumLike;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}