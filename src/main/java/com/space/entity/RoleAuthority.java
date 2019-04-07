package com.space.entity;

import org.apache.ibatis.type.Alias;

@Alias("roleAuthority")
public class RoleAuthority {
    private Integer id;

    private Integer role;

    private String authorities;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getAuthorities() {
        return authorities;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities == null ? null : authorities.trim();
    }
}