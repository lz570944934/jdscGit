package org.lanqiao.mapper;

import org.lanqiao.entity.GoodsImg;

public interface GoodsImgMapper {
    int deleteByPrimaryKey(Integer goodsimgId);

    int insert(GoodsImg record);

    int insertSelective(GoodsImg record);

    GoodsImg selectByPrimaryKey(Integer goodsimgId);

    int updateByPrimaryKeySelective(GoodsImg record);

    int updateByPrimaryKey(GoodsImg record);
}