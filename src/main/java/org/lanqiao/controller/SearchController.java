package org.lanqiao.controller;

import org.lanqiao.entity.Goods;
import org.lanqiao.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class SearchController {

    @Autowired
    SearchService searchService;
    //设置路径
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/getgoods")
    public Goods getGoods(){
        return searchService.getGoods();
    }

//    @RequestMapping("/searchgoods")
//    public Map searchGoods(){
//        List<Goods> goodsList=searchService.searchGoods();
//        List<Integer> goodsComment=searchService.goodsCommentCount();
//        Map map= new HashMap();
//        map.put("goodsComment",goodsComment);
//        map.put("goodsList",goodsList);
//        return map;
//    }

    @RequestMapping("/searchgoodspage")
    public Map searchGoodspage(Integer pageNum,Integer pageSize,String goodsInfo){
//        pageNum=1;
//        pageSize=8;
//        goodsInfo="鞋子";
        List<Goods> goodsList=searchService.searchGoods(pageNum,pageSize,goodsInfo);
        List<Integer> goodsComment=searchService.goodsCommentCount(pageNum,pageSize,goodsInfo);
        int goodsCount=searchService.goodsCount(goodsInfo);
        int page=(goodsCount%pageSize==0?goodsCount/pageSize:goodsCount/pageSize+1);
        Map map= new HashMap();
        map.put("goodsComment",goodsComment);//评论数量
        map.put("goodsList",goodsList);//商品信息
        map.put("goodsCount",goodsCount);//商品数量
        map.put("page",page);//页数
        return map;
    }

    @RequestMapping("/findgoodspage")
    public List<Goods> find(String goodsInfo){
        return searchService.find(goodsInfo);
    }
}
