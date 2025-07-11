package test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

public class Test3 {
    public static void main(String[] args) throws IOException {
        /*
        文本文件中有以下的数据：
        2-1-9-4-7-8
        将文件中的数据进行排序，变成以下的数据：
        1-2-4-7-8-9
        */

        //读取文件数据
        FileReader fr = new FileReader("myio\\b.txt");
        StringBuilder sb = new StringBuilder();
        int b;
        while ((b = fr.read()) != -1){
            sb.append((char) b);
        }
        fr.close();

        //排序
        //2-1-9-4-7-8
        String str = sb.toString();
        String[] split = str.split("-");

        ArrayList<Integer> list = new ArrayList<>();

        for (String s : split) {
            int i = Integer.parseInt(s);
            list.add(i);
        }

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        //将排序后的数据写入文件
        FileWriter fw = new FileWriter("myio\\b.txt");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1){
                fw.write(list.get(i) + "");
            }else {
                fw.write(list.get(i) + "-");
            }
        }
        fw.close();
    }
}
