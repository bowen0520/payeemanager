package com.jxlg.zbw.service.impl;

import com.jxlg.zbw.dao.PayeeTypeTbl;
import com.jxlg.zbw.mapper.PayeeTypeTblMapper;
import com.jxlg.zbw.service.PayeeTypeTblService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: face_work
 * @package: com.jxlg.zbw.service.impl
 * @filename: TypeTblServiceImpl.java
 * @create: 2020/07/13 15:45
 * @author: 29314
 * @description: .
 **/
@Service
@Transactional
public class PayeeTypeTblServiceImpl implements PayeeTypeTblService {
    @Autowired
    private PayeeTypeTblMapper payeeTypeTblMapper;

    @Override
    public List<PayeeTypeTbl> findAll() {
        return payeeTypeTblMapper.findAll();
    }
    @Override
    public int findIdByValue(String type_message){
        return payeeTypeTblMapper.findIdByValue(type_message);
    }

    @Override
    public String findValueById(Integer type_id) {
        return payeeTypeTblMapper.findValueById(type_id);
    }

}
