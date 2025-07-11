package a02jdk8datedemo;

import java.time.ZoneId;
import java.util.Set;

public class a01ZoneIdDemo {
    public static void main(String[] args) {
        /*
            static Set<string>getAvailableZoneIds()     获取Java中支持的所有时区
            static ZoneId systemDefault()               获取系统默认时区
            static ZoneId of(String zoneId)             获取一个指定时区
*/

        //1.获取Java中支持的所有时区
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds.size());
        System.out.println(zoneIds);

        //2.获取系统默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        //3.获取一个指定时区
        ZoneId zoneId1 = ZoneId.of("Asia/Aqtau");
        System.out.println(zoneId1);
    }
}
