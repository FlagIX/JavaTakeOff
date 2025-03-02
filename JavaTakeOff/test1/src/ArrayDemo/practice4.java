package ArrayDemo;

public class practice4 {
    public static void main(String[] args) {
        //动态初始化
        //数据类型[] 数组名 = new 数据类型[数组长度];
        //在创建时，有我们指定数组的长度，虚拟机给出默认的初始化值
        int[] arr = new int[3];
        //添加
        arr[0] = 11;
        arr[1] = 22;
        //获取
        System.out.println(arr[0]);//11
        System.out.println(arr[1]);//22
        System.out.println(arr[2]);//打印出来的是默认初始化值

        //数组默认初始化值的规律
        //整数类型：默认初始化值8
        //小数类型：默认初始化值0.0
        //字符类型：默认初始化值'/u0000'空格
        //布尔类型：默认初始化值fa1se
        //引用数据类型：默认初始化值null
    }
}
