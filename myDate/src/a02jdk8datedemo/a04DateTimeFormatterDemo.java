package a02jdk8datedemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class a04DateTimeFormatterDemo {
    public static void main(String[] args) {
        /*
            static DateTimeFormatter ofPattern(格式)        获取格式对象
            String format(时间对象)                         按照指定方式格式化

         */
        //获取时间对象
        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));

        //解析/格式化器
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");

        //格式化
        String s = dateTimeFormatter.format(zonedDateTime);
        System.out.println(s);
    }
}
