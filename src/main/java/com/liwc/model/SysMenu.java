package com.liwc.model;

public class SysMenu {
    private Integer id;

    private String mCode;

    private String mName;

    private String mUrl;

    private Integer mOrder;

    private Integer mParent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getmCode() {
        return mCode;
    }

    public void setmCode(String mCode) {
        this.mCode = mCode == null ? null : mCode.trim();
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }

    public String getmUrl() {
        return mUrl;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl == null ? null : mUrl.trim();
    }

    public Integer getmOrder() {
        return mOrder;
    }

    public void setmOrder(Integer mOrder) {
        this.mOrder = mOrder;
    }

    public Integer getmParent() {
        return mParent;
    }

    public void setmParent(Integer mParent) {
        this.mParent = mParent;
    }
}