package org.lanqiao.entity;

public class Goods {
    private Integer goodsId;

    private String goodsName;

    private Integer goodsNumber;

    private Integer classifyId;

    private Integer brandId;

    private String goodsNote1;

    private String goodsNote2;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public Integer getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(Integer classifyId) {
        this.classifyId = classifyId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getGoodsNote1() {
        return goodsNote1;
    }

    public void setGoodsNote1(String goodsNote1) {
        this.goodsNote1 = goodsNote1 == null ? null : goodsNote1.trim();
    }

    public String getGoodsNote2() {
        return goodsNote2;
    }

    public void setGoodsNote2(String goodsNote2) {
        this.goodsNote2 = goodsNote2 == null ? null : goodsNote2.trim();
    }
}