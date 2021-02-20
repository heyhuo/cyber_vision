package com.cyberVision.entity;

import java.util.Date;

public class UserPostDetail {
    private String postId;

    private String userId;

    private String content;

    private String picBasePath;

    private String picPathList;

    private String thumbPath;

    private String tagList;

    private String atUserList;

    private String musicPath;

    private String latitude;

    private String longitude;

    private String postLocation;

    private Integer readNum;

    private Integer likeNum;

    private Integer commentNum;

    private Date createTime;

    private Date updateTime;

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPicBasePath() {
        return picBasePath;
    }

    public void setPicBasePath(String picBasePath) {
        this.picBasePath = picBasePath;
    }

    public String getPicPathList() {
        return picPathList;
    }

    public void setPicPathList(String picPathList) {
        this.picPathList = picPathList;
    }

    public String getThumbPath() {
        return thumbPath;
    }

    public void setThumbPath(String thumbPath) {
        this.thumbPath = thumbPath;
    }

    public String getTagList() {
        return tagList;
    }

    public void setTagList(String tagList) {
        this.tagList = tagList;
    }

    public String getAtUserList() {
        return atUserList;
    }

    public void setAtUserList(String atUserList) {
        this.atUserList = atUserList;
    }

    public String getMusicPath() {
        return musicPath;
    }

    public void setMusicPath(String musicPath) {
        this.musicPath = musicPath;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getPostLocation() {
        return postLocation;
    }

    public void setPostLocation(String postLocation) {
        this.postLocation = postLocation;
    }

    public Integer getReadNum() {
        return readNum;
    }

    public void setReadNum(Integer readNum) {
        this.readNum = readNum;
    }

    public Integer getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }

    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}