package com.itheima.doudizhu1;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {

    //牌盒
    //"♥3","♠3"
    static ArrayList<String>list = new ArrayList<>();

    //准备牌
    //静态代码块
    //特点:随着类的加载而在加载的,而且只执行一次
    static{
        //"♣","♦","♥","♠"
        //"3","4","5","6","7","8","9","10","J","Q","K","A","2"
        String[]color = {"♣","♦","♥","♠"};
        String[] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};




        for (String c : color) {
            //c依次表示每一种花色
            for (String n : number) {
              list.add(c + n);


            }
        }

        list.add("小王");
        list.add("大王");

    }



    public PokerGame(){
        //洗牌
        Collections.shuffle(list);

        System.out.println(list);
        //发牌

        //看牌
    }





}
