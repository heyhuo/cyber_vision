package com.cyberVision.service.imp;

import com.cyberVision.entity.AnimeBaseinfo;
import com.cyberVision.mapper.AnimeBaseinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.mybatis.dynamic.sql.select.SelectDSL.select;

/**
 * @author heyhuo
 * @create 2020-12-10
 */
@Service
public class AnimeService implements AnimeBaseinfoMapper {

    @Autowired
    private AnimeBaseinfoMapper animeBaseinfoMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    @Override
    public int insert(AnimeBaseinfo record) {
        return 0;
    }

    @Override
    public int insertSelective(AnimeBaseinfo record) {
        return 0;
    }

    @Override
    public AnimeBaseinfo selectByPrimaryKey(String id) {
        return animeBaseinfoMapper.selectByPrimaryKey(id);
    }

//    @Override
//    public List<AnimeBaseinfo> selectAll() {
//        return animeBaseinfoMapper.selectAll();
//    }

    @Override
    public int updateByPrimaryKeySelective(AnimeBaseinfo record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(AnimeBaseinfo record) {
        return 0;
    }
}
