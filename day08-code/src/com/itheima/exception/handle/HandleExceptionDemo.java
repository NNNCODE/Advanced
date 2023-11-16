package com.itheima.exception.handle;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HandleExceptionDemo {
    /*
    异常处理方式

            1.try...catch捕获异常

                好处 :异常对象可以被捕获,后续代码的代码可以继续执行(这样就不会传回虚拟机了)

                    格式 :
                            try{
                            可能会出现的异常的代码
                            }catch(异常名称 对象名){
                                异常的处理方案
                            }
                    执行流程 :
                            1.执行try{ }中的代码，是否有异常对象产生
                            2.没有 :catch就不会捕获,后续代码继续执行
                            3.有 :catch捕获异常对象，执行catch{}中的处理方案,后续代码继续执行

            2.throws抛出异常

            ----------------------------------------

            问题 :正在面临的异常,是否需要暴露出来
                -不需要暴露出来 :try...catch捕获
                -需要暴露 :抛出异常
     */
    public static void main(String[] args) throws Exception {

        method();

    }
    public static void method() throws ParseException, FileNotFoundException {//throws 起到声明作用。
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse("abc");
        System.out.println(date);

        FileReader fr = new FileReader("D\\A.txt");
    }
}
