package org.lanqiao.controller;

import org.lanqiao.entity.Brand;
import org.lanqiao.entity.OrderItem;
import org.lanqiao.entity.User;
import org.lanqiao.entity.UserAddress;
import org.lanqiao.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    ReseveMsgService reseveMsgService;

    @RequestMapping("/reMsg")
    public UserAddress getReseveMsg(){

        return reseveMsgService.getReseveMsg();


    }





    @Autowired
    OrderItemService orderItemService;

    //调数据库中orderItem的一条数据
    @RequestMapping("/getItem")
    public OrderItem getItem() {
        return orderItemService.getItems();
    }


    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    //调数据库中brand的一条数据
    @Autowired
    BrandService brandService;

    @RequestMapping("/getBrand")
    public Brand getBrand(){
        return brandService.getBrand();
    }

    //调取数据库中所有的user数据
    @Autowired
    UserService userService;

    @RequestMapping("/getUser")
    public List<User> getUser(){
        return userService.getAllUser();
    }




}
