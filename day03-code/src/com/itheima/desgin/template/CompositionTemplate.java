package com.itheima.desgin.template;

public abstract class CompositionTemplate {
    public final void write(){

        System.out.println("我的爸爸");

        body();

        System.out.println("啊~ 这是我的爸爸~~");

    }

    public abstract void body();



}
