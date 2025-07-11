package a02jdk8datedemo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class a05LocalDateDemo {
    public static void main(String[] args) {
        //1.获取当前时间的日历对象（包含年月日）
        LocalDate date1 = LocalDate.now();
        System.out.println(date1);

        //2.获取指定的时间的日历对象
        LocalDate date2 = LocalDate.of(2018, 4, 21);
        System.out.println(date2);

        //3.get系列方法获取日历中的每一个属性值
        //获取年
        int year = date1.getYear();
        System.out.println(year);

        //获取月
        //方式一
        Month month = date1.getMonth();
        System.out.println(month);

        //方式二
        int monthValue = date1.getMonthValue();
        System.out.println(monthValue);

        //获取日
        int dayOfMonth = date1.getDayOfMonth();
        System.out.println(dayOfMonth);

        //获取一年的第几天
        int dayOfYear = date1.getDayOfYear();
        System.out.println(dayOfYear);

        //获取星期
        DayOfWeek dayOfWeek = date1.getDayOfWeek();
        System.out.println(dayOfWeek);
        System.out.println(dayOfWeek.getValue());

        //is开头的方法表示判断
        System.out.println(date1.isBefore(date2));
        System.out.println(date1.isAfter(date2));

        //with开头的方法表示修改，只能修改年月日
        LocalDate withYear = date1.withYear(2000);
        System.out.println(withYear);

        //minus开头的方法表示减少，只能减少年月日
        LocalDate minusYears = date1.minusYears(1);
        System.out.println(minusYears);

        //plus开头的方法表示增加，只能增加年月日
        LocalDate plusYears = date1.plusYears(1);
        System.out.println(plusYears);


        System.out.println("----------------------------");
        ////判断今天是否是你的生日
        LocalDate birthday = LocalDate.of(2005, 10, 18);
        LocalDate now = LocalDate.now();

        MonthDay birthMD = MonthDay.of(birthday.getMonthValue(), birthday.getDayOfMonth());
        MonthDay nowMD = MonthDay.from(now);

        System.out.println("今天是你的生日吗？"+nowMD.equals(birthMD));
    }
}
