package org.lanqiao.mapper;

import org.lanqiao.entity.GoodsComment;

public interface GoodsCommentMapper {
    int deleteByPrimaryKey(Integer goodscommentId);

    int insert(GoodsComment record);

    int insertSelective(GoodsComment record);

    GoodsComment selectByPrimaryKey(Integer goodscommentId);

    int updateByPrimaryKeySelective(GoodsComment record);

    int updateByPrimaryKey(GoodsComment record);
}