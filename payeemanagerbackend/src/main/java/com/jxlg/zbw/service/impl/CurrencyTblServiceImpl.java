package com.jxlg.zbw.service.impl;

import com.jxlg.zbw.dao.CurrencyTbl;
import com.jxlg.zbw.mapper.CurrencyTblMapper;
import com.jxlg.zbw.service.CurrencyTblService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: face_work
 * @package: com.jxlg.zbw.service.impl
 * @filename: CurrencyTblServiceImpl.java
 * @create: 2020/07/15 00:52
 * @author: 29314
 * @description: .
 **/
@Service
@Transactional
public class CurrencyTblServiceImpl implements CurrencyTblService {
    @Autowired
    private CurrencyTblMapper currencyTblMapper;

    @Override
    public List<CurrencyTbl> findAll() {
        return currencyTblMapper.findAll();
    }

    @Override
    public int findIdByValue(String currency_type) {
        return currencyTblMapper.findIdByValue(currency_type);
    }

    @Override
    public String findValueById(Integer currency_id) {
        return currencyTblMapper.findValueById(currency_id);
    }
}
