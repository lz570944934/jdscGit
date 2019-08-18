package org.lanqiao.mapper;

import org.apache.ibatis.annotations.Param;
import org.lanqiao.entity.Goods;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsMapper {
    int deleteByPrimaryKey(Integer goodsId);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer goodsId);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

//    List<Goods> select();
    List<Goods> select(@Param("num")Integer num,@Param("pageSize")Integer pageSize,@Param("goodsInfo")String goodsInfo);//分页

    List<Integer> goodsCommentCount(@Param("num")Integer num,@Param("pageSize")Integer pageSize,@Param("goodsInfo")String goodsInfo);//评论数量
    int goodsCount(@Param("goodsInfo")String goodsInfo);//商品数量
    List<Goods> find(@Param("goodsInfo")String goodsInfo);//商品查询
}