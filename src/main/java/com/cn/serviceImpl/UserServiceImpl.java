package com.cn.serviceImpl;

import com.cn.beans.User;
import com.cn.dao.UserDao;
import com.cn.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by ynzha on 2017/8/27.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private UserDao userDao;

    @Override
    public User selectByPrimaryKey(String userId) {
        // TODO Auto-generated method stub
        return this.userDao.selectByPrimaryKey(userId);
    }

    @Override
    public int insertSelective(User user) {
        return this.userDao.insertSelective(user);
    }

}