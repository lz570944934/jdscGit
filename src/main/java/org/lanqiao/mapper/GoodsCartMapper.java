package org.lanqiao.mapper;

import org.lanqiao.entity.GoodsCart;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsCartMapper {
    int deleteByPrimaryKey(Integer goodscartId);

    int insert(GoodsCart record);

    int insertSelective(GoodsCart record);

    GoodsCart selectByPrimaryKey(Integer goodscartId);

    int updateByPrimaryKeySelective(GoodsCart record);

    int updateByPrimaryKey(GoodsCart record);
}