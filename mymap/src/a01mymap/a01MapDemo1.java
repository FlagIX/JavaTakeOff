package a01mymap;

import java.util.HashMap;
import java.util.Map;

public class a01MapDemo1 {
    public static void main(String[] args) {
        //V put(K key,V value)
        //添加元素
        //V remove(object key)
        //根据键删除键值对元素
        //void clear()
        //移除所有的键值对元素
        //boolean containsKey(object key)
        //判断集合是否包含指定的键
        //boolean containsValue(object value)
        //判断集合是否包含指定的值
        //boolean isEmpty(）
        //判断集合是否为空
        //int size()
        //集合的长度，也就是集合中键值对的个数

        //创建map集合
        Map<String,String> m = new HashMap<>();

        //添加元素
        //put方法的细节：
        //添加/覆盖
        //在添加数据的时候，如果键不存在，那么直接把键值对对象添加到map集合当中，方法返回null
        //在添加数据的时候，如果键是存在的，那么会把原有的键值对对象覆盖，会把被覆盖的值进行返回。
        String value1 = m.put("尖叫", "5元");
//        System.out.println(value1);
        m.put("冰红茶","4元");
        m.put("雪碧","3元");

//        String value2 = m.put("冰红茶", "4.5元");
//        System.out.println(value2);

        //删除元素
//        String result1 = m.remove("尖叫");
//        System.out.println(result1);//"5元"

        //清空集合
//        m.clear();

        //判断集合是否包含指定的键
        boolean keyResult = m.containsKey("雪碧");
        System.out.println(keyResult);

        //判断集合是否包含指定的值
        boolean valueResult = m.containsValue("3元");
        System.out.println(valueResult);

        //判断集合是否为空
        boolean emptyResult = m.isEmpty();
        System.out.println(emptyResult);

        //集合的长度，也就是集合中键值对的个数
        int size = m.size();
        System.out.println(size);


        //打印集合
        System.out.println(m);
    }
}
