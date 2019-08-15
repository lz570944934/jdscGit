package org.lanqiao.entity;

public class GoodsStyle {
    private Integer goodsstyleId;

    private String goodsstyleContent;

    private Integer goodsstylePrice;

//    private Integer goodsId;

    private Goods goods;

    public Integer getGoodsstyleId() {
        return goodsstyleId;
    }

    public void setGoodsstyleId(Integer goodsstyleId) {
        this.goodsstyleId = goodsstyleId;
    }

    public String getGoodsstyleContent() {
        return goodsstyleContent;
    }

    public void setGoodsstyleContent(String goodsstyleContent) {
        this.goodsstyleContent = goodsstyleContent == null ? null : goodsstyleContent.trim();
    }

    public Integer getGoodsstylePrice() {
        return goodsstylePrice;
    }

    public void setGoodsstylePrice(Integer goodsstylePrice) {
        this.goodsstylePrice = goodsstylePrice;
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