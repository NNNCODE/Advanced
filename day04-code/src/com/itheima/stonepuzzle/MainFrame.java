package com.itheima.stonepuzzle;

import org.w3c.dom.CDATASection;

import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class MainFrame extends JFrame implements KeyListener {


    int[][] data = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };


    int row;        //0号元素坐标位置
    int column;      //0号元素列坐标位置
    int count;      //统计步数的变量
    //只要你new对象，他就会执行-->构造方法

    public MainFrame() {

        //窗体对象.addKeyListener();
        //this:当前类对象
        //MainFrame有两个身份
        //1)窗体对象
        //2)KeyListener实现类对象
        this.addKeyListener(this);

        //初始化窗体
        initFrame();
        //初始化数据
        initData();
        //绘制游戏界面
        paintView();

        //设置窗体可见
        setVisible(true);
    }

    /**
     * 初始化数据（打乱二维数组）
     */
    public void initData() {
        //准备Random对象
        Random r = new Random();
        //遍历二位数组，获取到每一个元素
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                int randomX = r.nextInt(4);
                int randomY = r.nextInt(4);
                // data[i][j]和一个随机索引所指向的元素进行交换
                //data[randomX][randomY]
                int temp = data[i][j];
                data[i][j] = data[randomX][randomY];
                data[randomX][randomY] = temp;
            }
        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] == 0) {
                    row = i;
                    column = j;
                }
            }
        }
        System.out.println(row);
        System.out.println(column);
    }


    /**
     * 此方法用于初始化窗体
     */
    public void initFrame() {
        //设置窗体大小
        setSize(514, 595);
        //设置窗体的关闭模式
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //设置窗体的标题
        setTitle("石头迷阵单机版V1.0");
        //设置窗体置顶
        setAlwaysOnTop(true);//让窗体一直在最上层
        //设置窗体居中
        setLocationRelativeTo(null);//会让窗体一出现就在屏幕中间的位置

        //取消默认布局
        setLayout(null);
    }

    /**
     * 此方法用于绘制游戏界面
     */
    public void paintView() {

        getContentPane().removeAll();

        if (victory()) {
            //加载胜利图片资源，添加到窗体中
            JLabel winLable = new JLabel(new ImageIcon("D:\\image\\win.jpg"));
            winLable.setBounds(124, 230, 260, 88);
            getContentPane().add(winLable);

        }

        JButton btn = new JButton("重新游戏");
        btn.setBounds(350, 20, 100, 20);
        getContentPane().add(btn);
        btn.setFocusable(false);//取消焦点 以免事件冲突
        btn.addActionListener(e -> {
            count = 0;
            initData();//打乱
            paintView();//重新绘制界面
        });//new ~~~ 就是给了actionlistener的实习类对象

        JLabel scoreLabel = new JLabel("步数为:" + count);
        scoreLabel.setBounds(50, 20, 100, 20);
        getContentPane().add(scoreLabel);

        for (int i = 0; i < 4; i++) {
            //i = 0 1 2 3

            for (int j = 0; j < 4; j++) {
                //j = 0 1 2 3
                JLabel imageLabel = new JLabel(new ImageIcon("D:\\image\\" + data[i][j] + ".jpg"));
                imageLabel.setBounds(50 + 100 * j, 90 + 100 * i, 100, 100);
                getContentPane().add(imageLabel);
            }
        }

        JLabel background = new JLabel(new ImageIcon("D:\\image\\background.jpg"));
        background.setBounds(26, 30, 450, 484);
        getContentPane().add(background);//因为Mainframe继承了Frame,所以不需要

        getContentPane().repaint();//repaint()就是通知面板做一次刷新

    }


    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        move(keyCode);
        //每一次移动之后，都重新绘制游戏界面
        paintView();
    }

    /**
     * 判断游戏是否胜利
     */
    public boolean victory() {
        int[][] win = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 0}
        };

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != win[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * 此方法用于处理移动业务
     */
    private void move(int keyCode) {
        if (keyCode == 37) {

            if (column == 3) {
                return;
            }

            //空白块和右侧数据做交换
            //data[row][column] data[row][column+1]
            int temp = data[row][column];
            data[row][column] = data[row][column + 1];
            data[row][column + 1] = temp;
            column++;
            count++;
        } else if (keyCode == 38) {
            if (row == 3) {
                return;//把方法结束掉
            }

            //空白块和下面的数据交换
            //data[row][column] data[row+1][]
            int temp = data[row][column];
            data[row][column] = data[row + 1][column];
            data[row + 1][column] = temp;
            row++;
            count++;
        } else if (keyCode == 39) {

            if (column == 0) {
                return;
            }
            //空白块和左侧的数据交换
            //data[row][column] data[row][column-1]
            int temp = data[row][column];
            data[row][column] = data[row][column - 1];
            data[row][column - 1] = temp;
            column--;
            count++;
        } else if (keyCode == 40) {
            if (row == 0) {
                return;//把方法结束掉
            }
            //空白块和上侧的数据交换
            //data [row][column] data[row-1][column]
            int temp = data[row][column];
            data[row][column] = data[row - 1][column];
            data[row - 1][column] = temp;
            row--;
            count++;
        } else if (keyCode == 90) {
            //触发作弊器
            data = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}};

        }
    }

    //----------------------------------------
    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
    //---------------------------------------
}
