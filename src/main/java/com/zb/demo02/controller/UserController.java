package com.zb.demo02.controller;

import com.zb.demo02.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Value("${server.port}")
    String port;

    @Autowired
    UserService us;

    @RequestMapping("hi")
    public String hello(){
        System.out.println("当前端口："+port);
        return "hello";
    }

    @RequestMapping("list")
    public List<Map> list(@RequestParam Map map){
        System.out.println(map);
        return  us.list(map);
    }

    @RequestMapping("/getAllRoles")
    public List<Map> getAllRoles(){
        return us.getAllRoles();
    }

    @RequestMapping("/save")
    public int save(@RequestParam Map map){
        System.out.println(map);
        return us.save(map);
    }
}
