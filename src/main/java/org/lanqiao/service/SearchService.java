package org.lanqiao.service;

import org.lanqiao.entity.Goods;

import java.util.List;

public interface SearchService {
    public Goods getGoods();
    public List<Goods> searchGoods();
//    public List<Integer> goodsCommentCount();
    public List<Integer> goodsCommentCount(int pageNum,int pageSize);
}
