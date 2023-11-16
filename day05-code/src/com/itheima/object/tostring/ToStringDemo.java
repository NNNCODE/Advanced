package com.itheima.object.tostring;

import java.util.ArrayList;

public class ToStringDemo {
    /*
        public String toString()返回该对象的字符串表示

        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }

        getClass().getName():类名称，全类名(包名 + 类名)
        Integer.toHexString():转十六进制
        hashCode():返回的是对象内存地址 + 哈希算法，算出来的整数(哈希值)
        eg：com.itheima.object.tostring.A@7ef20235
         7ef20235 已经不是内存地址了，而是一份十六进制的hash值

        ---------------------------------------------

        细节:使用打印语句，打印对象名的时候，println方法，源码层面，会自动调用该对象的toString方法

        public static String valueOf(Object obj) {
            return (obj == null) ? "null" : obj.toString();
        }
     */
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a);//我们用打印语句打印对象的时候，println在源码层面会自动调用toString的对象方法
        System.out.println(a.toString());

        Student stu = new Student("张三",23);
        System.out.println(stu);

        ArrayList<String>list =new ArrayList<>();
        list.add("abc");
        list.add("abc");
        list.add("abc");

        System.out.println(list);//直接打印变量没出现地址，说明Arraylist已经重写过 toString方法
    }
}

class A {


    @Override
    public String toString() {
        return "大哥重写了toString方法";
    }
}




