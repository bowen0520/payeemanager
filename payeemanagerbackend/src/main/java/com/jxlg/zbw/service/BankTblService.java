package com.jxlg.zbw.service;

import com.jxlg.zbw.dao.BankTbl;

import java.util.List;

/**
 * @program: face_work
 * @package: com.jxlg.zbw.service
 * @filename: BankTblService.java
 * @create: 2020/07/15 00:47
 * @author: 29314
 * @description: .
 **/

public interface BankTblService {
    List<BankTbl> findAll();
    int findIdByValue(String bank_name);
    String findValueById(Integer bank_id);
}
