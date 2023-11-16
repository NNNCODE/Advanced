package com.itheima.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo3 {
    /*
    并发修改异常 :ConcurrentModificationException

        场景 :使用[迭代器]遍历集合的过程中，调用[集合对象]的添加,删除方法,就会出现异常

        解决方案 :迭代器的遍历过程中,不允许使用集合对象的添加或删除.那就是使用迭代器,自己的添加或删除方法.

                删除方法 :普通的迭代器有
                添加方法 :普通的迭代器没有，需要使用List集合特有的迭代器
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("眼瞅着你不是真正的高兴");
        list.add("温油");
        list.add("离开俺们这旮旯");
        list.add("伤心的人别扭秧歌");
        list.add("私奔到东北");

        ListIterator<String> it = list.listIterator();//普通迭代器中没有添加方法
        while(it.hasNext()){
            String s = it.next();
            if("温油".equals(s)){
                it.add("哈哈");
            }
        }
        System.out.println(list);
    }
}
