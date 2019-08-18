package org.lanqiao.service;

import org.lanqiao.entity.Goods;

import java.util.List;

public interface SearchService {
    public Goods getGoods();
    public List<Goods> searchGoods(Integer pageNum,Integer pageSize,String goodsInfo);
//    public List<Goods> searchGoods();
    public List<Integer> goodsCommentCount(Integer pageNum,Integer pageSize,String goodsInfo);
    public int goodsCount(String goodsInfo);
    public List<Goods> find(String goodsInfo);
}
