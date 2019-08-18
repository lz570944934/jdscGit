package org.lanqiao.service;

import org.lanqiao.entity.Order;
import org.lanqiao.entity.OrderItem;

import java.util.List;


public interface UserService {
    public Order get(int id);
    public List<OrderItem> Getid();
    public int  updatemoney();
}
