package com.cyberVision.mapper;

import com.cyberVision.entity.UserPostDetail;
import com.cyberVision.entity.UserPostDetailExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
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

//    @Select("select * from user_post_detail order by create_time desc")
//    public List<UserPostDetail> selectByPage(@Param("pageNum")int startIndex, @Param("pageSize")int pageNumIn);

}