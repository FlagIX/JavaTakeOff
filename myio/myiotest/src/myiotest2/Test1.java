package myiotest2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
    /*
    需求：
        有一个文件里面存储了班级同学的信息，每一个信息占一行。
        格式为：张三-男-23
        要求通过程序实现随机点名器。
    运行效果：
        第一次运行程序：随机同学姓名1（只显示名字）
        第二次运行程序：随机同学姓名2（只显示名字)
        第三次运行程序：随机同学姓名3（只显示名字)
     */
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("myio\\myiotest\\names.txt"));
        String ch;
        while ((ch = br.readLine()) != null){
            list.add(ch.split("-")[0]);
        }
        br.close();

        Collections.shuffle(list);
        System.out.println(list.get(0));
    }
}
