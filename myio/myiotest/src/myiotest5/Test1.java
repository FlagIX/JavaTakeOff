package myiotest5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) throws IOException {
        /*
        需求：
            一个文件里面存储了班级同学的姓名，每一个姓名占一行。
            要求通过程序实现随机点名器。
        运行效果：
            被点到的学生不会再被点到
            如果班级中所有的学生都点完了，需要自动的重新开启第二轮点名
            细节1：假设班级有10个学生，每一轮中每一位学生只能被点到一次，程序运行10次，第一轮结束
            细节2：第11次运行的时候，我们自己不需要手动操作本地文件，要求程序自动开始第二纶点名
        */
        ArrayList<String> remainingName = new ArrayList<>();
        ArrayList<String> nameList = new ArrayList<>();

        File remainingFile = new File("myio\\myiotest\\src\\myiotest5\\remainingName.txt");
        if (remainingFile.exists()) {
            BufferedReader br = new BufferedReader(new FileReader("myio\\myiotest\\src\\myiotest5\\remainingName.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                remainingName.add(line);
            }
            br.close();
        } else {
            BufferedReader br = new BufferedReader(new FileReader("myio\\myiotest\\names.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                remainingName.add(line.split("-")[0]);
            }
            br.close();
        }

        File nameFile = new File("myio\\myiotest\\src\\myiotest5\\Name.txt");
        if (nameFile.exists()) {
            BufferedReader br = new BufferedReader(new FileReader("myio\\myiotest\\src\\myiotest5\\Name.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                nameList.add(line);
            }
        }

        if (remainingName.isEmpty()) {
            remainingName.addAll(nameList);
            nameList.clear();
            Collections.shuffle(remainingName);
        }

        String select = remainingName.remove(0);
        nameList.add(select);
        System.out.println("点到的学生是：" + select);

        BufferedWriter bwRemainingName = new BufferedWriter(new FileWriter("myio\\myiotest\\src\\myiotest5\\remainingName.txt"));
        for (String s : remainingName) {
            bwRemainingName.write(s);
            bwRemainingName.newLine();
        }
        bwRemainingName.close();

        BufferedWriter bwNameList = new BufferedWriter(new FileWriter("myio\\myiotest\\src\\myiotest5\\Name.txt"));
        for (String s : nameList) {
            bwNameList.write(s);
            bwNameList.newLine();
        }
        bwNameList.close();
    }
}
