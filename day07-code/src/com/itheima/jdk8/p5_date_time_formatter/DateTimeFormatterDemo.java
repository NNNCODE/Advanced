package com.itheima.jdk8.p5_date_time_formatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("格式化之前 :" + now);

        //获取格式化对象
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日");

        //格式化
        String result = formatter.format(now);
        System.out.println("格式化之后 :" + result);

        //解析
        String time = "2000年08月08日";
        LocalDate parse = LocalDate.parse(time, formatter);
        System.out.println(parse);

    }
}
