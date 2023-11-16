package com.itheima.recursion;

public class RecursionDemo2 {
    /*
        需求 :使用递归求5的阶乘
     */
    public static void main(String[] args) {
        int result = jc(5);
        System.out.println(result);
    }
    public static int jc(int num){
        if(num == 1){
            return 1;
        }else {
            //num :5;
            return num * jc(num-1);
        }

    }
}
