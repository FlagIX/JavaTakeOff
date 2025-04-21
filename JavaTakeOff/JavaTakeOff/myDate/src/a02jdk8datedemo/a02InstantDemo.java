package a02jdk8datedemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class a02InstantDemo {
    public static void main(String[] args) {
        /*
            时间戳

            static Instant now()                            获取当前时间的Instant对象（标准时间）
            static Instant ofXxxx(long epochMilli)          根据（秒/毫秒/纳秒）获取Instant对象
            ZonedDateTime atZone(ZoneId zone)               指定时区
            boolean isXxx(Instant otherInstant)             判断系列的方法
            Instant minusXxx(long millisToSubtract)         减少时间系列的方法
            Instant plusXxx(long millisToSubtract)          增加时间系列的方法

         */

        //1.获取当前时间的Instant对象（标准时间）
//        Instant now = Instant.now();
//        System.out.println(now);

        //2.根据（秒/毫秒/纳秒）获取Instant对象
        Instant instant1 = Instant.ofEpochSecond(0L);
        System.out.println(instant1);

        Instant instant2 = Instant.ofEpochMilli(1000L);
        System.out.println(instant2);

        Instant instant3 = Instant.ofEpochSecond(1L, 1000000000L);
        System.out.println(instant3);

        //3.指定时区
        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime);

        //4.判断系列的方法
        Instant instant4 = Instant.ofEpochMilli(1000L);
        Instant instant5 = Instant.ofEpochMilli(1000000L);
        //isBefore:判断调用者代表的时间是否在参数表示时间的前面
        boolean result1 = instant4.isBefore(instant5);
        System.out.println(result1);

        //isAfter:判断调用者代表的时间是否在参数表示时间的后面
        boolean result2 = instant4.isAfter(instant5);
        System.out.println(result2);

        //5.减少时间系列的方法
        Instant instant6 = Instant.ofEpochMilli(1000L);
        Instant instant7 = instant6.minusMillis(1000L);
        System.out.println(instant7);

        //6.增加时间系列的方法
        Instant instant8 = Instant.ofEpochMilli(1000L);
        Instant instant9 = instant8.plusMillis(1000L);
        System.out.println(instant9);
    }
}
