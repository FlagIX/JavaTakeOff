package ArrayDemo;
//生成10个1-100之间的随机整数存入数组
//求和
//求平均数
//统计有多少个数据比平均值小
import java.util.Random;
public class test4 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int [] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(100)+1;
            arr[i] = number;
            //求和
            sum += arr[i];
        }
        System.out.println("总和是："+sum);
        //求平均数
        double avg = sum/(double)arr.length;
        System.out.println("平均数是："+avg);
        //统计有多少个数据比平均值小
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<avg){
                count++;
            }
        }
        System.out.println("小于平均数的个数是："+count);

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
