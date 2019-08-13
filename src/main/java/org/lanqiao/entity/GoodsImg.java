package org.lanqiao.entity;

public class GoodsImg {
    private Integer goodsimgId;

    private String goodsimgUrl;

    private Integer goodsId;

    public Integer getGoodsimgId() {
        return goodsimgId;
    }

    public void setGoodsimgId(Integer goodsimgId) {
        this.goodsimgId = goodsimgId;
    }

    public String getGoodsimgUrl() {
        return goodsimgUrl;
    }

    public void setGoodsimgUrl(String goodsimgUrl) {
        this.goodsimgUrl = goodsimgUrl == null ? null : goodsimgUrl.trim();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
}