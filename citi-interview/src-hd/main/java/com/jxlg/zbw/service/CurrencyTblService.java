package com.jxlg.zbw.service;

import com.jxlg.zbw.dao.CurrencyTbl;

import java.util.List;

/**
 * @program: face_work
 * @package: com.jxlg.zbw.mapper
 * @filename: CurrencyTblMapper.java
 * @create: 2020/07/15 00:19
 * @author: 29314
 * @description: .
 **/

public interface CurrencyTblService {
    List<CurrencyTbl> findAll();
    int findIdByValue(String currency_type);
    String findValueById(Integer currency_id);
}
