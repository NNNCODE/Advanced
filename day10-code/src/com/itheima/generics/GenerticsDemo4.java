package com.itheima.generics;

public class GenerticsDemo4 {
    /*
        泛型接口
                1.实现类，实现接口的时候确定到具体的类型
                2.实现类实现接口，没有指定具体类型，就让接口的泛型，跟着类的泛型去匹配。
     */
    public static void main(String[] args) {
        InterBImpl<String> i = new InterBImpl<>();

    }
}

interface Inter<E>{
    void show(E s);

}

class InterAImpl implements Inter<String>{
    @Override
    public void show(String s){

    }
}

class InterBImpl<E> implements Inter<E>{

    @Override
    public void show(E s) {

    }
}