package com.jxlg.zbw.mapper;

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

public interface PayeeMapper {
    long insert1(Payee payee);

    long insert2(Payee payee);

    List<Payee> findAll();

    long deleteById(Integer payee_id);
}
