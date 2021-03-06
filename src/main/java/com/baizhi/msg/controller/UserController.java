package com.baizhi.msg.controller;

import com.baizhi.msg.entity.User;
import com.baizhi.msg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("queryAll")
    public String queryAll(String name, Map map) {
        List<User> list = userService.queryAll(name);
        map.put("userlist", list);
        System.out.println("黄河,黄河,我是长江");
        System.out.println("黄河");
        System.out.println("长江,长江,我是黄河");
        return "index";
    }
}
