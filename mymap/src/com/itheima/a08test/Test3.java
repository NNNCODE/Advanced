package com.itheima.a08test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
          /*
    班级里有5个学生
    要求:
        被点到的学生不会再被点到
        但是如果班级中所有的学生都点完了，需要重新开始第二轮点名

     */
        //1.定义集合
        ArrayList<String> list1 = new ArrayList<>();
        //2.添加数据
        Collections.addAll(list1, "范闲", "范建", "范统", "杜子腾", "杜琦燕", "宋合泛", "候笼藤", "朱益群", "珠穆朗玛峰峰", "袁明媛");
        //创建一个临时的集合，用来存已经被装点到的学生的名字
        ArrayList<String> list2 = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            System.out.println("=====第" + i + "轮点名开始了====================");
            //3.获取集合的长度
            int count = list1.size();
            //4.随机点名
            Random r = new Random();
            for (int j = 0; j < count; j++) {
                int index = r.nextInt(list1.size());
                String name = list1.remove(index);
                list2.add(name);
                System.out.println(name);
            }
            //此时表示一轮点名结束
            //list1空了list2 10个学生的名字
            list1.addAll(list2);
            list2.clear();

        }


    }
}
