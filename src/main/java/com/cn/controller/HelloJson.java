package com.cn.controller;

import com.alibaba.fastjson.JSONObject;
import com.cn.beans.Result;
import com.cn.beans.User;
import com.cn.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by ynzha on 2017/8/29.
 */

@RestController
@RequestMapping("/do")
public class HelloJson {
    private Logger log = LoggerFactory.getLogger(HelloJson.class);
    @Resource
    private IUserService userService;

    @RequestMapping(value = "/{userid}", method = RequestMethod.GET)
    public User hello(@RequestParam("userid") String userid) {
        System.out.println("-----返回json字符串--------");

        User user = userService.selectByPrimaryKey(userid);
        System.out.print("json数据"+ JSONObject.toJSONString(user));
        return user;
    }

    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public User hello(@RequestBody Map<String,String> map) {
        System.out.println("-----返回json字符串--------"+map.toString());
        String userid = map.get("userid");
        User user = userService.selectByPrimaryKey(userid);
        System.out.print("json数据"+ JSONObject.toJSONString(user));
        return user;
    }
    @RequestMapping(value = "/del", method = RequestMethod.POST)
    public Result delStuById(@RequestBody Map<String,String> map) {
        String userid = map.get("userid");
        User user = userService.selectByPrimaryKey(userid);
        System.out.print("json数据"+ JSONObject.toJSONString(user));
        return new Result(200, "删除操作成功");
    }
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Result addAStu(User map) {
        String userid = map.getUserNo();
        User user = userService.selectByPrimaryKey(userid);
        System.out.print("json数据"+ JSONObject.toJSONString(user));
        return new Result(200, "添加成功。");
    }

    @RequestMapping(value="/up",method = RequestMethod.POST)
    public Result updateStu(User map){
        String userid = map.getUserNo();
        User user = userService.selectByPrimaryKey(userid);
        System.out.print("json数据" + JSONObject.toJSONString(user));
        return new Result(200, "更新成功。");
    }


}
