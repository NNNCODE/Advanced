package com.itheima.listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Tips {
    /*
        焦点:程序的注意力集中在某一个组件上面

        注意：按钮组件比较特殊，在创建好之后，程序的焦点，默认就停留在按钮组件上面
                -但按钮组件，其实不需要占用程序的焦点。
                -可以通过setFocusable(false):取消焦点。
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setLayout(null);

        JButton btn = new JButton("按钮");
        btn.setBounds(0,0,100,100);
        frame.getContentPane().add(btn);
        //-------------------------------------------

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("我被点了");
            }
        });

        btn.setFocusable(false);
        //---------------------------------------------
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("键盘按下");
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        //---------------------------------
        frame.setVisible(true);
    }
}
