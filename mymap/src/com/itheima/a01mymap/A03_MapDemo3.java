package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A03MapDemo3 {
    public static void main(String[] args) {
        //Map集合的第二种遍历方式



        //1.创建Map集合的对象
        Map<String,String> map = new HashMap<>();

        //2.添加元素
        //键:人物的外号
        //值:人物的名字
        map.put("标枪选手","马超");
        map.put("人物挂件","明世隐");
        map.put("御龙骑士","尹志平");

        //3.Map集合中的第二种遍历方式
        //通过键值对对象进行遍历
        //3.1通过一个方法获取所有的键值对对象，返回一个Set集合

        Set<Map.Entry<String, String>> entries = map.entrySet();
        //3.2遍历entries这个集合,去得到里面的每一个键值对对象
        for (Map.Entry<String, String> entry : entries) {//entry-----> "标枪选手","马超"
            //3.3利用entry调用get方法获取键和值
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);

        }

    }
}
