package com.cyberVision.entity;

import java.util.Date;

public class AnimeBaseinfo {
    private String id;

    private String img;

    private Integer seed;

    private String latents;

    private Integer favourNum;

    private Integer glanceNum;

    private Date createDate;

    private Date updateDate;

    private String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getSeed() {
        return seed;
    }

    public void setSeed(Integer seed) {
        this.seed = seed;
    }

    public String getLatents() {
        return latents;
    }

    public void setLatents(String latents) {
        this.latents = latents;
    }

    public Integer getFavourNum() {
        return favourNum;
    }

    public void setFavourNum(Integer favourNum) {
        this.favourNum = favourNum;
    }

    public Integer getGlanceNum() {
        return glanceNum;
    }

    public void setGlanceNum(Integer glanceNum) {
        this.glanceNum = glanceNum;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}