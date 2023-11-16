package com.itheima.exception;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo1 {
    /*
    编译异常 :编译阶段就出现了的错误(语法错误不算)
    运行时异常 :编译过了，运行期间 [可能会出现的错误]
     */
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");

    }
}
