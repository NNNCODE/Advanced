package com.itheima.test;

import com.itheima.domain.Student;
import com.itheima.exception.StudentAgeException;

import java.util.Scanner;

public class TryCatchTest {
    /*
       需求 :键盘录入学生的姓名和年龄,封装为Student学生对象
     */
    public static void main(String[] args) throws Exception {

        Student stu = new Student();

        Scanner sc  =new Scanner(System.in);//键盘录入
        System.out.println("请输入学生姓名 : ");
        String name = sc.nextLine();
        stu.setName(name);

        System.out.println("请输入学生年龄 :");
        int age = 0;

        while(true) {
            try {
                age = Integer.parseInt(sc.nextLine());//先以字符串的形式把年龄接过来，用parseInt进行转换
                stu.setAge(age); //new StudentAgeException("年龄范围有限,需要0~120之间的年龄");
                break;
            } catch (NumberFormatException e) {
                System.out.println("年龄输入有误，请重新输入整数年龄 :");
            }catch(StudentAgeException e){//StudentAgeException e = new StudentAgeException("年龄范围有限,需要0~120之间的年龄");
                String message = e.getMessage();//通过getMessage()获取到异常错误的原因
                System.out.println(message);
            }
        }


        System.out.println(stu);
    }
}
