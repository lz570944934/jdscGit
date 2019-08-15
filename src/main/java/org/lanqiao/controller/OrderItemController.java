package org.lanqiao.controller;

import org.lanqiao.entity.OrderItem;
import org.lanqiao.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderItemController {

    @Autowired
    OrderItemService orderItemService;

    @RequestMapping("/getItem")
    public OrderItem getItem() {
        return orderItemService.getItems();
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

}
