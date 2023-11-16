package com.itheima.set;

import com.itheima.domain.Student;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
    /*
        如果同时具备比较器和自然排序，会优先按照比较器的规则，进行排序操作
     */
    public static void main(String[] args) {
        TreeSet<Student>ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int ageResult = o1.getAge() - o2.getAge();

                return ageResult == 0?o1.getName().compareTo(o2.getName()):ageResult;
            }
        });

        ts.add(new Student("赵六",26));
        ts.add(new Student("李四",24));
        ts.add(new Student("张三",23));
        ts.add(new Student("王五",25));

        System.out.println(ts);

    }
}
