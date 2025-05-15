package a01immutable;

import java.util.HashMap;
import java.util.Map;

public class ImmutableDemo4 {
    public static void main(String[] args) {
        //创建Map的不可变集合，键值对的数量超过10个

        HashMap<String,String> hm = new HashMap<>();
        hm.put("a","1");
        hm.put("b","2");
        hm.put("c","3");
        hm.put("d","4");
        hm.put("e","5");
        hm.put("f","6");
        hm.put("g","7");
        hm.put("h","8");
        hm.put("i","9");
        hm.put("j","10");
        hm.put("k","11");

        //2.利用上面的数据来获取一个不可变的集合
/*
        //获取到所有的键值对对象(Entry对象)
        Set<Map.Entry<String, String>> entries = hm.entrySet();
        //把entries变成一个数组
        Map.Entry[] arr1 = new Map.Entry[0];
        //toArray方法在底层会比较集合的长度跟数组的长度两者的大小
        //如果集合的长度>数组的长度：数据在数组中放不下，此时会根据实际数据的个数，重新创建数组
        //如果集合的长度<=数组的长度：数据在数组中放的下，此时不会创建新的数组，而是直接用
        Map.Entry[] arr2 = entries.toArray(arr1);
        //不可变的map集合
        Map map = Map.ofEntries(arr2);
        map.put("l","12");
        */

//        Map.ofEntries(hm.entrySet().toArray(new Map.Entry[0]));

        Map<String, String> map = Map.copyOf(hm);
        map.put("l","12");
    }
}
