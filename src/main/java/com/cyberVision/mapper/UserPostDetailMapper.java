package com.cyberVision.mapper;

import com.cyberVision.entity.UserPostDetail;
import com.cyberVision.entity.UserPostDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPostDetailMapper {
    long countByExample(UserPostDetailExample example);

    int deleteByExample(UserPostDetailExample example);

    int deleteByPrimaryKey(String postId);

    int insert(UserPostDetail record);

    int insertSelective(UserPostDetail record);

    List<UserPostDetail> selectByExample(UserPostDetailExample example);

    UserPostDetail selectByPrimaryKey(String postId);

    int updateByExampleSelective(@Param("record") UserPostDetail record, @Param("example") UserPostDetailExample example);

    int updateByExample(@Param("record") UserPostDetail record, @Param("example") UserPostDetailExample example);

    int updateByPrimaryKeySelective(UserPostDetail record);

    int updateByPrimaryKey(UserPostDetail record);
}