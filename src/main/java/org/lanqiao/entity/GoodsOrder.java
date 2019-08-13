package org.lanqiao.entity;

public class GoodsOrder {
    private Integer goodsOrderId;

    private Integer goodsId;

    private Integer orderId;

    public Integer getGoodsOrderId() {
        return goodsOrderId;
    }

    public void setGoodsOrderId(Integer goodsOrderId) {
        this.goodsOrderId = goodsOrderId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}