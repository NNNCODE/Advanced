package com.itheima.set;

import java.util.TreeSet;

public class TreeSetDemo1 {
    /*
    TreeSet集合的特点体验 :排序，去重
     */
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("a");
        ts.add("d");
        ts.add("e");
        ts.add("c");
        ts.add("e");
        ts.add("b");
        ts.add("b");
        ts.add("b");
        ts.add("b");
        ts.add("b");
        System.out.println(ts);
    }
}
