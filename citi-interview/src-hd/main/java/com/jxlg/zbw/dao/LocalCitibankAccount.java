package com.jxlg.zbw.dao;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: face_work
 * @package: com.jxlg.zbw.dao
 * @filename: Local_Citibank_Account.java
 * @create: 2020/07/13 14:30
 * @author: 29314
 * @description: .本地花旗账户
 **/
@Data
public class LocalCitibankAccount implements Serializable {
    private int payee_id;
    private String payee_type;
    private String payee_name;
    private String account_nickname;
    private String payee_account_number;
    private String purpose_of_transfer;
    private String message;

    public LocalCitibankAccount() {
    }

    public LocalCitibankAccount(int payee_id, String payee_type, String payee_name, String account_nickname, String payee_account_number, String purpose_of_transfer, String message) {
        this.payee_id = payee_id;
        this.payee_type = payee_type;
        this.payee_name = payee_name;
        this.account_nickname = account_nickname;
        this.payee_account_number = payee_account_number;
        this.purpose_of_transfer = purpose_of_transfer;
        this.message = message;
    }

    public int getPayee_id() {
        return payee_id;
    }

    public void setPayee_id(int payee_id) {
        this.payee_id = payee_id;
    }

    public String getPayee_type() {
        return payee_type;
    }

    public void setPayee_type(String payee_type) {
        this.payee_type = payee_type;
    }

    public String getPayee_name() {
        return payee_name;
    }

    public void setPayee_name(String payee_name) {
        this.payee_name = payee_name;
    }

    public String getAccount_nickname() {
        return account_nickname;
    }

    public void setAccount_nickname(String account_nickname) {
        this.account_nickname = account_nickname;
    }

    public String getPayee_account_number() {
        return payee_account_number;
    }

    public void setPayee_account_number(String payee_account_number) {
        this.payee_account_number = payee_account_number;
    }

    public String getPurpose_of_transfer() {
        return purpose_of_transfer;
    }

    public void setPurpose_of_transfer(String purpose_of_transfer) {
        this.purpose_of_transfer = purpose_of_transfer;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "LocalCitibankAccount{" +
                "payee_id=" + payee_id +
                ", payee_type='" + payee_type + '\'' +
                ", payee_name='" + payee_name + '\'' +
                ", account_nickname='" + account_nickname + '\'' +
                ", payee_account_number='" + payee_account_number + '\'' +
                ", purpose_of_transfer='" + purpose_of_transfer + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
