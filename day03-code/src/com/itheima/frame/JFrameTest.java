package com.itheima.frame;

import javax.swing.*;

import java.util.*;

public class JFrameTest {
    public static void main(String[] args) {
        //创建窗体对象
        //JFrame
        JFrame frame = new JFrame();

        //设置窗体可见
        frame.setVisible(true);

        //设置窗体可见
        frame.setSize(500,800);

        //修改窗体的关闭模式
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //添加xx图片，按钮

        //设置窗体标题
        frame.setTitle("这是大哥的第一个 窗体");


    }
}
