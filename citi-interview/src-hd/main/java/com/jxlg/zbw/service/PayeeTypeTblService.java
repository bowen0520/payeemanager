package com.jxlg.zbw.service;

import com.jxlg.zbw.dao.PayeeTypeTbl;

import java.util.List;

/**
 * @program: face_work
 * @package: com.jxlg.zbw.service
 * @filename: PayeeTypeTblService.java
 * @create: 2020/07/13 15:43
 * @author: 29314
 * @description: .
 **/

public interface PayeeTypeTblService {
    List<PayeeTypeTbl> findAll();

    int findIdByValue(String type_message);
    String findValueById(Integer type_id);
}
