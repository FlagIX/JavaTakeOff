package a01mymap;

import java.util.*;
import java.util.function.BiConsumer;

public class a06HashMapDemo2 {
    public static void main(String[] args) {
        //某个班级80名学生，现在需要组成秋游活动，
        //班长提供了四个景点依次是(A、B、C、D)
        //每个学生只能选择一个景点，请统计出最终哪个景点想去的人数最多。

        //创建一个数组来存储景点
        String[] arr = {"A", "B", "C", "D"};

        //将景点随机添加到集合中
        ArrayList<String> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 80; i++) {
            int index = random.nextInt(arr.length);
            list.add(arr[index]);
        }

        //遍历单列集合将景点添加到双列集合中。双列集合判断景点是否存在，存在则次数加一，不存在则添加新的键值对
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String name : list) {
            if (hashMap.containsKey(name)) {
                //获取景点次数
                Integer count = hashMap.get(name);
                //景点次数加一
                count++;
                //将新的次数添加回集合
                hashMap.put(name, count);
            } else {
                hashMap.put(name, 1);
            }
        }

        hashMap.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String key, Integer value) {
                System.out.println(key + ":" + value);
            }
        });

        //求最大值
        int max = 0;
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if (count > max) {
                max = count;
            }
        }

        //比较哪个景点的次数和最大值一样
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if (count == max) {
                System.out.println(entry.getKey());
            }
        }
    }
}
