package doudizhu1;

import java.util.ArrayList;
import java.util.Collections;

public class pokerGames {

    //创建集合（牌库）
    static ArrayList<String> list = new ArrayList<>();

    //静态代码块
    //特点：随着类的加载而在加载的，而且只执行一次。
    static {
        //"♦"，"♣"，"♥"，"♠"
        //"3","4","5","6","7","8","9","10","J"，"Q","K","A","2"
        //"black"JOKER,"red"JOKER

        //准备牌
        String[] color = {"♦", "♣", "♥", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        //将花色和数字拼接
        for (String c : color) {
            for (String n : number) {
                list.add(c + n);
            }
        }
        list.add("redJOKER");
        list.add("blackJOKER");

    }

    public pokerGames() {
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

        //看牌
        lookPoker("底牌" , lord);
        lookPoker("yzk" , player1);
        lookPoker("yzj" , player2);
        lookPoker("hhh" , player3);

    }

    public static void lookPoker(String name, ArrayList<String> list) {
        System.out.print(name + ":");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
    }


}



