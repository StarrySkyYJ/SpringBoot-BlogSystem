package com.space.entity;

import org.apache.ibatis.type.Alias;

@Alias("blogLables")
public class BlogLables {
    private Integer id;

    private String lablesName;

    private String lablesDescription;

    private Integer lablesNumHot;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLablesName() {
        return lablesName;
    }

    public void setLablesName(String lablesName) {
        this.lablesName = lablesName == null ? null : lablesName.trim();
    }

    public String getLablesDescription() {
        return lablesDescription;
    }

    public void setLablesDescription(String lablesDescription) {
        this.lablesDescription = lablesDescription == null ? null : lablesDescription.trim();
    }

    public Integer getLablesNumHot() {
        return lablesNumHot;
    }

    public void setLablesNumHot(Integer lablesNumHot) {
        this.lablesNumHot = lablesNumHot;
    }
}