package ComprehensiveTraining1;

import java.util.Random;
import java.util.Scanner;

//双色球彩票系统
// 红球：6个，范围1-33，不能重复
// 蓝球：1个，范围1-16
// 系统随机生成一注彩票（中奖号码）
// 用户输入自己的彩票号码
// 打印中奖情况
public class Training11 {
    public static void main(String[] args) {
        int [] redBall = new int[6];
        int [] blueBall = new int[1];
        //红球
        Random r = new Random();
        for (int i = 0; i < redBall.length; i++) {
            int redNumber = r.nextInt(33)+1;
            //判断是否重复
            boolean flag = contains(redBall,redNumber);
            if(!flag){
                redBall[i]=redNumber;
            }
        }
        //蓝球
        for (int i = 0; i < blueBall.length; i++) {
            int blueNumber = r.nextInt(16)+1;
            //不需要判断重复
            blueBall[i]=blueNumber;
        }
        //用户选择号码
        int [] userRedBall = new int[6];
        int [] userBlueBall = new int[1];
        Scanner sc = new Scanner(System.in);
        //红球
        for (int i = 0; i < userRedBall.length; i++) {
            int redNumber = sc.nextInt();
            //判断是否重复
            boolean flag = contains(userRedBall,redNumber);
            if(!flag){
                userRedBall[i]=redNumber;
            }
        }
        //蓝球
        for (int i = 0; i < userBlueBall.length; i++) {
            int blueNumber = sc.nextInt();
            //不需要判断重复
            userBlueBall[i]=blueNumber;
        }
        //判断红球中奖情况
        int redCount = 0;
        for (int i = 0; i < userRedBall.length; i++) {
            for (int j = 0; j < redBall.length; j++) {
                if(userRedBall[i]==redBall[j]){
                    redCount++;
                    break;
                }
            }
        }
        //判断蓝球中奖情况
        int blueCount = 0;
        for (int i = 0; i < userBlueBall.length; i++) {
            for (int j = 0; j < blueBall.length; j++) {
                if(userBlueBall[i]==blueBall[j]){
                    blueCount++;
                    break;
                }
            }
        }
        //打印中奖号码
        for (int i = 0; i < redBall.length; i++) {
            System.out.print(redBall[i]+" ");
        }
        System.out.println(blueBall[0]+" ");
        //打印中奖情况
        if(redCount==6&&blueCount==1){
            System.out.println("恭喜你中奖了，一等奖1000万元");
        }
        else if(redCount==6&&blueCount==0){
            System.out.println("恭喜你中奖了，二等奖500万元");
        }
        else if(redCount==5&&blueCount==1){
            System.out.println("恭喜你中奖了，三等奖3000元");
        }
        else if((redCount==5&&blueCount==0)||(redCount==4&&blueCount==1)){
            System.out.println("恭喜你中奖了，四等奖200元");
        }
        else if((redCount==4&&blueCount==0)||(redCount==3&&blueCount==1)){
            System.out.println("恭喜你中奖了，五等奖10元");
        }
        else if((redCount==2&&blueCount==1)||(redCount==1&&blueCount==1)||(redCount==0&&blueCount==1)){
            System.out.println("恭喜你中奖了，六等奖5元");
        }
        else{
            System.out.println("很遗憾，没有中奖");
        }

    }
    public static boolean contains(int [] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==number){
                return true;
            }
        }
        return false;
    }
}
