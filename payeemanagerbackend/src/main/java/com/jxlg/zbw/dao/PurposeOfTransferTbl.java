package com.jxlg.zbw.dao;

import lombok.Data;

/**
 * @program: face_work
 * @package: com.jxlg.zbw.dao
 * @filename: PurposeOfTransferTbl.java
 * @create: 2020/07/15 00:09
 * @author: 29314
 * @description: .转账用途
 **/
@Data
public class PurposeOfTransferTbl {
    private int purpose_of_transfer_id;
    private String purpose_of_transfer_type;

    @Override
    public String toString() {
        return "PurposeOfTransferTbl{" +
                "purpose_of_transfer_id=" + purpose_of_transfer_id +
                ", purpose_of_transfer_type='" + purpose_of_transfer_type + '\'' +
                '}';
    }

    public int getPurpose_of_transfer_id() {
        return purpose_of_transfer_id;
    }

    public void setPurpose_of_transfer_id(int purpose_of_transfer_id) {
        this.purpose_of_transfer_id = purpose_of_transfer_id;
    }

    public String getPurpose_of_transfer_type() {
        return purpose_of_transfer_type;
    }

    public void setPurpose_of_transfer_type(String purpose_of_transfer_type) {
        this.purpose_of_transfer_type = purpose_of_transfer_type;
    }

    public PurposeOfTransferTbl() {
    }

    public PurposeOfTransferTbl(int purpose_of_transfer_id, String purpose_of_transfer_type) {
        this.purpose_of_transfer_id = purpose_of_transfer_id;
        this.purpose_of_transfer_type = purpose_of_transfer_type;
    }
}
