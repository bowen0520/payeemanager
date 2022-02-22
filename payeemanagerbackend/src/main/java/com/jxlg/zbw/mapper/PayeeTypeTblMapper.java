package com.jxlg.zbw.mapper;

import com.jxlg.zbw.dao.PayeeTypeTbl;
import java.util.List;

/**
 * @program: face_work
 * @package: com.jxlg.zbw.mapper
 * @filename: TypeTblMapper.java
 * @create: 2020/07/13 15:36
 * @author: 29314
 * @description: .
 **/

public interface PayeeTypeTblMapper {
    List<PayeeTypeTbl> findAll();

    int findIdByValue(String type_message);

    String findValueById(Integer type_id);
}
