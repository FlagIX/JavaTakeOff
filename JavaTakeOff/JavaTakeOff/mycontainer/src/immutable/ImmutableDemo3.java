package immutable;

import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class ImmutableDemo3 {
    public static void main(String[] args) {

        //创建不可变的Map集合

        //创建Map的不可变集合
        //细节1：
        //键是不能重复的
        //细节2：
        //Map里面的of方法，参数是有上限的，最多只能传递20个参数，10个键值对
        //细节3：
        //如果我们要传递多个键值对对象，数量大于10个，在Map接口中还有一个方法

        //"张三","南京","李四”,"北京","王五","上海"

        //一旦创建完毕之后，是无法进行修改的，在下面的代码中，只能进行查询操作
        Map<String, String> map = Map.of("张三", "南京", "李四", "北京", "王五", "上海");

        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            String value = map.get(key);
            System.out.println(key + "," + value);
        }
        System.out.println("----------------");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "," + value);
        }
        System.out.println("----------------");

        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + "," + value);
            }
        });
    }
}
