package com.jxlg.zbw.service.impl;

import com.jxlg.zbw.dao.PurposeOfTransferTbl;
import com.jxlg.zbw.mapper.PurposeOfTransferTblMapper;
import com.jxlg.zbw.service.PurposeOfTransferTblService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: face_work
 * @package: com.jxlg.zbw.service.impl
 * @filename: PurposeOfTransferTblServiceImpl.java
 * @create: 2020/07/15 08:26
 * @author: 29314
 * @description: .
 **/
@Service
@Transactional
public class PurposeOfTransferTblServiceImpl implements PurposeOfTransferTblService {
    @Autowired
    private PurposeOfTransferTblMapper purposeOfTransferTblMapper;

    @Override
    public List<PurposeOfTransferTbl> findAll() {
        return purposeOfTransferTblMapper.findAll();
    }

    @Override
    public int findIdByValue(String purpose_of_transfer_type) {
        return purposeOfTransferTblMapper.findIdByValue(purpose_of_transfer_type);
    }

    @Override
    public String findValueById(Integer purpose_of_transfer_id) {
        return purposeOfTransferTblMapper.findValueById(purpose_of_transfer_id);
    }
}
