package com.jxlg.zbw.service.impl;

import com.jxlg.zbw.dao.BankTbl;
import com.jxlg.zbw.mapper.BankTblMapper;
import com.jxlg.zbw.service.BankTblService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: face_work
 * @package: com.jxlg.zbw.service
 * @filename: BankTblService.java
 * @create: 2020/07/15 00:47
 * @author: 29314
 * @description: .
 **/
@Service
@Transactional
public class BankTblServiceImpl implements BankTblService {
    @Autowired
    private BankTblMapper bankTblMapper;
    @Override
    public List<BankTbl> findAll(){
        return bankTblMapper.findAll();
    }
    @Override
    public int findIdByValue(String bank_name){
        return bankTblMapper.findIdByValue(bank_name);
    }

    @Override
    public String findValueById(Integer bank_id) {
        return bankTblMapper.findValueById(bank_id);
    }
}
