package myiotest3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) throws IOException {
        /*
        需求：
            一个文件里面存储了班级同学的信息，每一个学生信息占一行。
            格式为：张三-男-23。
            要求通过程序实现随机点名器。
        运行效果：
            70%的概率随机到男生
            30%的概率随机到女生
            总共随机100万次，统计结果。
            注意观察：看生成男生和女生的比例是不是接近于7：3
            */

        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("myio\\myiotest\\names.txt"));
        String ch;
        while ((ch = br.readLine()) != null) {
            if (ch.split("-")[1].equals("男")) {
                boyList.add(ch.split("-")[0]);
            } else {
                girlList.add(ch.split("-")[0]);
            }
        }
        br.close();

        int girlCount = 0;
        int boyCount = 0;
        Random r = new Random();
        for (int i = 0; i < 1000000; i++) {
            int index = r.nextInt(0,10);
            if (index < 3) {
                Collections.shuffle(girlList);
                System.out.println(girlList.get(0));
                girlCount++;
            }else {
                Collections.shuffle(boyList);
                System.out.println(boyList.get(0));
                boyCount++;
            }
        }
        System.out.println(boyCount+":"+girlCount);
    }
}
