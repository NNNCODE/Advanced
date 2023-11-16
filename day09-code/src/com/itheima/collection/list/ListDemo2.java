package com.itheima.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {
    /*
        List集合的遍历方式 :

            1.迭代器遍历
            2.增强for循环
            3.foreach方法
            4，普通for循环
            5.ListIterator(List集合特有的迭代器)
     */
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
        list.add("abc");
        list.add("bbb");
        list.add("ccc");
        list.add("abc");

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }

        System.out.println("------------------------------");

        ListIterator<String> it = list.listIterator();
        while(it.hasNext()){//hasnext()是判断有没有下一个元素
            String s = it.next();
            System.out.println(s);
        }

        System.out.println("-----------------------------------");

        while(it.hasPrevious()){//hasPrevious()是判断还有没有上一个元素
            String s =it.previous();
            System.out.println(s);
        }
        System.out.println("----------------------------");
    }
}
