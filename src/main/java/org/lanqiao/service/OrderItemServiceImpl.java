package org.lanqiao.service;

import org.lanqiao.entity.OrderItem;
import org.lanqiao.mapper.OrderItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemServiceImpl implements OrderItemService {
    @Autowired
    OrderItemMapper orderItemMapper;

    @Override
    public OrderItem getItems() {
        return orderItemMapper.selectByPrimaryKey(1);
    }

}
