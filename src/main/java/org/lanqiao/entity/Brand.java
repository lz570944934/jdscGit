package org.lanqiao.entity;

import java.util.Set;

public class Brand {
    private Integer brandId;

    private String brandName;

    private String brandNote;

    private Set<Goods> setGoods;

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public String getBrandNote() {
        return brandNote;
    }

    public void setBrandNote(String brandNote) {
        this.brandNote = brandNote == null ? null : brandNote.trim();
    }

    public Set<Goods> getSetGoods() {
        return setGoods;
    }

    public void setSetGoods(Set<Goods> setGoods) {
        this.setGoods = setGoods;
    }
}