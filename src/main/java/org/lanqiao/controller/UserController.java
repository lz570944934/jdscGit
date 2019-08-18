package org.lanqiao.controller;


import org.lanqiao.entity.Order;
import org.lanqiao.entity.OrderItem;
import org.lanqiao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/get")
    public List<OrderItem> Get() {
        return userService.Getid();
    }

    @ResponseBody
    @RequestMapping("/setsj")
    public int gengxin(){
        return userService.updatemoney();
    }
}