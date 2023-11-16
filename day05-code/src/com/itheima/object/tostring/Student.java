package com.itheima.object.tostring;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        //this:stu1
        //o:stu2
        if (this == o) {
            //两个对象做地址值的比较，如果地址相同，里面的内容肯定相同，所以直接返回为true.
            return true;
        }
        //代码要是能够走到这里，代表地址肯定不相同
        //代码要是能走到这里，代表stu1，肯定不是null
        //stu1不是null,stu2是null，就直接返回false

        //this.getClass()!=o.getClass():两个对象的字节码是否相同
        //如果字节码不相同，就意味着类型不相同，直接返回false
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }

        //代码要是能够走到这里，代表字节码相同，类型肯定相同。
        //向下转型
        Student student = (Student) o;
        //
        return age == student.age && Objects.equals(name, student.name);
    }



    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
