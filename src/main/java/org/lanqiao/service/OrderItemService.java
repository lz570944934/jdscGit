package org.lanqiao.service;

import org.lanqiao.entity.OrderItem;

import java.util.List;

public interface OrderItemService {

    public OrderItem getItems();

    public List<OrderItem> getAllOrderItem();

}
