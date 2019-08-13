package org.lanqiao.entity;

public class OrderItem {
    private Integer orderitemId;

    private String goodsbuyName;

    private Integer goodsbuyNumber;

    private Integer goodsbuyPrice;

    private Integer orderId;

    public Integer getOrderitemId() {
        return orderitemId;
    }

    public void setOrderitemId(Integer orderitemId) {
        this.orderitemId = orderitemId;
    }

    public String getGoodsbuyName() {
        return goodsbuyName;
    }

    public void setGoodsbuyName(String goodsbuyName) {
        this.goodsbuyName = goodsbuyName == null ? null : goodsbuyName.trim();
    }

    public Integer getGoodsbuyNumber() {
        return goodsbuyNumber;
    }

    public void setGoodsbuyNumber(Integer goodsbuyNumber) {
        this.goodsbuyNumber = goodsbuyNumber;
    }

    public Integer getGoodsbuyPrice() {
        return goodsbuyPrice;
    }

    public void setGoodsbuyPrice(Integer goodsbuyPrice) {
        this.goodsbuyPrice = goodsbuyPrice;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}