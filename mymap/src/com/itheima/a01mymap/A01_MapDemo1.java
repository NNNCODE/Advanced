package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Map;

public class A01_MapDemo1 {
    /*
        V put(K key,V value)     添加元素
        V remove(Object key)     根据键删除值对应的元素
        void clear()             移除所有的键值对元素
        boolean containsKey(Object key) 判断集合是否包含指定的键
        boolean containValue(Object value)判断集合是否包含指定的值
        boolean isEmpty()        判断集合是否为空
        int size()               集合的长度，也就是集合中键值对的个数
     */

    public static void main(String[] args) {
        //1.创建Map集合的对象
        Map<String, String> m  = new HashMap<>();


        //2.添加元素
        //put方法的细节
        //添加/覆盖

        //在添加数据的时候，如果键不存在，那么直接把键值对对象添加到map集合当中，方法返回null
        //在添加数据的时候,如果键是存在的，那么会把原有的键值对对象覆盖，会把覆盖的值进行返回。


        m.put("郭靖","黄蓉");
        m.put("韦小宝","木胶品");
        m.put("尹志平","小龙皇女");

        //String value = m.put("韦小宝","双儿");
        //System.out.println(value);

        //清空
        //m.clear();

        //判断是否包含
//        boolean keyResult = m.containsKey("郭靖");
//        System.out.println(keyResult);

//        boolean result = m.isEmpty();
//        System.out.println(result);

        int size = m.size();
        System.out.println(size);

        //3.打印集合
        System.out.println(m);
    }
}
