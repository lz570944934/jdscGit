package org.lanqiao.mapper;

import org.lanqiao.entity.GoodsCart;

public interface GoodsCartMapper {
    int deleteByPrimaryKey(Integer goodscartId);

    int insert(GoodsCart record);

    int insertSelective(GoodsCart record);

    GoodsCart selectByPrimaryKey(Integer goodscartId);

    int updateByPrimaryKeySelective(GoodsCart record);

    int updateByPrimaryKey(GoodsCart record);
}