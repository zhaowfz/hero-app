package com.cn.controller;

import com.alibaba.fastjson.JSONObject;
import com.cn.beans.User;
import com.cn.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import java.util.Objects;

/**
 * Created by ynzha on 2017/8/27.
 */
@Controller
@RequestMapping("/d")
public class HelloController {
    private Logger log = LoggerFactory.getLogger(HelloController.class);
    @Resource
    private IUserService userService;

    @RequestMapping("/obj")
    @ResponseBody
    public User getShopInJSON(@RequestParam String userid) {
        System.out.println("-----返回对象自动转json--------");
        User user = userService.selectByPrimaryKey(userid);
        return user;
    }

    @RequestMapping("/hello")
    public @ResponseBody String hello(@RequestBody Map<String,Object> map) {
        System.out.println("-----返回json字符串--------"+map.toString());
        User user = userService.selectByPrimaryKey("1");
        System.out.print("json数据"+ JSONObject.toJSONString(user));
        return JSONObject.toJSONString(user);

    }

    /**
     * 页面调整
     * @param urlName
     * @return
     */
    @RequestMapping("/page")
    public String toPageftl(@RequestParam("url") String urlName){
        log.debug("动态页面："+urlName);
        return urlName;
    }
}
