package com.jxlg.zbw.controller;

/**
 * @program: face_work
 * @package: com.jxlg.zbw.controller
 * @filename: Test2.java
 * @create: 2020/07/15 16:09
 * @author: 29314
 * @description: .
 **/

public class Test2 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        help(100);

    }

    public static void help(int max){
        for(int i = 2;i<=max;i++){
            boolean flag = true;
            for(int j = 2;j<i;j++){
                if(i%j==0){
                    flag = false;
                    break;
                }
            }

            if(flag){
                System.out.println(i);
            }
        }
    }
}
