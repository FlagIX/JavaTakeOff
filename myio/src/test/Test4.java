package test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) throws IOException {
        /*
        文本文件中有以下的数据：
        2-1-9-4-7-8
        将文件中的数据进行排序，变成以下的数据：
        1-2-4-7-8-9

        细节1：
        文件中的数据不要换行

        细节2：
        bom头
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
        Integer[] array = Arrays.stream(sb.toString().split("-"))
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);


        //将排序后的数据写入文件
        FileWriter fw = new FileWriter("myio\\b.txt");
        String s = Arrays.toString(array).replace(", ","-");
        String result = s.substring(1, s.length() - 1);
        fw.write(result);
        fw.close();
    }
}
