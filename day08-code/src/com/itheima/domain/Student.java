package com.itheima.domain;

import com.itheima.exception.StudentAgeException;

public class Student {
    private String name;
    private int age;


    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        setAge(age);//如果使用者没有使用setAge()方法，而是使用带参构造给年龄进行赋值，所以我们应该给也加一个判断.
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age)  {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            //错误的年龄
            throw new StudentAgeException("年龄范围有误，需要0~120之间的年龄");
        }
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
