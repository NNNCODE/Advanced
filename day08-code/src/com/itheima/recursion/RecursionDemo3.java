package com.itheima.recursion;

public class RecursionDemo3 {
    public static void main(String[] args) {

            int result = get(20);
        System.out.println(result);
    }
    public static int get(int month){
        if(month == 1||month == 2){
            return 1;

        }else{
            return get(month - 2) + get(month  - 1);
        }
    }
}
