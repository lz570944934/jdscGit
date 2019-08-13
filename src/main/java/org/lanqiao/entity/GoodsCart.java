package org.lanqiao.entity;

public class GoodsCart {
    private Integer goodscartId;

    private String goodscartName;

    private Integer goodscartNumber;

    private Integer goodscartPrice;

    private Integer userId;

    private Integer goodsId;

    public Integer getGoodscartId() {
        return goodscartId;
    }

    public void setGoodscartId(Integer goodscartId) {
        this.goodscartId = goodscartId;
    }

    public String getGoodscartName() {
        return goodscartName;
    }

    public void setGoodscartName(String goodscartName) {
        this.goodscartName = goodscartName == null ? null : goodscartName.trim();
    }

    public Integer getGoodscartNumber() {
        return goodscartNumber;
    }

    public void setGoodscartNumber(Integer goodscartNumber) {
        this.goodscartNumber = goodscartNumber;
    }

    public Integer getGoodscartPrice() {
        return goodscartPrice;
    }

    public void setGoodscartPrice(Integer goodscartPrice) {
        this.goodscartPrice = goodscartPrice;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
}