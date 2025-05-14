package doudizhu2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.function.BiConsumer;

public class PokerGame {

    //此时我们只要把牌跟序号产生对应关系就可以了，不需要按照序号进行排序，所以只要Hashmap就可以了

    //创建集合（牌库）
    static HashMap<Integer, String> hm = new HashMap<>();
    //创建集合来存储序号
    static ArrayList<Integer> list = new ArrayList<>();

    static {
        //"♦"，"♣"，"♥"，"♠"
        //"3","4","5","6","7","8","9","10","J"，"Q","K","A","2"
        //"大王""小王"

        //准备牌
        String[] color = {"♦", "♣", "♥", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        int serialnumber = 1;
        for (String n : number) {
            for (String c : color) {
                hm.put(serialnumber, c + n);
                serialnumber++;
            }
        }
        hm.put(serialnumber, "小王");
        serialnumber++;
        hm.put(serialnumber, "大王");

        hm.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer integer, String s) {
                list.add(integer);
            }
        });

    }

    public PokerGame() {
        //洗牌
        Collections.shuffle(list);
        //发牌
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
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
        lookPoker("底牌", lord);
        lookPoker("🐎＋7", player1);
        lookPoker("坤坤", player2);
        lookPoker("奶农", player3);
    }

    public static void lookPoker(String name, TreeSet<Integer> ts) {
        System.out.print(name + ":");
        for (Integer t : ts) {
            String s = hm.get(t);
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
