package myiotest8;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        //Properties作为Map集合的操作

        //创建集合
        Properties prop = new Properties();

        //添加数据
        prop.put("aaa","111");
        prop.put("bbb","222");
        prop.put("ccc","333");
        prop.put("ddd","444");

        //遍历
        Set<Map.Entry<Object, Object>> entries = prop.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            System.out.print(entry.getKey());
            System.out.println(entry.getValue());
        }

        //打印
        System.out.println(prop);
    }
}
