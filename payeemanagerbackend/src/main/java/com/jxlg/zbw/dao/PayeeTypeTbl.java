package com.jxlg.zbw.dao;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: face_work
 * @package: com.jxlg.zbw.dao
 * @filename: TypeTbl.java
 * @create: 2020/07/13 15:14
 * @author: 29314
 * @description: .收款人类型
 **/
@Data
public class PayeeTypeTbl implements Serializable {
    private int type_id;
    private String type_message;

    public PayeeTypeTbl() {
    }

    public PayeeTypeTbl(int type_id, String type_message) {
        this.type_id = type_id;
        this.type_message = type_message;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public String getType_message() {
        return type_message;
    }

    public void setType_message(String type_message) {
        this.type_message = type_message;
    }

    @Override
    public String toString() {
        return "TypeTbl{" +
                "type_id=" + type_id +
                ", type_message='" + type_message + '\'' +
                '}';
    }
}
