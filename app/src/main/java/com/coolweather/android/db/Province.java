package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

// 第一张表province：省
public class Province extends DataSupport {

    private int id;

    // 记录省的名字
    private String provinceName;

    // 记录省的代号
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
