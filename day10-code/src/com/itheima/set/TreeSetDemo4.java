package com.itheima.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo4 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });

        ts.add("aa");
        ts.add("aaaaaaaaaa");
        ts.add("aaa");
        ts.add("a");

        System.out.println(ts);

    }
}
