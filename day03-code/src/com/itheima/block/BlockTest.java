package com.itheima.block;

import org.w3c.dom.ls.LSOutput;

import java.net.Socket;

public class BlockTest {
    /*
    代码块 ：使用 { }括起来的代码被称为代码块

    分类：
        1.局部代码块
                位置:方法中一对大括号
                作用：限定变量的生理周期 提早释放内存
        2.构造代码块
                位置：类中方法外的一对大括号
                特点：在创建对象，执行构造方法的时候，就会执行构造代码块(优先于构造方法的执行)
                作用：将多个构造方法中，重复的代码，抽取到构造代码块当中，从而提升代码的复用性


        3.静态代码块
                位置:类中方法外的一对大括号，需要加入static关键字
                特点:会随着类的加载而加载，因为只加载一次，所以也就只会执行一次
                作用:对数据进行初始化,
     */
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student(10);
    }
}

class Student{

   static String school;


    static{
        System.out.println("Static...Student类的静态代码块");

//        Socket

    }

    {
        System.out.println("Student类构造代码块...");
    }

    public Student (){
        System.out.println("空参构造方法");
    }

    public Student(int num){
        System.out.println("带参构造方法...");
    }
}
