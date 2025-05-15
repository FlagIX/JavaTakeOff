package a01immutable;

import java.util.Set;

public class ImmutableDemo2 {
    public static void main(String[] args) {
        //创建不可变的Set集合
        //"张三","李四","王五","赵六"

        //细节：
        //当我们要获取一个不可变的set集合时，里面的参数一定要保证唯一性
        //Set<String> set = Set.of("张三","张三","李四","王五","赵六");

        //一旦创建完毕之后，是无法进行修改的，在下面的代码中，只能进行查询操作
        Set<String> set = Set.of("张三","李四","王五","赵六");

        for (String s : set) {
            System.out.println(s);
        }

        //不能添加，修改，删除
        //list.add("zhangsan");
    }
}
