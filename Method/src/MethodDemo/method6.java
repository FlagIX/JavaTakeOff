package MethodDemo;

//方法传递基本数据类型和引用数据类型的基本原理
public class method6 {
    public static void main(String[] args) {

        //传递基本数据类型时，传递的是真实的数据，形参的改变，不影响实际参数的值
        int number = 100;
        System.out.println("调用change.方法前："+number);//100
        change(number);
        System.out.println("调用change方法后："+number);//100

    }
    public static void change(int number) {
        number = 200;
    }


    /*传递引用数据类型时，传递的是地址值，形参的改变，影响实际参数的值

    public static void main(String[] args) {
        int[] arr = {10, 28, 38};
        System.out.println("调用change方法前：" + arr[1]);//28
        change(arr);
        System.out.println("调用change方法后：" + arr[1]);//288

    }

    public static void change(int[] arr) {
        arr[1] = 288;
    }

     */
}