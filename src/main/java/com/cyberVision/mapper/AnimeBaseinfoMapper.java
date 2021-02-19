package com.cyberVision.mapper;

import com.cyberVision.entity.AnimeBaseinfo;

public interface AnimeBaseinfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(AnimeBaseinfo record);

    int insertSelective(AnimeBaseinfo record);

    AnimeBaseinfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AnimeBaseinfo record);

    int updateByPrimaryKey(AnimeBaseinfo record);
}