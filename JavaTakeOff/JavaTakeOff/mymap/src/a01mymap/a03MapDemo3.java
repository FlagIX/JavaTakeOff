package a01mymap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class a03MapDemo3 {
    public static void main(String[] args) {
        //Map集合的第二种遍历方式(键值对)

        //练习一：利用键值对的方式遍历map集合，要求：装着键的单列集合使用增强for的形式进行遍历
        //练习二：利用键值对的方式遍历map集合，要求：装着键的单列集合使用迭代器的形式进行遍历
        //练习三：利用键值对的方式遍历map集合，要求：装着键的单列集合使用lambda表达式的形式进行遍历


        //创建map集合并添加元素
        Map<String, String> map = new HashMap<>();

        map.put("尖叫", "5元");
        map.put("冰红茶", "4元");
        map.put("雪碧", "3元");

        //3.Map集合的第二种遍历方式
        //通过键值对对象进行遍历
        //3.1通过一个方法获取所有的键值对对象，返回一个Set集合
        Set<Map.Entry<String, String>> entries = map.entrySet();
        //3.2遍历entries.这个集合，去得到里面的每一个键值对对象
        for (Map.Entry<String, String> entry : entries) {
            //3.3利用entry调用get方法获取键和值
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        Iterator<Map.Entry<String, String>> it = entries.iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        entries.forEach(new Consumer<Map.Entry<String, String>>() {
            @Override
            public void accept(Map.Entry<String, String> stringStringEntry) {
                System.out.println(stringStringEntry.getKey() + "=" + stringStringEntry.getValue());
            }
        });
    }
}
