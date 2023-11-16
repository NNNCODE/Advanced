package com.itheima.generics;

public class GenerticsDemo3<T>{
    /*
        泛型方法
            1.非静态的方法 :内部的泛型，会根据类的泛型去匹配
            2.静态的方法 :静态方法中如加入了泛型，喜碧声明处自己独立的泛型
                            -时机 :在调用方法，传入实习参数的时候，确定到具体的类型。
     */
    public static void main(String[] args) {

        String[] arr1 = {"张三","李四","王五"};
        Integer[] arr2 = {11,22,33};
        Double[] arr3 = {11.1,22.2,33.3};

        printArray(arr1);
        printArray(arr2);
        printArray(arr3);

        Integer[] nums = {11,22,33};//泛型只能接

        printArray(nums);
    }

    public static<T> void printArray(T[] arr){//不能跟着类泛型一致，只能申请独立的泛型
        System.out.println("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + ", ");

        }
        System.out.println(arr[arr.length-1] + "]");
    }
}
