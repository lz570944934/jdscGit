package org.lanqiao.entity;

import java.util.Set;

public class Goods {
    private Integer goodsId;

    private String goodsName;

    private Integer goodsNumber;

//    private Integer classifyId;
//
//    private Integer brandId;

    private Brand brand;
    private Classify classify;
    private Set<GoodsStyle> setGoodsStyle;
    private Set<GoodsImg> setGoodsImg;
    private Set<GoodsComment> setGoodsComment;
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

    public String getGoodsNote1() {
        return goodsNote1;
    }

    public void setGoodsNote1(String goodsNote1) {
        this.goodsNote1 = goodsNote1;
    }

    public String getGoodsNote2() {
        return goodsNote2;
    }

    public void setGoodsNote2(String goodsNote2) {
        this.goodsNote2 = goodsNote2;
    }

    //    public Integer getClassifyId() {
//        return classifyId;
//    }
//
//    public void setClassifyId(Integer classifyId) {
//        this.classifyId = classifyId;
//    }
//
//    public Integer getBrandId() {
//        return brandId;
//    }
//
//    public void setBrandId(Integer brandId) {
//        this.brandId = brandId;
//    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Classify getClassify() {
        return classify;
    }

    public void setClassify(Classify classify) {
        this.classify = classify;
    }

    public Set<GoodsStyle> getSetGoodsStyle() {
        return setGoodsStyle;
    }

    public void setSetGoodsStyle(Set<GoodsStyle> setGoodsStyle) {
        this.setGoodsStyle = setGoodsStyle;
    }

    public Set<GoodsImg> getSetGoodsImg() {
        return setGoodsImg;
    }

    public void setSetGoodsImg(Set<GoodsImg> setGoodsImg) {
        this.setGoodsImg = setGoodsImg;
    }

    public Set<GoodsComment> getSetGoodsComment() {
        return setGoodsComment;
    }

    public void setSetGoodsComment(Set<GoodsComment> setGoodsComment) {
        this.setGoodsComment = setGoodsComment;
    }
}