package org.lanqiao.entity;

import java.util.Set;

public class Classify {
    private Integer classifyId;

    private String classifyName;

    private Set<Goods> setGoods;

    public Integer getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(Integer classifyId) {
        this.classifyId = classifyId;
    }

    public String getClassifyName() {
        return classifyName;
    }

    public void setClassifyName(String classifyName) {
        this.classifyName = classifyName == null ? null : classifyName.trim();
    }

    public Set<Goods> getSetGoods() {
        return setGoods;
    }

    public void setSetGoods(Set<Goods> setGoods) {
        this.setGoods = setGoods;
    }
}