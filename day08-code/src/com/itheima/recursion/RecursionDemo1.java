package com.itheima.recursion;

public class RecursionDemo1 {
    /*
    递归介绍 :方法直接或者间接调用本身
     */
    public static void main(String[] args) {
        methodA();
    }

    public static void methodA(){
        methodB();
    }
    public static void methodB(){
        methodC();
    }
    public static void methodC(){
        methodA();
    }
}
