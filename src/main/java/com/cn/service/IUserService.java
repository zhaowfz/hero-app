package com.cn.service;


import com.cn.beans.User;

/**
 * Created by ynzha on 2017/8/27.
 */
public interface IUserService {
    public User selectByPrimaryKey(String userId);

    public int insertSelective(User record);
}