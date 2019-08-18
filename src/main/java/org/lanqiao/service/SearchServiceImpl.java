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
    public List<Goods> searchGoods(Integer pageNum,Integer pageSize,String goodsInfo) {
        return goodsMapper.select((pageNum-1)*pageSize,pageSize,goodsInfo);
    }
//    @Override
//    public List<Goods> searchGoods() {
//        return goodsMapper.select();
//    }

    @Override
    public List<Integer> goodsCommentCount(Integer pageNum,Integer pageSize,String goodsInfo) {
        return goodsMapper.goodsCommentCount((pageNum-1)*pageSize,pageSize,goodsInfo);
    }

    @Override
    public int goodsCount(String goodsInfo) {
        return goodsMapper.goodsCount(goodsInfo);
    }

    @Override
    public List<Goods> find(String goodsInfo) {
        return goodsMapper.find(goodsInfo);
    }
//    @Override
//    public List<Integer> goodsCommentCount() {
//        return goodsMapper.goodsCommentCount();
//    }
}
