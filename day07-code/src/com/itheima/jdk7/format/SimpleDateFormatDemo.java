package com.itheima.jdk7.format;

import java.text.ParseException;
import java.util.Date;

import java.text.SimpleDateFormat;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {

        String today = "2023年2月4日";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");

        Date date = simpleDateFormat.parse(today);

        System.out.println(date);

    }

    private static void method() {
        //创建一个日期格式化对象，使用[默认模式]
        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat();

        //创建一个日期格式化对象，[手动指定模式]
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");

        //创建Date对象，封装此刻的时间
        Date date = new Date();

        //将日期对象，转换为字符串

        String result = simpleDateFormat.format(date);

        System.out.println(result);
    }
}
