package doudizhu3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class PokerGame {
    //创建集合（牌库）
    static ArrayList<String> list = new ArrayList<>();

    //创建集合来存储牌的价值
    static HashMap<String,Integer> hm = new HashMap<>();

    //静态代码块
    //特点：随着类的加载而在加载的，而且只执行一次。
    static {

        //准备牌
        String[] color = {"♦", "♣", "♥", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        //将花色和数字拼接
        for (String c : color) {
            for (String n : number) {
                list.add(c + n);
            }
        }
        list.add(" 小王");
        list.add(" 大王");

        //给hm集合添加牌的价值
        hm.put("J",11);
        hm.put("Q",12);
        hm.put("K",13);
        hm.put("A",14);
        hm.put("2",15);
        hm.put("大王",50);
        hm.put("小王",100);

    }

    public PokerGame() {
        //洗牌
        Collections.shuffle(list);
        //发牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (i <= 2) {
                lord.add(list.get(i));
                continue;
            }
            if (i % 3 == 0) {
                player1.add(list.get(i));
            } else if (i % 3 == 1) {
                player2.add(list.get(i));
            } else {
                player3.add(list.get(i));
            }
        }
        //排序
        order(lord);
        order(player1);
        order(player2);
        order(player3);

        //看牌
        lookPoker("底牌" , lord);
        lookPoker("🐎＋7" , player1);
        lookPoker("坤坤" , player2);
        lookPoker("奶农" , player3);

    }
    public static void order(ArrayList<String> list){
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //获取o1的花色和数字
                String color1 = o1.substring(0, 1);
                int number1 = getValue(o1);
                //获取o2的花色和数字
                String color2 = o2.substring(0, 1);
                int number2 = getValue(o2);

                int i = number1 - number2;
                return i == 0?color1.compareTo(color2):i;
            }
        });

    }

    public static int getValue(String poker){
        String number = poker.substring(1);
        //跟hm集合判断数字是否存在
        if(hm.containsKey(number)){
            //存在，获取对应的价值
            return hm.get(number);
        }else {
            //不存在，将数字强转为价值
            return Integer.parseInt(number);
        }

    }

    public static void lookPoker(String name, ArrayList<String> list) {
        System.out.print(name + ":");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
