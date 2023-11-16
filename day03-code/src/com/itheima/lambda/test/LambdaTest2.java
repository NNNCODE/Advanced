package com.itheima.lambda.test;

import java.sql.SQLOutput;

public class LambdaTest2 {
    public static void main(String[] args) {

        useStringHandler(new StringHandler() {
            @Override
            public void printMessage(String msg) {
                System.out.println("匿名内部类打印:"+msg);
            }
        });


        System.out.println("----------------------");

        //Lambda表达式 里面的小括号是否使用参数 是需要参考上面的重写方法里面是否有参数
        useStringHandler( msg->System.out.println("Lambda:"+msg));
    }
    public static void useStringHandler(StringHandler stringHandler){
        stringHandler.printMessage("itheima");
    }
}

interface StringHandler{
    void printMessage(String msg);
}
