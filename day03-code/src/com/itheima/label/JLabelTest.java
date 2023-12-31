package com.itheima.label;

import javax.swing.*;

public class JLabelTest {
    /*
    案例:使用JLabel展示文本和图片

    JLabel的构造方法
    JLabel(String text)使用指定的文本创建一个JLabel对象
    JLabel(Icon image)创建一个具有指定图像的JLabel对象
     */

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);

        //JLabel展示文本
        JLabel jl1 = new JLabel("听君一席话");
        jl1.setBounds(50,50,100,100);
        frame.getContentPane().add(jl1);

        JLabel jl2 = new JLabel("如听一席话");
        jl2.setBounds(150,50,100,100);
        frame.getContentPane().add(jl2);

        //JLabel展示图片
        ImageIcon icon = new ImageIcon("C:\\Users\\niemi\\Pictures\\Saved Pictures");



        frame.setVisible(true);
    }
}
