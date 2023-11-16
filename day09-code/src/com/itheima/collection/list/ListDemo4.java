package com.itheima.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo4 {
    /*
    迭代器遍历集合的过程中,使用集合的删除方法,删除倒数第二个元素的时候，就不会出现错误.
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("abc");
        list.add("bbb");
        list.add("def");
        list.add("ccc");

        Iterator<String>it = list.iterator();

        while(it.hasNext()){
            String s = it.next();
            if("def".equals(s)){
                list.remove("def");
            }
        }

        System.out.println(list);
    }
}
