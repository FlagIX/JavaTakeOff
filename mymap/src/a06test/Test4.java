package a06test;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        //需求：
        //定义一个Map集合，键用表示省份名称province,值表示市city,但是市会有多个。
        //添加完毕后，遍历结果格式如下：
        //江苏省=南京市，扬州市，苏州市，无锡市，常州市
        //湖北省=武汉市，孝感市，十堰市，宜昌市，鄂州市
        //河北省=石家庄市，唐山市，邢台市，保定市，张家口市

        //创建集合
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        //添加元素
        Collections.addAll(list1, "南京市", "扬州市", "苏州市", "无锡市", "常州市");
        Collections.addAll(list2, "武汉市", "孝感市", "十堰市", "宜昌市", "鄂州市");
        Collections.addAll(list3, "石家庄市", "唐山市", "邢台市", "保定市", "张家口市");

        //创建集合
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        hm.put("江苏省", list1);
        hm.put("湖北省", list2);
        hm.put("河北省", list3);

        Set<Map.Entry<String, ArrayList<String>>> entries = hm.entrySet();
        //外循环：遍历entries得到每一个键值对对象
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            String key = entry.getKey();
            ArrayList<String> value = entry.getValue();
            StringJoiner sj = new StringJoiner(",", "", "");
            //内循环：遍历value集合得到每一个值
            for (String s : value) {
                sj.add(s);
            }
            System.out.println(key + "=" + sj);
        }
    }
}
