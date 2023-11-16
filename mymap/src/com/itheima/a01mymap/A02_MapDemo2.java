package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A02_MapDemo2 {
    //Map集合的第一种遍历方式

    //三个课堂练习
    //练习一
    //利用键找值的方式遍历map集合，要求：装着键的单列集合使用增强for的形式进行遍历
    //利用键找值的方式遍历map集合，要求：装着键的单列集合使用迭代器的形式进行遍历
    //利用键找值的方式遍历map集合，要求：装着键的单列集合使用lambda表达式的形式进行遍历

    //1.创建Map集合的对象

    public static void main(String[] args) {
        Map<String,String>map  =new HashMap<>();

        //2.添加元素
        map.put("尹志平","小龙女");
        map.put("郭靖","小龙女");
        map.put("欧阳克","黄荣");
        //3.通过键找值

        //3.1获取所有的键,把这些键放在一个单列集合当中。
        Set<String> keys = map.keySet();
        //3.2遍历单列集合,得到每一个键
        for (String key : keys) {
            //System.out.println(key);
            //3.3利用map集合中的键去获取对应的值 get
            map.get(key);
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
