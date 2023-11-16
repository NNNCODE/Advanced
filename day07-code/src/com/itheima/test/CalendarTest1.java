package com.itheima.test;

import java.util.Calendar;

public class CalendarTest1 {
    /*
       需求 :使用程序判断出2050年3月1日是否是疯狂星期四
     */
    public static void main(String[] args) {

        //1.获取日期对象(此刻的时间)
        Calendar c  = Calendar.getInstance();

        //2.调用set方法,将时间设置为2050年3月1日
        c.set(2050,2,1);

        char[] weeks ={'0','日','一','二','三','四','六'};

        //3.获取星期
        int weekIndex = c.get(Calendar.DAY_OF_WEEK);

        if(weeks[weekIndex] == '四'){
            System.out.println("今天是疯狂星期四，我要奢侈一把~");
        }else{
            System.out.println("今天是疯狂星期四，吃不起KFC");
        }
    }
}
