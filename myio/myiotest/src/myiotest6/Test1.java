package myiotest6;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //1.把文件中所有的学生信息读取到内存中
        ArrayList<Student> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("myio\\myiotest\\src\\myiotest6\\names.txt"));
        String line;
        while ((line = br.readLine()) != null){
            String[] arr = line.split("-");
            list.add(new Student(arr[0],arr[1],Integer.parseInt(arr[2]),Double.parseDouble(arr[3])));
        }
        br.close();
        //2.计算权重的总和
        double weight = 0;
        for (Student student : list) {
            weight = weight + student.getWeight();
        }
        //3.计算每一个人的实际占比
        //[0.1,0.1,0.1,0.1,0.1,0.1,0.1,0.1,0.1,0.1]
        double[] arr = new double[list.size()];
        int index = 0;
        for (Student student : list) {
            arr[index] = student.getWeight() / weight;
            index++;
        }
        //4.计算每一个人的权重占比范围
        //[0.1,0.1,0.1,0.1,0.1,0.1,0.1,0.1,0.1,0.1]
        //[0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,0.9,1.0]
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
        //5.随机抽取
        //获取一个0.0~1.0之间的随机数
        double number = Math.random();
        //判断number在arr中的位置
        //二分查找法
        //方法回返回：-插入点-1
        int select = -Arrays.binarySearch(arr, number) - 1;
        Student stu = list.get(select);
        System.out.println(stu);
        //6.修改当前学生的权重
        double w = stu.getWeight() / 2;
        stu.setWeight(w);
        //7.把集合中的数据再次写到文件中
        BufferedWriter bw = new BufferedWriter(new FileWriter("myio\\myiotest\\src\\myiotest6\\names.txt"));
        for (Student student : list) {
            bw.write(student.toString());
            bw.newLine();
        }
        bw.close();
    }
}
