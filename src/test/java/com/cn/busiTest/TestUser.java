package com.cn.busiTest;

import javax.annotation.Resource;

import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.cn.beans.User;
import com.cn.service.IUserService;

import java.util.Objects;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})

public class TestUser {
    private static Logger logger = Logger.getLogger(TestUser.class);
    //	private ApplicationContext ac = null;
    @Resource
    private IUserService userService = null;

//	@Before
//	public void before() {
//		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		userService = (IUserService) ac.getBean("userService");
//	}

    @Test
    public void test1() {
        User user = userService.selectByPrimaryKey("1");

        // System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        logger.info(JSONObject.toJSONString(user));
        System.out.println(JSONObject.toJSONString(user));
        User u = new User();
        u.setUserNo("5");
        u.setUserName("滚犊子");
        u.setUserPassword("123");
        u.setUserHeadImg("他奶奶的大头鬼");
        int mak = userService.insertSelective(u);
        System.out.println(mak);
    }
}