package org.lanqiao.controller;

import org.lanqiao.entity.Brand;
import org.lanqiao.entity.OrderItem;
import org.lanqiao.entity.User;
import org.lanqiao.entity.UserAddress;
import org.lanqiao.mapper.UserAddressMapper;
import org.lanqiao.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    RecMsgService recMsgService;
    @RequestMapping("/getRecMsg")
    public UserAddress getRecMsg(){
        return recMsgService.getRecMsg();
    }

    @Autowired
    SendMsgService sendMsgService;
    @RequestMapping("/SendMsg")
    public OrderItem getSendMsg(){
        return sendMsgService.getSendMsg();
    }

    @Autowired
    getBrandService getBrandService;
    @RequestMapping("/getBrand")
    public Brand getBrand(){
        return getBrandService.getBrand();
    }

}
