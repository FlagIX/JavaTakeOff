package myiotest4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) throws IOException {
        /*
        需求：
            一个文件里面存储了班级同学的姓名，每一个姓名占一行。
            要求通过程序实现随机点名器。
            第三次必定是张三同学
        运行效果：
            第一次运行程序：随机同学姓名1
            第二次运行程序：随机同学姓名2
            第三次运行程序：张三
        */
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("myio\\myiotest\\names.txt"));
        String line;
        while ((line = br.readLine()) != null){
            list.add(line.split("-")[0]);
        }
        br.close();
        BufferedReader brCount = new BufferedReader(new FileReader("myio\\myiotest\\src\\myiotest4\\count.txt"));
        String lineCount;
        lineCount = brCount.readLine();
        int count = Integer.parseInt(lineCount);
        count++;
        brCount.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter("myio\\myiotest\\src\\myiotest4\\count.txt"));
        bw.write(count + "");
        bw.close();

        if(count == 3){
            System.out.println("张三");
        }else {
            Collections.shuffle(list);
            System.out.println(list.get(0));
        }
    }
}
