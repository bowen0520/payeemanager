package com.jxlg.zbw.dao;

import lombok.Data;

/**
 * @program: face_work
 * @package: com.jxlg.zbw.dao
 * @filename: BankTbl.java
 * @create: 2020/07/15 00:00
 * @author: 29314
 * @description: .银行类型
 **/
@Data
public class BankTbl {
    private int bank_id;
    private String bank_name;

    public BankTbl() {
    }

    public BankTbl(int bank_id, String bank_name) {
        this.bank_id = bank_id;
        this.bank_name = bank_name;
    }

    public int getBank_id() {
        return bank_id;
    }

    public void setBank_id(int bank_id) {
        this.bank_id = bank_id;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    @Override
    public String toString() {
        return "BankTbl{" +
                "bank_id=" + bank_id +
                ", bank_name='" + bank_name + '\'' +
                '}';
    }
}
