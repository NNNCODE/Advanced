package com.itheima.order;

import java.util.Scanner;

public class Test {
    /*
    ClassCastException:类型转换异常

            在引用数据类型的强转中，【实际类型】和【目标类型】不匹配，就会出现异常
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：1.国内订单 2.国外订单");

        OrderService orderService = null;//为什么要设置成null，要给个初值，起到初始化的作用


        int choice = sc.nextInt();
        switch (choice){
            case 1:
            //创建国内订单的业务类
                orderService = new OrderServiceImpl();
                break;
            case 2:
                //创建国外订单的业务类
                orderService = new OverseaServiceImpl();
                break;
        }

        OverseaServiceImpl osi = (OverseaServiceImpl) orderService;//父类被强制转换成子类

        osi.check();

        orderService.create();
        orderService.findOne();
        orderService.findList();
        orderService.cancel();
        orderService.finish();
        orderService.paid();
    }
}
