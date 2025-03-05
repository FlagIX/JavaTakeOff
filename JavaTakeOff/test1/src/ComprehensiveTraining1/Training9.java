package ComprehensiveTraining1;

import java.util.Random;

public class Training9 {
    public static void main(String[] args) {
/*需求：
一个大V直播抽奖，奖品是现金红包，分别有{2,588,888,1000,10000}五个奖金。
请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。
打印效果如下：（随机顺序，不一定是下面的顺序）
888元的奖金被抽出
588元的奖金被抽出
10000元的奖金被抽出
1000元的奖金被抽出
2元的奖金被抽出
*/
        //1.定义数组 表示奖池
        int [] arr = {2,588,888,1000,10000};
        //2.定义一个新数组，用于存储抽奖的结果
        int [] arr1 = new int[arr.length];
        //3.抽奖
        Random r = new Random();
        for (int i = 0; i < arr.length;) {
            int RandomIndex = r.nextInt(arr.length);
            int prize = arr[RandomIndex];
            //判断是否已经被抽中
            boolean flag = contains(arr1,prize);
            if(!flag){
                arr1[i]=prize;
                i++;
            }
        }
        //遍历
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]+"元的奖金被抽出");
        }

    }
        //判断是否中奖
    public static boolean contains(int [] arr,int prize){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==prize){
                return true;
            }
        }
        return false;
    }
}
