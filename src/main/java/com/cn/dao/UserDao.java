package com.cn.dao;

import com.cn.beans.User;

public interface UserDao {
    int deleteByPrimaryKey(String userNo);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userNo);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}