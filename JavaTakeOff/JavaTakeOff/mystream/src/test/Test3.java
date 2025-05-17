package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {
        //现在有两个ArrayList:集合，
        //第一个集合中：存储6名男演员的名字和年龄。第二个集合中：存储6名女演员的名字和年龄。
        //姓名和年龄中间用逗号隔开。比如：张三，23
        //要求完成如下的操作：
        //1,男演员只要名字为3个字的前两人
        //2,女演员只要姓杨的，并且不要第一个
        //3,把过滤后的男演员姓名和女演员姓名合并到一起
        //4,将上一步的演员信息封装成Actor对象。
        //5,将所有的演员对象都保存到List集合中。
        //备注：演员类Actor,属性只有一个：name,age

        ArrayList<String> actor = new ArrayList<>();
        Collections.addAll(actor, "陈浩,32", "周一飞,22", "陆川,45", "徐天与,23", "沈航,38", "寒冬陈,41");
        ArrayList<String> actress = new ArrayList<>();
        Collections.addAll(actress, "杨雪,26", "杨若曦,22", "杨静娅,35", "林下,29", "苏禹彤,31", "陈感染,46");

        //1,男演员只要名字为3个字的前两人
        Stream<String> actorStream = actor.stream().filter(s -> s.split(",")[0].length() == 3).limit(2);

        //2,女演员只要姓杨的，并且不要第一个
        Stream<String> actressStream = actress.stream().filter(s -> s.split(",")[0].startsWith("杨")).skip(1);

        //3,把过滤后的男演员姓名和女演员姓名合并到一起
        Stream<String> concatStream = Stream.concat(actorStream, actressStream);

        //4,将上一步的演员信息封装成Actor对象。
        //5,将所有的演员对象都保存到List集合中。
        List<Actor> newList = concatStream.map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1]))).collect(Collectors.toList());
        System.out.println(newList);
    }
}
