package a01jdk7datedemo;

import java.util.Date;
import java.util.Random;

public class DateDemo2 {
    public static void main(String[] args) {
        /*
            需求1：打印时间原点开始一年之后的时间
            需求2：定义任意两个Date对象，比较一下哪个时间在前，哪个时间在后

         */

        //需求1：打印时间原点开始一年之后的时间
        extracted();

        //需求2：定义任意两个Date对象，比较一下哪个时间在前，哪个时间在后
        compare();
    }

    private static void compare() {

        Random random = new Random();
        Date d1 = new Date(Math.abs(random.nextInt()));
        Date d2 = new Date(Math.abs(random.nextInt()));

        long t1 = d1.getTime();
        long t2 = d2.getTime();

        System.out.println(t1);
        System.out.println(t2);

        if(t1 > t2){
            System.out.println("d2在前，d1在后");
        } else if (t2 > t1) {
            System.out.println("d1在前，d2在后");
        }else {
            System.out.println("相同时间");
        }
    }

    private static void extracted() {

        Date d1 = new Date(0L);
        d1.setTime(1000L*24*60*60*365);
        System.out.println(d1);
    }
}
