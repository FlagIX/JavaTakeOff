package a05args;

//可变参数
public class ArgsDemo1 {
    public static void main(String[] args) {
        //计算n个数据的和
        //JDK5
        //可变参数
        //方法形参的个数是可以发生变化的，0     1   2   3...
        //格式：数据类型...名字
        //int...args

        int sum = getSum(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(sum);
    }
    //底层：
    //可变参数底层就是一个数组
    //只不过不需要我们自己创建了，Java会帮我们创建好
    public static int getSum(int...args){
        int sum = 0;
        for (int i : args) {
            sum = sum + i;
        }
        return sum;
    }


}
