package test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test6 {
    public static void main(String[] args) {
        //需求：统计一个文件夹中每种文件的个数并打印。（考虑子文件夹）
        //打印格式如下：
        //txt:3个
        //doc:4个
        //jpg:2个

        File f = new File("E:\\Java_space\\File\\aaa");
        HashMap<String, Integer> hm = getCount(f);
        System.out.println(hm);
    }

    //作用：
    //      统计一个文件夹中每种文件的个数
    //参数：
    //      要统计的那个文件夹
    //返回值：
    //      用来统计map集合
    //      键：后缀名   值：次数

    //      a.txt
    //      a.a.txt
    //      aaa(不需要统计的)
    public static HashMap<String,Integer> getCount(File f){

        File[] files = f.listFiles();

        HashMap<String,Integer> map = new HashMap<>();

        for (File file : files) {
            if(file.isFile()){
                String name = file.getName();
                String[] arr = name.split("\\.");
                String key = arr[arr.length - 1];
                if(map.containsKey(key)){
                    //存在
                    int count = map.get(key);
                    count++;
                    map.put(key,count);
                }else{
                    //不存在
                    map.put(key,1);
                }
            }else {
                HashMap<String, Integer> sonMap = getCount(file);
                Set<Map.Entry<String, Integer>> entries = sonMap.entrySet();
                for (Map.Entry<String, Integer> entry : entries) {
                    String key = entry.getKey();
                    int value = entry.getValue();
                    if(map.containsKey(key)){
                        //存在
                        int count = map.get(key);
                        count = count + value;
                        map.put(key,count);
                    }else{
                        //不存在
                        map.put(key,value);
                    }
                }
            }
        }

        return map;
    }
}
