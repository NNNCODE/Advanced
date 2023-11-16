package com.itheima.a06args;

public class ArgsDemo3 {
    public static void main(String[] args) {
        //jdk5
        //可变参数
        //方法参数的个数是可以发生变化的，0,1,2,3
        //格式:属性类型..名字
        //int...args

        getSum(1,2,3,4,5,6,7,8,9,10);

    }

    //bottom:
    //bottom of variable parameters are arraylist
    //only  we don't necessary to create it ,Java will help us build it

    public static int getSum(int...args){
        System.out.println(args);

        return 0;

    }
}
