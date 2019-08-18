package org.lanqiao.service;

import org.lanqiao.entity.Order;
import org.lanqiao.entity.OrderItem;
import org.lanqiao.mapper.OrderItemMapper;
import org.lanqiao.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    OrderMapper orderMapper;

    @Autowired
    OrderItemMapper orderItemMapper;

    @Override
    public Order get(int id) {
        return orderMapper.get();
    }

    @Override
    public List<OrderItem> Getid() {
        return (List<OrderItem>) orderItemMapper.Get();
    }

    @Override
    public int updatemoney(){
        return orderItemMapper.updateitem();
    }
}
