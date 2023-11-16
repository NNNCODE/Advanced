package com.itheima.generics;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo1 {
    /*
        泛型介绍 :JDK5引入的，可以在编辑阶段约束操作的数据类型，并进行检查

        注意 :泛型默认的雷士Object

        泛型的好处 :
                    1.统一数据类型
                    2.将运行期的错误提升到了鳄编辑期

         泛型的学习路径
                    1.泛型类
                    2.泛型方法
                    3.泛型接口
                    4.泛型通配符
                    5.泛型的限定
     */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        //list.add(new Random());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            Object o = it.next();//如果不加泛型的话，默认是Object
            String s = (String) o;//强制转换
            System.out.println(s.length());
        }
    }
}
