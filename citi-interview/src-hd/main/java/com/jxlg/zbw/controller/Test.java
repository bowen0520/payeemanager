package com.jxlg.zbw.controller;

import com.jxlg.zbw.dao.LocalCitibankAccount;
import com.jxlg.zbw.service.LocalCitibankAccountService;
import com.jxlg.zbw.service.PayeeTypeTblService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: face_work
 * @package: com.jxlg.zbw.controller
 * @filename: Test.java
 * @create: 2020/07/13 15:46
 * @author: 29314
 * @description: .
 **/


@RestController
@RequestMapping("/api")
public class Test {

    @Autowired
    private PayeeTypeTblService payeeTypeTblService;

    @GetMapping("/test")
    public void test() {

        payeeTypeTblService.findAll().forEach(x->{
            System.out.println(x.toString());
        });

        System.out.println(payeeTypeTblService.findIdByValue("Local Non-Citibank Account"));
    }
}
