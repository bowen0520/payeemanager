/**
 * FileName:APIController
 * Author:  y1huachen
 * Date:    2020-07-13 14:47
 * Description:功能控制器
 */
package com.jxlg.zbw.controller;

import com.jxlg.zbw.dao.BankTbl;
import com.jxlg.zbw.dao.CurrencyTbl;
import com.jxlg.zbw.dao.Payee;
import com.jxlg.zbw.dao.PayeeTypeTbl;
import com.jxlg.zbw.dao.PurposeOfTransferTbl;
import com.jxlg.zbw.service.BankTblService;
import com.jxlg.zbw.service.CurrencyTblService;
import com.jxlg.zbw.service.PayeeService;
import com.jxlg.zbw.service.PayeeTypeTblService;
import com.jxlg.zbw.service.PurposeOfTransferTblService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *(一句话功能简述) <br>
 *(功能控制器)
 *
 *@author y1huachen
 *@create 2020-07-13
 *@since 1.0.0
 */
@Controller
@RequestMapping("api")
@CrossOrigin(origins = "*",maxAge = 3600)
public class APIController {

  @Autowired
  private PayeeTypeTblService payeeTypeTblService;
  @Autowired
  private PayeeService payeeService;
  @Autowired
  private BankTblService bankTblService;
  @Autowired
  private PurposeOfTransferTblService purposeOfTransferTblService;
  @Autowired
  private CurrencyTblService currencyTblService;

  @RequestMapping("type/payee")
  @ResponseBody
  public List<PayeeTypeTbl> findAllPayeeType(){
    return payeeTypeTblService.findAll();
  }

  @RequestMapping("purpose")
  @ResponseBody
  public List<PurposeOfTransferTbl> findAllPurpose(){
    return purposeOfTransferTblService.findAll();
  }

  @RequestMapping("bank")
  @ResponseBody
  public List<BankTbl> findAllBank(){
    return bankTblService.findAll();
  }

  @RequestMapping("currency")
  @ResponseBody
  public List<CurrencyTbl> findAllCurrency(){
    return currencyTblService.findAll();
  }

  @RequestMapping("payee")
  @ResponseBody
  public List<Payee> findAllPayee(){
    return payeeService.findAll();
  }

  @PostMapping("add")
  @ResponseBody
  public long addPayee(ModelMap model, @RequestBody Payee payee){
    System.out.println("---------------------------------------");
    System.out.println(payee.toString());
    System.out.println("---------------------------------------");
    long n = payeeService.insert(payee);
    return n;
  }

  @RequestMapping("payee/type")
  public String payeeType(Integer id){
    switch (id){
      case 1:
        return "LCA";
      case 2:
        return "LNCA";
    }
    return "index";
  }
}
