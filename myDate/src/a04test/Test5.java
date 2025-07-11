package a04test;

import java.time.LocalDate;
import java.util.Calendar;

public class Test5 {
    public static void main(String[] args) {
        //判断任意的一个年份是闰年还是平年
        //要求：用JDK7和JDK8两种方式判断
        //提示：
        //二月有29天是闰年
        //一年有366天是闰年

        //JDK7
        //方法一
        Calendar calendar = Calendar.getInstance();
        calendar.set(2000,2,1);//月份范围0~11
        calendar.add(Calendar.DAY_OF_MONTH,-1);

        int day = calendar.get(Calendar.DAY_OF_MONTH);
        if(day == 29){
            System.out.println("闰年");
        }else {
            System.out.println("不是闰年");
        }

        //方法二
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2001,0,1);
        calendar1.add(Calendar.DAY_OF_YEAR,-1);

        int day1 = calendar1.get(Calendar.DAY_OF_YEAR);
        if(day1 == 366){
            System.out.println("闰年");
        }else {
            System.out.println("不是闰年");
        }

        //JDK8
        //方法一
        LocalDate localDate1 = LocalDate.of(2000, 12, 31);

        if(localDate1.getDayOfYear() == 366){
            System.out.println("闰年");
        }else {
            System.out.println("不是闰年");
        }

        //方法二
        LocalDate localDate2 = LocalDate.of(2000, 3, 1);
        LocalDate minusMonths = localDate2.minusDays(1);
        if(minusMonths.getDayOfMonth() == 29){
            System.out.println("闰年");
        }else{
            System.out.println("不是闰年");
        }

        System.out.println(localDate1.isLeapYear());
    }
}
