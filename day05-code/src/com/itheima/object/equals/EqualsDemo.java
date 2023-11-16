package com.itheima.object.equals;

import com.itheima.object.tostring.Student;

import java.util.ArrayList;
import java.util.Objects;

public class EqualsDemo {
    /*
    Object 类中的equals方法：
    public boolean equals(Object obj):对象之间进行比较，返回true，或者是false。

      public boolean equals(Object obj) {
      //this : stu1
      //obj :
        return (this == obj);
    }

    结论：Object类中的equals方法，默认比较的是对象内存地址。

        -通常会重写equals方法，让对象之间，比较内容

     */

    public static void main(String[] args) {

        Student stu1 = null;
        Student stu2 = new Student("张三",23);

        System.out.println(Objects.isNull(stu1));
        System.out.println(Objects.isNull(stu2));

        //问题:   Objects.equals方法,和stu1.equals方法,有什么区别
        //细节:   Objects.equals方法,内部依赖我们自己编写的equals方法
        //好处:   Objects.equals方法,内部带有非null判断

        /*
                //a:stu1
                //b:stu2
          public static boolean equals(Object a, Object b) {
-----------------------------------------------------------------------------------------
            a == b:如果地址相同，就会返回true，这里使用的符号是短路||，左边为 true，右边就不执行了
                    -结论:如果地址相同，方法直接返回为true

                    :如果地址不相同，就会返回false,短路||,左边为false,右边要继续执行.
-----------------------------------------------------------------------------------------
            a!=null :假设a 是null 值

                        null! = null :false
                        && : 左边为false,右边不执行，记录者null值的a,就不会调用equals方法
                                -避免空指针异常！
-----------------------------------------------------------------------------------------
            a!=null :假设a 是null 值

                        null! = null :false
                        && : 左边为true,右边继续执行，a.equals(b)，这里不会出现空指针异常

                return (a == b) || (stu1 != null && a.equals(b));
            }
         */
        System.out.println(Objects.equals(stu1,stu2));

        System.out.println("看看我执行了吗？");
    }
}
