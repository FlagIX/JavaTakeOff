package Test;

public class Test3 {
    public static void main(String[] args) {
        /*  有一堆桃子，猴子第一天吃了其中的一半，并多吃了一个！
            以后每天猴子都吃当前剩下来的一半，然后再多吃一个，
            第10天的时候（还没吃)，发现只剩下一个桃子了，请问，最初总共多少个桃子？
*/
        //用递归求解
        //fn(10) = 1
        //fn(9) = (fn(10)+ 1)*2
        //......

        int sum = getSum(1);
        System.out.println(sum);
    }

    public static int getSum(int day) {
        if (day <= 0 || day >= 11) {
            return -1;
        }
        if (day == 10) {
            return 1;
        }

        return (getSum(day + 1) + 1) * 2;
    }
}
