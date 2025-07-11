package a04mytreemap;

import java.util.TreeMap;
import java.util.function.BiConsumer;

public class a03TreeMapDemo3 {
    public static void main(String[] args) {
        /*需求：字符串“aababcabcdabcde”
            请统计字符串中每一个字符出现的次数，并按照以下格式输出
            输出结果：
            a(5)b(4)c(3)d(2)e(1)*/

        TreeMap<Character, Integer> tm = new TreeMap<>();
        String str = "aababcabcdabcde";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (tm.containsKey(c)) {
                int count = tm.get(c);
                count++;
                tm.put(c, count);
            } else {
                tm.put(c, 1);
            }
        }

        tm.forEach(new BiConsumer<Character, Integer>() {
            @Override
            public void accept(Character character, Integer integer) {
                System.out.print(character + "(" + integer + ")");
            }
        });
    }
}
