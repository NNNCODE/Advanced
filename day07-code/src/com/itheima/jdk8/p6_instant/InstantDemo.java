package com.itheima.jdk8.p6_instant;

import java.time.Instant;

public class InstantDemo1 {
    /*
    Instant类 :用于表示时间的对象，类似之前所学习的Date

     */
    public static void main(String[] args) {

        Instant now = Instant.now();
        System.out.println("当前的时间就是 :" + now);

        
    }
}
