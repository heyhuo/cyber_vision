package com.cyberVision.service.imp;

import com.cyberVision.entity.UserPostDetail;
import com.cyberVision.entity.UserPostDetailExample;
import com.cyberVision.mapper.UserPostDetailMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author heyhuo
 * @create 2021-02-18
 */
@Service
public class UserPostDetailService implements UserPostDetailMapper {
    @Autowired
    private UserPostDetailMapper userPostDetailMapper;

    @Override
    public long countByExample(UserPostDetailExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(UserPostDetailExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(String postId) {
        return 0;
    }

    @Override
    public int insert(UserPostDetail record) {
        userPostDetailMapper.insert(record);
        return 1;
    }

    @Override
    public int insertSelective(UserPostDetail record) {
        return userPostDetailMapper.insertSelective(record);
    }

    @Override
    public List<UserPostDetail> selectByExample(UserPostDetailExample example) {
        return userPostDetailMapper.selectByExample(example);
    }

    @Override
    public UserPostDetail selectByPrimaryKey(String postId) {
        return null;
    }

    @Override
    public int updateByExampleSelective(UserPostDetail record, UserPostDetailExample example) {
        return 0;
    }

    @Override
    public int updateByExample(UserPostDetail record, UserPostDetailExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(UserPostDetail record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(UserPostDetail record) {
        return 0;
    }

    public List<UserPostDetail> selectByPage(Map<String, String> params) {

        int page = Integer.parseInt(params.get("page"));
        int size = Integer.parseInt(params.get("size"));
        UserPostDetailExample example = new UserPostDetailExample();
        UserPostDetailExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("create_time DESC");
        PageHelper.startPage(page,size);

        return userPostDetailMapper.selectByExample(example);
    }
}
