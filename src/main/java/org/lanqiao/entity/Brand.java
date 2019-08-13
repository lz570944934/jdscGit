package org.lanqiao.entity;

public class Brand {
    private Integer brandId;

    private String brandName;

    private String brandNote;

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
}