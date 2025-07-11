package a04test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //键盘录入一些1~100之间的整数，并添加到集合中。
        //直到集合中所有数据和超过200为止。

        ArrayList<Integer> arrayList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("请输入1~100之间的整数");
            String str = sc.nextLine();

            int num = Integer.parseInt(str);

            if(num<1||num>100){
                System.out.println("数字不合法,重新输入");
                continue;
            }

            arrayList.add(num);

            int sum = getSum(arrayList);

            if(sum > 200){
                System.out.println("已经满足");
                System.out.println(sum);
                break;
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            int num = arrayList.get(i);
            System.out.println(num);
        }
    }

    private static int getSum(ArrayList<Integer> arrayList) {

        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            int num = arrayList.get(i);
            sum = sum + num;
        }
        return sum;
    }
}
