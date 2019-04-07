package com.space.entity;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.type.Alias;
import org.springframework.format.annotation.DateTimeFormat;

import com.space.util.DateTimeUtil;

@Alias("user")
public class User {
    private Integer id;

    private String username;

    private String password;

    private String sex;

    private String birthday;

    private String mobile;

    private String email;

    private String address;

    private String headImgUrl;

    private String description;

    //前端 传入的是String 类型； 配置转换
    @DateTimeFormat(pattern=DateTimeUtil.PATTERN_TIME)
    private Date registerTime;

    private Date lastUpdateBlog;

    private Integer vipPoint;

    private Integer vipRank;

    private Integer vipPermission;
    
    private List<BlogArticle> blogArticles;    
    
    public List<BlogArticle> getBlogArticles() {
		return blogArticles;
	}

	public void setBlogArticles(List<BlogArticle> blogArticles) {
		this.blogArticles = blogArticles;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl == null ? null : headImgUrl.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Date getLastUpdateBlog() {
        return lastUpdateBlog;
    }

    public void setLastUpdateBlog(Date lastUpdateBlog) {
        this.lastUpdateBlog = lastUpdateBlog;
    }

    public Integer getVipPoint() {
        return vipPoint;
    }

    public void setVipPoint(Integer vipPoint) {
        this.vipPoint = vipPoint;
    }

    public Integer getVipRank() {
        return vipRank;
    }

    public void setVipRank(Integer vipRank) {
        this.vipRank = vipRank;
    }

    public Integer getVipPermission() {
        return vipPermission;
    }

    public void setVipPermission(Integer vipPermission) {
        this.vipPermission = vipPermission;
    }
}