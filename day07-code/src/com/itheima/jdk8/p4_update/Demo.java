package com.itheima.jdk8.p4_update;

import java.time.LocalDateTime;

public class Demo {
    /*
    ------------------------------
    LocalDate、LocalTime、LocalDateTime

    对象的创建方式

    1.now() :当前时间

    2.of(...) :设置时间

    ----------------------------------

    LocalDateTime转换为LocalDate,LocalTime

    1.toLocalDate()
    2.toLocalTime()
     */
    public static void main(String[] args) {
        //获取此刻的时间对象
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        System.out.println(now.getYear() + "年");
        System.out.println(now.getMonth() + "月");
        System.out.println(now.getMonthValue() + "月");
        System.out.println(now.getHour() + "时");
        System.out.println(now.getHour() + "分");
        System.out.println(now.getSecond() + "秒");
        System.out.println(now.getNano() + "纳秒");
        //获取制定的时间对象
        LocalDateTime of = LocalDateTime.of(2008,8,8,8,8);
        System.out.println(of);

    }
}
