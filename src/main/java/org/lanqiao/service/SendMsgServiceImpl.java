package org.lanqiao.service;

import org.lanqiao.entity.OrderItem;
import org.lanqiao.mapper.OrderItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SendMsgServiceImpl implements SendMsgService {

    @Autowired
    OrderItemMapper orderItemMapper;

    @Override
    public OrderItem getSendMsg() {
        return orderItemMapper.getSendMsg(1);
    }
}
