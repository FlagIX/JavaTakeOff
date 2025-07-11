package CirculateDemo;

import java.util.Random;
import java.util.Scanner;

//猜数字游戏
//系统随机生成一个1-100之间的数字，使用程序实现猜出这个数字是多少？
//当猜错的时候根据不同情况给出相应的提示

//注意：随机数代码不能写在循环中

//程序拓展：保底机制
public class practice6 {
    public static void main(String[] args) {
        //1.系统生成随机数
        int count = 0;
        Random r = new Random();
        int number = r.nextInt(100)+1;
        while(true){
            //2.猜数字
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你猜的数字");
            int guessNumber = sc.nextInt();
            //3.判断，提示
            count++;
            if(count==5){
                System.out.println("猜中了");
                break;
            }
            if(guessNumber>number){
                System.out.println("你猜的数字"+guessNumber+"大了");
            }
            else if(guessNumber<number){
                System.out.println("你猜的数字"+guessNumber+"小了");
            }
            else{
                System.out.println("恭喜你，猜对了");
                break;
            }
        }

    }
}
