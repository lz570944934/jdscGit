package org.lanqiao.entity;

public class GoodsImg {
    private Integer goodsimgId;

    private String goodsimgUrl;

//    private Integer goodsId;

    private Goods goods;

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

//    public Integer getGoodsId() {
//        return goodsId;
//    }
//
//    public void setGoodsId(Integer goodsId) {
//        this.goodsId = goodsId;
//    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }
}