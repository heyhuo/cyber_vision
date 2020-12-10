package com.cyberVision.mapper;

import com.cyberVision.entity.AnimeBaseinfo;

import java.util.List;

public interface AnimeBaseinfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(AnimeBaseinfo record);

    int insertSelective(AnimeBaseinfo record);

    AnimeBaseinfo selectByPrimaryKey(String id);

    List<AnimeBaseinfo> selectAll();

    int updateByPrimaryKeySelective(AnimeBaseinfo record);

    int updateByPrimaryKey(AnimeBaseinfo record);
}