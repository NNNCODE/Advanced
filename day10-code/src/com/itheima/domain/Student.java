package com.domain;

public class Student implements Comparable<Student> {

    //this.xxx-o.xxx正序
    //o.xxx-this.xxx降序
    @Override
    public int compareTo(Student o) {
        //根据年龄做主要排序条件
        int ageResult = o.age -this.age;
        //根据姓名做次要排序条件
        int nameResult = ageResult==0 ? o.name.compareTo(this.name):ageResult;
        //判断姓名是否相同
        int result = nameResult == 0? 1 : nameResult;
        return result;
    }

    private String name;
    private int age;


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
