package a01mymap;

import java.util.HashMap;
import java.util.Map;

public class a04MapDemo4 {
    public static void main(String[] args) {
        //Map集合的第三种遍历方式(lambda表达式)

        //创建map集合并添加元素
        Map<String, String> map = new HashMap<>();

        map.put("尖叫", "5元");
        map.put("冰红茶", "4元");
        map.put("雪碧", "3元");

        //Map集合的第三种遍历方式
        //底层：
        //forEach其实就是利用第二种方式进行遍历，依次得到每一个键和值
        //再调用accept方法
//        map.forEach(new BiConsumer<String, String>() {
//            @Override
//            public void accept(String key, String value) {
//                System.out.println(key + "=" + value);
//            }
//        });

        map.forEach(( key,  value)->System.out.println(key + "=" + value));
    }
}
