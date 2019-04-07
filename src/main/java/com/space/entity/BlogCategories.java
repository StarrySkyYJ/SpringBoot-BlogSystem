package com.space.entity;

import java.util.List;

import org.apache.ibatis.type.Alias;

@Alias("blogCategories")
public class BlogCategories {
    private Integer id;

    private String categoriesName;

    private String categoriesDescription;
    
    private List<BlogArticle> blogArticles; //文章
      
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

    public String getCategoriesName() {
        return categoriesName;
    }

    public void setCategoriesName(String categoriesName) {
        this.categoriesName = categoriesName == null ? null : categoriesName.trim();
    }

    public String getCategoriesDescription() {
        return categoriesDescription;
    }

    public void setCategoriesDescription(String categoriesDescription) {
        this.categoriesDescription = categoriesDescription == null ? null : categoriesDescription.trim();
    }
}