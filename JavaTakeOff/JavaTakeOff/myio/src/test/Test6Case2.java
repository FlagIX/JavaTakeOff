package test;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test6Case2 {
    public static void main(String[] args) throws IOException {
        //需求：把《出师表》的文章顺序进行恢复到一个新文件中。

        //创建对象
        BufferedReader br = new BufferedReader(new FileReader("JavaTakeOff\\myio\\csb.txt"));

        TreeMap<Integer,String> tm = new TreeMap<>();
        String line;

        while ((line = br.readLine()) != null){
            String[] arr = line.split("\\.");
            //修改顺序
            tm.put(Integer.parseInt(arr[0]),line);
        }

        //恢复到一个新文本
        //创建对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("JavaTakeOff\\myio\\newCsb2.txt"));

        //写入已恢复顺序的文本
        Set<Map.Entry<Integer, String>> entries = tm.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            String value = entry.getValue();
            bw.write(value);
            bw.newLine();
        }

        //关流
        bw.close();
    }
}
