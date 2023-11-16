package com.itheima.test;

import java.sql.SQLOutput;

public class RegexTest {
    /*
    1.  QQ号正则
            不能以0开头
            全部都是数字
            5~12位
    2.手机号正则
            必须是1开头
            第二位 :3 4 5 6 7 8 9
            全部是数字，必须是11位
    3.邮箱正则
            zhangSan@itcast.cn
            zhangsan@163.com
            123456@qq.com
            zhangsan@sina.com
            zhangsan@itcast.qq.com
            zhangsan@xxx.edu
            zhangsan@xxx.rog
     */
    public static void main(String[] args) {
        String qqRegex = "[1-9]\\d{4,11}";
        System.out.println("01256".matches(qqRegex));

        String telRegx = "[1][3-9]\\d{9}";//
        System.out.println("15611111111".matches(telRegx));

        String emailRegex= "\\w+[@][\\w&&[^-]]+(\\.[a-z]{2,3})+";
    }
}
