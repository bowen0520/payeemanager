package com.jxlg.zbw.service.impl;

import com.jxlg.zbw.dao.LocalCitibankAccount;
import com.jxlg.zbw.mapper.LocalCitibankAccountMapper;
import com.jxlg.zbw.service.LocalCitibankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: face_work
 * @package: com.jxlg.zbw.service.impl
 * @filename: LocalCitibankAccountServiceImpl.java
 * @create: 2020/07/13 15:34
 * @author: 29314
 * @description: .
 **/
@Service
@Transactional
public class LocalCitibankAccountServiceImpl implements LocalCitibankAccountService {
    @Autowired
    private LocalCitibankAccountMapper localCitibankAccountMapper;

    @Override
    public void insert(LocalCitibankAccount localCitibankAccount) {
        localCitibankAccountMapper.insert(localCitibankAccount);
    }
}
