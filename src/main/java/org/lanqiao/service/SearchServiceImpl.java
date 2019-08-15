package org.lanqiao.service;

import org.lanqiao.entity.Goods;
import org.lanqiao.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchServiceImpl implements SearchService{

    @Autowired
    GoodsMapper goodsMapper;

    @Override
    public Goods getGoods() {
        return goodsMapper.selectByPrimaryKey(1);
    }

    @Override
    public List<Goods> searchGoods() {
        return goodsMapper.select();
    }

    @Override
    public List<Integer> goodsCommentCount(int pageNum,int pageSize) {
        return goodsMapper.goodsCommentCount();
    }
//    @Override
//    public List<Integer> goodsCommentCount() {
//        return goodsMapper.goodsCommentCount();
//    }
}
