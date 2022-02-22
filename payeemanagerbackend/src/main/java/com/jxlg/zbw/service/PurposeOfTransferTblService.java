package com.jxlg.zbw.service;

import com.jxlg.zbw.dao.PurposeOfTransferTbl;

import java.util.List;

/**
 * @program: face_work
 * @package: com.jxlg.zbw.mapper
 * @filename: PurposeOfTransferTblMapper.java
 * @create: 2020/07/15 00:23
 * @author: 29314
 * @description: .
 **/

public interface PurposeOfTransferTblService {
    List<PurposeOfTransferTbl> findAll();
    int findIdByValue(String purpose_of_transfer_type);
    String findValueById(Integer purpose_of_transfer_id);
}
