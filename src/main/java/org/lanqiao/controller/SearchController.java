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

    @RequestMapping("/searchgoods")
    public Map searchGoods(){
        List<Goods> goodsList=searchService.searchGoods();
        List<Integer> goodsComment=searchService.goodsCommentCount();
        Map map= new HashMap();
        map.put("goodsComment",goodsComment);
        map.put("goodsList",goodsList);
        return map;
    }

    @RequestMapping("/searchgoodspage")
    public Map searchGoodspage(int pageNum,int pageSize){
        List<Goods> goodsList=searchService.searchGoods();
        List<Integer> goodsComment=searchService.goodsCommentCount();
        Map map= new HashMap();
        map.put("goodsComment",goodsComment);
        map.put("goodsList",goodsList);
        return map;
    }

}
