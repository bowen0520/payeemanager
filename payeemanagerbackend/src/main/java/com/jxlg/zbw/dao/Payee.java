package com.jxlg.zbw.dao;

import lombok.Data;

/**
 * @program: face_work
 * @package: com.jxlg.zbw.dao
 * @filename: Payee.java
 * @create: 2020/07/15 00:05
 * @author: 29314
 * @description: .收款用户
 **/
@Data
public class Payee {
    private int payee_id;
    private String type_message;
    private String payee_name;
    private String account_nickname;
    private String payee_account_number;
    private String to_account_type;
    private String bank_name;
    private String branch_code;
    private String branch_number;
    private String currency_type;
    private String purpose_of_transfer_type;
    private String message;

    public Payee() {
    }

    public String getBranch_number() {
        return branch_number;
    }

    public void setBranch_number(String branch_number) {
        this.branch_number = branch_number;
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

    public String getTo_account_type() {
        return to_account_type;
    }

    public void setTo_account_type(String to_account_type) {
        this.to_account_type = to_account_type;
    }

    public String getBranch_code() {
        return branch_code;
    }

    public void setBranch_code(String branch_code) {
        this.branch_code = branch_code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getPayee_id() {
        return payee_id;
    }

    public String getType_message() {
        return type_message;
    }

    public void setType_message(String type_message) {
        this.type_message = type_message;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getCurrency_type() {
        return currency_type;
    }

    public void setCurrency_type(String currency_type) {
        this.currency_type = currency_type;
    }

    public void setPayee_id(int payee_id) {
        this.payee_id = payee_id;
    }

    public String getPurpose_of_transfer_type() {
        return purpose_of_transfer_type;
    }

    public void setPurpose_of_transfer_type(String purpose_of_transfer_type) {
        this.purpose_of_transfer_type = purpose_of_transfer_type;
    }

    @Override
    public String toString() {
        return "Payee{" +
                "payee_id=" + payee_id +
                ", type_message='" + type_message + '\'' +
                ", payee_name='" + payee_name + '\'' +
                ", account_nickname='" + account_nickname + '\'' +
                ", payee_account_number='" + payee_account_number + '\'' +
                ", to_account_type='" + to_account_type + '\'' +
                ", bank_name='" + bank_name + '\'' +
                ", branch_code='" + branch_code + '\'' +
                ", branch_number='" + branch_number + '\'' +
                ", currency_type='" + currency_type + '\'' +
                ", purpose_of_transfer_type='" + purpose_of_transfer_type + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
