package com.jxlg.zbw.mapper;

import com.jxlg.zbw.dao.BankTbl;

import java.util.List;

/**
 * @program: face_work
 * @package: com.jxlg.zbw.mapper
 * @filename: BankTblMapper.java
 * @create: 2020/07/15 00:11
 * @author: 29314
 * @description: .
 **/

public interface BankTblMapper {
    List<BankTbl> findAll();

    int findIdByValue(String bank_name);

    String findValueById(Integer bank_id);
}
