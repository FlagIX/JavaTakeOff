package a01immutable;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ImmutableDemo1 {
    public static void main(String[] args) {
        //创建不可变的List集合
        //"张三","李四","王五","赵六"

        List<String> list = List.of("张三","李四","王五","赵六");
        System.out.println(list.get(0));

        System.out.println("-----------------");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-----------------");

        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }
        System.out.println("-----------------");
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //不能添加，修改，删除
        //list.add("zhangsan");
    }
}
