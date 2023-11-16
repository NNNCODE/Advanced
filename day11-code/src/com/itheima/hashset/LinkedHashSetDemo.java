package com.itheima.hashset;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    /*
    LinkedHashSet特点 :去重,并保证存取顺序

     */
    public static void main(String[] args) {
        LinkedHashSet<String>lhs = new LinkedHashSet();
        lhs.add("d");
        lhs.add("b");
        lhs.add("a");
        lhs.add("c");
        lhs.add("c");

        System.out.println(lhs);
    }
}
