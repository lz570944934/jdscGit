package org.lanqiao.mapper;

import org.lanqiao.entity.Order;
import org.lanqiao.entity.OrderItem;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrderItemMapper {
    int deleteByPrimaryKey(Integer orderitemId);

    int insert(OrderItem record);

    int insertSelective(OrderItem record);

    OrderItem selectByPrimaryKey(Integer orderitemId);

    int updateByPrimaryKeySelective(OrderItem record);

    int updateByPrimaryKey(OrderItem record);

    OrderItem getSendMsg(Integer orderitemId);

}