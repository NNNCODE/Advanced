package com.itheima.collection.list;

import java.util.LinkedList;

public class LinkedListDemo {
    /*
        LinkedList特有方法
            public void addFirst(E,e) :头部添加
            public void addLast(E e) :尾部添加
            public E getFirst() :获取第一个
            public E getLast() :获取最后一个
            public E removeFirst() :删除第一个
            public E removeLast() :删除最后一个
         */

    /*
    LinkedList集合,底层是双向链表结构，查找元素的时候会从头部,或者尾部卓哥查找
    但是它属于List系统中的集合，也可以使用get方法，根据索引直接获取元素。
    这其中？？咋玩的？？
     */
    public static void main(String[] args) {

        LinkedList<String>list = new LinkedList<>();

        list.add("张三");
        list.add("李四");
        list.add("王五");

        String s = list.get(1);
        System.out.println(s);

    }

    private static void method2() {
        LinkedList<String> List = new LinkedList<>();

        List.add("张三");
        List.add("李四");
        List.add("王五");
        List.add("赵六");

        System.out.println(List.getFirst());
        System.out.println(List.getLast());

        List.removeFirst();
        List.removeLast();

        System.out.println(List);
    }

    private static void method1() {
        LinkedList<String>list = new LinkedList<>();


        list.addFirst("张三");
        list.addFirst("李四");
        list.addFirst("王五");
        list.addLast("赵六");
    }

    
}
