package com.itheima.button;

import javax.swing.*;

public class JButtonTest {
    /*
    案例演示: 窗体中添加按钮组件

    ---------------------------------------
    JButton构造方法：

        1.public JButton() :创建一个空白的按钮
        2.public JButton(String text):
    -----------------------------------------

    注意:如果取消了窗体的默认布局，就需要手动指定组件的摆放位置了
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

        //取消窗体的默认布局
        frame.setLayout(null);

        //1.创建按钮对象
        JButton btn = new JButton("点我啊~");
        btn.setBounds(50,50,100,100);
        //2.将按钮调价到窗体的[面板对象]中
        frame.getContentPane().add(btn);

        //3.调整按钮大小

        frame.setVisible(true);
    }
}
