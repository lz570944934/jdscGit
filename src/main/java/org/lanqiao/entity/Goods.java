package org.lanqiao.entity;

public class Goods {
    private Integer goodsId;

    private String goodsName;

    private Integer goodsNumber;

    private Integer goodsnote1;

    private Integer goodsNote2;

    private Integer classifyId;

    private Integer brandId;

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

    public Integer getGoodsnote1() { return goodsnote1; }

    public void setGoodsnote1(Integer goodsnote1) { this.goodsnote1 = goodsnote1; }

    public Integer getGoodsNote2() { return goodsNote2; }

    public void setGoodsNote2(Integer goodsNote2) { this.goodsNote2 = goodsNote2; }
}