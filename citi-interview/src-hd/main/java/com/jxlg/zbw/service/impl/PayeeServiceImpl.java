package com.jxlg.zbw.service.impl;

import com.jxlg.zbw.dao.Payee;
import com.jxlg.zbw.mapper.PayeeMapper;
import com.jxlg.zbw.service.PayeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: face_work
 * @package: com.jxlg.zbw.service.impl
 * @filename: PayeeServiceImpl.java
 * @create: 2020/07/15 08:23
 * @author: 29314
 * @description: .
 **/
@Service
@Transactional
public class PayeeServiceImpl implements PayeeService {
    @Autowired
    private PayeeMapper payeeMapper;

    @Override
    public long insert(Payee payee) {
        if(payee.getType_message().equals("Local Citibank Account")){
            return payeeMapper.insert1(payee);
        }else {
            return payeeMapper.insert2(payee);
        }
    }

    @Override
    public List<Payee> findAll() {
        return payeeMapper.findAll();
    }

    @Override
    public long deleteById(Integer payee_id) {
        return payeeMapper.deleteById(payee_id);
    }
}
