package a02jdk8datedemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class a03ZonedDateTimeDemo {
    public static void main(String[] args) {
        /*
            static ZonedDateTime now()获取当前时间的ZonedDateTime对象
            static ZonedDateTime ofXxxx(。。。)获取指定时间的ZonedDateTime对象
            ZonedDateTime withXxx(时间)修改时间系列的方法
            ZonedDateTime minusXxx(时间)减少时间系列的方法
            ZonedDateTime plusXxx(时间)增加时间系列的方法
*/

        //1.获取当前时间对象（带时区）
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        //2.获取指定的时间对象（带时区）
        //年月日时分秒纳秒方式指定
        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(2025, 4, 21, 14, 38, 12, 0, ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime1);

        //通过Instant+时区的方式指定获取时间对象
        Instant instant = Instant.ofEpochMilli(0L);
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        ZonedDateTime zonedDateTime2 = ZonedDateTime.ofInstant(instant, zoneId);
        System.out.println(zonedDateTime2);

        //3.withXxx修改时间系列的方法
        ZonedDateTime zonedDateTime3 = zonedDateTime2.withYear(2000);
        System.out.println(zonedDateTime3);

        //4.减少时间
        ZonedDateTime zonedDateTime4 = zonedDateTime2.minusYears(1);
        System.out.println(zonedDateTime4);

        //5.增加时间
        ZonedDateTime zonedDateTime5 = zonedDateTime2.plusYears(1);
        System.out.println(zonedDateTime5);

        //细节：
        //JDK8新增的时间对象都是不可变的
        //如果我们修改了，减少了，增加了时间
        //那么调用者是不会发生改变的，产生一个新的时间。
    }
}
