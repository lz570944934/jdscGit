package org.lanqiao.entity;

import java.util.Date;

public class GoodsComment {
    private Integer goodscommentId;

    private Integer goodscommentLevel;

    private String goodscommentContent;

    private Date goodscommentTime;

    private String goodscommentUrl;

    private Integer goodsId;

    private Integer userId;

    private Integer orderId;

    public Integer getGoodscommentId() {
        return goodscommentId;
    }

    public void setGoodscommentId(Integer goodscommentId) {
        this.goodscommentId = goodscommentId;
    }

    public Integer getGoodscommentLevel() {
        return goodscommentLevel;
    }

    public void setGoodscommentLevel(Integer goodscommentLevel) {
        this.goodscommentLevel = goodscommentLevel;
    }

    public String getGoodscommentContent() {
        return goodscommentContent;
    }

    public void setGoodscommentContent(String goodscommentContent) {
        this.goodscommentContent = goodscommentContent == null ? null : goodscommentContent.trim();
    }

    public Date getGoodscommentTime() {
        return goodscommentTime;
    }

    public void setGoodscommentTime(Date goodscommentTime) {
        this.goodscommentTime = goodscommentTime;
    }

    public String getGoodscommentUrl() {
        return goodscommentUrl;
    }

    public void setGoodscommentUrl(String goodscommentUrl) {
        this.goodscommentUrl = goodscommentUrl == null ? null : goodscommentUrl.trim();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}