package com.jxlg.zbw.service;

import com.jxlg.zbw.dao.Payee;

import java.util.List;

/**
 * @program: face_work
 * @package: com.jxlg.zbw.mapper
 * @filename: PayeeMapper.java
 * @create: 2020/07/15 00:27
 * @author: 29314
 * @description: .
 **/

public interface PayeeService {
    long insert(Payee payee);

    List<Payee> findAll();

    List<Payee> findPayees(int page,int pageNums);

    long deleteById(Integer payee_id);
}
