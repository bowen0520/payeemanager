package com.jxlg.zbw.dao;

import lombok.Data;

/**
 * @program: face_work
 * @package: com.jxlg.zbw.dao
 * @filename: CurrencyTbl.java
 * @create: 2020/07/15 00:03
 * @author: 29314
 * @description: .货币类型
 **/
@Data
public class CurrencyTbl {
    private int currency_id;
    private String currency_type;

    public CurrencyTbl() {
    }

    public CurrencyTbl(int currency_id, String currency_type) {
        this.currency_id = currency_id;
        this.currency_type = currency_type;
    }

    public int getCurrency_id() {
        return currency_id;
    }

    public void setCurrency_id(int currency_id) {
        this.currency_id = currency_id;
    }

    public String getCurrency_type() {
        return currency_type;
    }

    public void setCurrency_type(String currency_type) {
        this.currency_type = currency_type;
    }

    @Override
    public String toString() {
        return "CurrencyTbl{" +
                "currency_id=" + currency_id +
                ", currency_type='" + currency_type + '\'' +
                '}';
    }
}
