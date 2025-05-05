package a01mymap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class a02MapDemo2 {
    public static void main(String[] args) {
        //Map集合的第一种遍历方式(键找值)


        //练习一：利用键找值的方式遍历map集合，要求：装着键的单列集合使用增强for的形式进行遍历
        //练习二：利用键找值的方式遍历map集合，要求：装着键的单列集合使用迭代器的形式进行遍历
        //练习三：利用键找值的方式遍历map集合，要求：装着键的单列集合使用lambda表达式的形式进行遍历

        //创建集合并添加元素
        Map<String, String> map = new HashMap<>();

        map.put("尖叫", "5元");
        map.put("冰红茶", "4元");
        map.put("雪碧", "3元");

        //3.通过键找值
        //3.1获取所有的键，把这些键放到一个单列集合当中
        Set<String> keys = map.keySet();
        //3.2遍历单列集合，得到每一个键
        for (String key1 : keys) {
            //3.3利用map集合中的键获取对应的值   get
            String value1 = map.get(key1);
            System.out.println(key1 + "=" + value1);
        }

        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String key2 = it.next();
            String value2 = map.get(key2);
            System.out.println(key2 + "=" + value2);
        }

        keys.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                String value3 = map.get(s);
                System.out.println(s + "=" + value3);
            }
        });
    }
}
