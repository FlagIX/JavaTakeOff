package test;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Test6Case1 {
    public static void main(String[] args) throws IOException {
        //需求：把《出师表》的文章顺序进行恢复到一个新文件中。

        //创建对象
        BufferedReader br = new BufferedReader(new FileReader("JavaTakeOff\\myio\\csb.txt"));
        //存储未恢复顺序的文本
        ArrayList<String> list = new ArrayList<>();
        //存储已恢复顺序的文本
        ArrayList<String> newList = new ArrayList<>();

        String len;
        while ((len = br.readLine()) != null){
            list.add(len);
        }

        //修改顺序
        list.stream().sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i1 = Integer.parseInt(o1.substring(0, 1));
                int i2 = Integer.parseInt(o2.substring(0, 1));

                return i1 - i2;
            }
        }).forEach(s -> newList.add(s));

        //恢复到一个新文本
        //创建对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("JavaTakeOff\\myio\\newCsb.txt"));

        //写入已恢复顺序的文本
        for (String s : newList) {
            bw.write(s);
            bw.newLine();
        }

        //关流
        bw.close();
    }
}
