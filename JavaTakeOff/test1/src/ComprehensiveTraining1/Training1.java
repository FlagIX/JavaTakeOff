package ComprehensiveTraining1;

import java.util.Scanner;

//卖飞机票
public class Training1 {
    public static void main(String[] args) {
        //需求：
        //机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
        //按照如下规则计算机票价格：旺季（5-10月)头等舱9折，经济舱8.5折，淡季（11月到来年4月)头等舱7折，经济舱6.5折。

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价");
        int money = sc.nextInt();

        System.out.println("请输入月份");
        int month = sc.nextInt();

        System.out.println("请输入头等舱0或经济舱1");
        int seat = sc.nextInt();

        double num = 0;

        //ctrl+P 自动生成参数
        //ctrl+alt+M 自动抽取方法

        if (month >= 5 && month <= 10) {
            //旺季
           num = getTicket(money,seat,0.9,0.85);
        }else if ((month >= 1 && month <= 4)||(month>=11&&month<=12)){
            //淡季
            num = getTicket(money,seat,0.7,0.65);
        }else {
            System.out.println("输入有误");
        }

        System.out.println(num);
    }

    public static double getTicket(int money,int seat,double v0,double v1){
        double num = 0;
        if (seat == 0) {
            num = money * v0;
        } else if (seat == 1) {
            num = (int) money * v1;
        }else {
            System.out.println("输入有误");
        }
        return num;
    }
}

