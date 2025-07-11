package StringJoinerDemo;

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {
        //创建对象
        StringJoiner sj = new StringJoiner("---");

        //添加元素
        sj.add("aaa").add("bbb").add("ccc");

        //打印
        System.out.println(sj);
    }
}
