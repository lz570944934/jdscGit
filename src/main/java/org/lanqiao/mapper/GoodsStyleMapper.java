package org.lanqiao.mapper;

import org.lanqiao.entity.GoodsStyle;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsStyleMapper {
    int deleteByPrimaryKey(Integer goodsstyleId);

    int insert(GoodsStyle record);

    int insertSelective(GoodsStyle record);

    GoodsStyle selectByPrimaryKey(Integer goodsstyleId);

    int updateByPrimaryKeySelective(GoodsStyle record);

    int updateByPrimaryKey(GoodsStyle record);
}