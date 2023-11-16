package com.itheima.minterface;

public class InterfaceTest2 {
    /*
       接口的成员特点：

           1.成员变量:只能定义常量，因为系统会默认加入三个关键字
                    public static final
                       - 这三个关键字没有顺序关系
           2.成员方法：只能是抽象方法，因为系统会默认加入两个关键字

                public abstract
           3.构造方法：没有
        */
    public static void main(String[] args) {

    }
}


interface MyInter{
 public static final int num = 10;//灰色的关键字代表它本来就有

 public abstract  void show();//同上
}

abstract class MyInterImpl implements MyInter{

    public MyInterImpl(){
        super();
    }
}