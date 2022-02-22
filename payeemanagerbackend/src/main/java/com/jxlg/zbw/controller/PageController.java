/**
 * FileName:PageController
 * Author:  y1huachen
 * Date:    2020-07-13 14:28
 * Description:页面控制器
 */
package com.jxlg.zbw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *(一句话功能简述) <br>
 *(页面控制器)
 *
 *@author y1huachen
 *@create 2020-07-13
 *@since 1.0.0
 */

@Controller
public class PageController {


  /*public String index(){
    return "index";
  }*/

  @RequestMapping("add/payee")
  public String addPayee(){
    return "addPayee";
  }
}
