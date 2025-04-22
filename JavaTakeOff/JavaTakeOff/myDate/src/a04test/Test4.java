package a04test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        //请使用代码实现计算你活了多少天，用JDK7和JDK8两种方式完成

        //JDK7
        String birthday = "2005-10-18";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(birthday);
        long time2 = date.getTime();

        long time1 = System.currentTimeMillis();

        System.out.println((time1 - time2)/1000/60/60/24+"天");


        //JDK8

        LocalDate now2 = LocalDate.now();

        LocalDate birthday2 = LocalDate.of(2005, 10, 18);

        System.out.println(ChronoUnit.DAYS.between(birthday2, now2)+"天");
    }
}
