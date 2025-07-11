package a08regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo10 {
    public static void main(String[] args) {
        /*有如下文本，请按照要求爬取数据。
            Java自从95年问世以来，经历了很多版本，abbbbbbbbbbbbbbbbbbbbaaaaaaaaaaaaaaaaa目前企业中用的最多的是Java8和Java11,因为这两个是长期支持版本，
            下一个长期支持版本是]ava17,相信在未来不久Java17也会逐渐登上历史舞台

            需求1：按照ab+的方式爬取ab,b尽可能多获取
            需求2：按照ab+的方式爬取ab,b尽可能少获取


            只写+和*表示贪婪匹配
            +?非贪婪匹配
            *?非贪婪匹配
         */
        String text = "Java自从95年问世以来，经历了很多版本，abbbbbbbbbbbbbbbbbbbbaaaaaaaaaaaaaaaaa目前企业中用的最多的是Java8和Java11,因为这两个是长期支持版本，\n" +
                "            下一个长期支持版本是]ava17,相信在未来不久Java17也会逐渐登上历史舞台";

        //需求一
        String regex1 = "ab+";
        //需求二
        String regex2 = "ab+?";

        Pattern p = Pattern.compile(regex2);

        Matcher m = p.matcher(text);

        while (m.find()){
            String s = m.group();
            System.out.println(s);
        }

    }
}
