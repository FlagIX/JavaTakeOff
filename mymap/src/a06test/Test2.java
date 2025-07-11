package a06test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        /*班级里有N个学生
            要求：
            70%的概率随机到男生
            30%的概率随机到女生
            "范闲”，"范建"，"范统"，“杜子腾"，"宋合泛"，"侯笼藤"，"朱益群"，"朱穆朗玛峰"，
            "杜琦燕"，"袁明媛"，"李猜"，"田蜜蜜"，
            */
        String[] boys = {"范闲","范建","范统","杜子腾","宋合泛","侯笼藤","朱益群","朱穆朗玛峰"};
        String[] girls = { "杜琦燕","袁明媛","李猜","田蜜蜜"};

        //概率抽取男生女生
        ArrayList<String[]> list = new ArrayList<>();
        Collections.addAll(list,boys,boys,boys,boys,boys,boys,boys,girls,girls,girls);
        Collections.shuffle(list);
        String[] selectedGender = list.get(0);

        //在抽到的数组中随机点名
        Random r = new Random();
        int index = r.nextInt(selectedGender.length);
        System.out.println(selectedGender[index]);


    }
}
