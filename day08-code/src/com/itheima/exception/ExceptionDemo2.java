package com.itheima.exception;

public class ExceptionDemo2 {
    /*
    阅读异常信息 :从下往上看

        1.找异常错误位置
        2.异常名称
        3.异常原因
     */
    public static void main(String[] args) {
        int [] arr = new int[5];
    }
    public static void method(){
        int [] arr ={11,22,33};
        System.out.println(arr[1]);
    }

    public static void function(){
        System.out.println(10/0);
    }
}
