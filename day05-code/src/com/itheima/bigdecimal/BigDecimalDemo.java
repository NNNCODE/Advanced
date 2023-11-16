package com.itheima.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    /*
    BigDecimal类 :解决小数运算中,出现的不精确问题

    BigDecimal创建对象 :

            public BigDecimal(double val) :不推荐，无法保证小数运算的精确
            --------------------------------------------------------------
            public BigDecimal(String val) :把你要传的小数以字符串的形式传到构造方法里面去
            public static BigDeciaml valueOf(double val)

    BigDecimal常用成员方法:

            public BigDecimal add(BigDecimal b) :加法
            public BigDecimal subtract(BigDecimal b) :加法
            public BigDecimal multiply(BigDecimal b) :加法
            public BigDecimal divide(BigDecimal b) :加法
            public BigDecimal divide(另一个BigDecimal对象,精确几位,舍入模式) :除法

     注意：如果出现BigDecimal运算，出现了除不尽的情况，就会出现异常。
     */
    public static void main(String[] args) {

        BigDecimal bd1 = BigDecimal.valueOf(10.0);
        BigDecimal bd2 = BigDecimal.valueOf(3.0);

        System.out.println(bd1.divide(bd2,2, RoundingMode.HALF_UP));//3.33
        System.out.println(bd1.divide(bd2,2, RoundingMode.UP));//3.34
        System.out.println(bd1.divide(bd2,2, RoundingMode.DOWN));//3.33

        BigDecimal result = bd1.divide(bd2,2, RoundingMode.HALF_UP);

        double v = result.doubleValue();

        Math.abs(v);
    }

    private static void method() {
        BigDecimal bd1 = BigDecimal.valueOf(0.1);
        BigDecimal bd2 = BigDecimal.valueOf(0.2);

        System.out.println(bd1.add(bd2));
        System.out.println(bd1.subtract(bd2));
        System.out.println(bd1.multiply(bd2));
        System.out.println(bd1.divide(bd2));
    }
}
