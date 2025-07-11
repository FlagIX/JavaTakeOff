package Test;

public class Test4 {
    public static void main(String[] args) {
        /*
        可爱的小明特别喜欢爬楼梯，他有的时候一次爬一个台阶，有的时候一次爬两个台阶。
        如果这个楼梯20个台阶，小明一共有多少种爬法呢？
        运算结果：
        1层台阶    1种爬法
        2层台阶    2种爬法
        7层台阶    21种爬法
                */
        int sum = getSum(20);
        System.out.println(sum);

    }

    public static int getSum(int number){
        if(number == 1){
            return 1;
        }else if(number == 2){
            return 2;
        }else{
            return getSum(number - 1) + getSum(number -2);
        }
    }
}
