package StringDemo;

import java.util.Scanner;

//金额转换
public class StringDemo9 {
    public static void main(String[] args) {
        //获取金额
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("请输入金额");
            money = sc.nextInt();
            if(money>=0&&money<=9999999){
                break;
            }else {
                System.out.println("金额无效");
            }
        }
        System.out.println(money);
        //金额数字大写
        String moneyStr = "";
        while (true) {
            //取金额的每一位数字
            int ge = money % 10;
            //去除数字
            money = money / 10;
            //金额大写
            moneyStr = bigNumber(ge) + moneyStr;
            if(money == 0){
                break;
            }
        }
        System.out.println(moneyStr);


        //金额前面补零
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }
        System.out.println(moneyStr);


        //将金额插入
        String [] arr = {"佰","拾","万","仟","佰","拾","元",};
        String result = "";
        for (int i = 0; i < moneyStr.length(); i++) {
            char c = moneyStr.charAt(i);
            result = result + c +arr[i];
        }

        //打印金额
        System.out.println(result);
    }

    public static String bigNumber(int number){
        String [] arrString = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return arrString[number];
    }
}
