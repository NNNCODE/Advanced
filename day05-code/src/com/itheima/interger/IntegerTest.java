package com.itheima.interger;

public class IntegerTest {
    /*
    包装类 :将基本数据类型，包装成类，变成引用数据类型

    ------------------------------------------------

    手动装箱 :调用方法，手动将基本数据类型，包装成类
            1.public Integer(int value) :通过构造方法(不推荐)
            2.public static Integer valueOf(int i ) :通过静态方法
    手动拆箱 :调用方法，手动包装类，拆成(转换)基本数据类型

            1.public int intValue() :以int 类型返回该Integer 的值
    --------------------------------------------------------------
            JDK5版本开始，出现了自动拆装箱
                1.自动装箱 :可以将基本数据类型，直接赋值给包装类的变量
                2.自动拆箱 :可以将包装类的数据，直接赋值给基本数据类型变量。

                结论 :基本数据类型,和对应的包装类，可以直接做运算了,不需要操心转换的问题了

    已知字符串 String s = "10,50,30,20,40";
    请将该字符串转换为整数并存入数组
    随后求出最大值打印在控制台

     */
    public static void main(String[] args) {
        String s = "10,50,30,20,40";

        //1.根据逗号做切割
        String[] sArr = s.split(",");

        //2.准备一个整数数组,准备储存转换后的数字.
        int[] nums = new int[sArr.length];

        //3.遍历字符串数组
        for (int i = 0; i < sArr.length; i++) {
            //sArr[i] :每一数字字符串
            //4.将数字字符串转换为整数
            nums[i] = Integer.parseInt(sArr[i]);
        }

        //5.求最大值
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("最大值 :" + max);
    }
}
