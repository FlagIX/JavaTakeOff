package a09arraysdemo;

import java.util.Arrays;

public class MyArraysDemo1 {
    public static void main(String[] args) {
        /*
        public static String toString(数组)                               把数组拼接成一个字符串
        public  static  int binarySearch（数组，查找的元素）                    二分查找法查找元素
        public  static  int[]   copyOf（原数组，新数组长度）                      拷贝数组
        public static   int[]   copyOfRange（原数组，起始索引，结束索引）        拷贝数组 (指定范围)
        public  static  void    fill（数组，元素）                                 填充数组
        public static void sort(数组)                                     按照默认方式进行数组排序
        public static void sort(数组，排序规则)                            按照指定的规则排序
                */


        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        //toString:将数组变成字符串
        System.out.println("---------------------toString-------------------");
        System.out.println(Arrays.toString(arr));


        //binarySearch:二分查找法查找元素
        //细节1：二分查找的前提：数组中的元素必须是有序，数组中的元素必须是升序的
        //细节2：如果要查找的元素是存在的，那么返回的是真实的索引
        //但是，如果要查找的元素是不存在的，返回的是-插入点·1
        //-10 - 1
        //疑问：为什么要减1呢？
        //解释：如果此时，我现在要查找数字0，那么如果返回的值是-插入点，就会出现问题了。
        //如果要查找数字0，此时o是不存在的，但是按照上面的规则-插入点，应该就是-0
        //为了避免这样的情况，Java在这个基础上又减一。
        System.out.println("---------------------binarySearch-------------------");
        System.out.println(Arrays.binarySearch(arr, 5));//4
        System.out.println(Arrays.binarySearch(arr, 20));//-11

        //copyOf    拷贝数组
        //参数一：老数组
        //参数二：新数组的长度
        //方法的底层会根据第二个参数来创建新的数组
        //如果新数组的长度是小于老数组的长度，会部分拷贝
        //如果新数组的长度是等于老数组的长度，会完全拷贝
        //如果新数组的长度是大于老数组的长度，会补上默认初始值
        System.out.println("---------------------copyOf-------------------");
        int[] newArr = Arrays.copyOf(arr, 20);
        System.out.println(Arrays.toString(newArr));

        //copyOfRange       拷贝数组 (指定范围)
        //细节：包头不包尾，包左不包右
        System.out.println("---------------------copyOfRange-------------------");
        int[] copyArr = Arrays.copyOfRange(arr, 3, 9);
        System.out.println(Arrays.toString(copyArr));

        //fill  填充数组
        System.out.println("---------------------fill-------------------");
        Arrays.fill(arr,11);
        System.out.println(Arrays.toString(arr));

        //sort:排序。默认情况下，给基本数据类型进行升序排列。底层使用的是快速排序
        System.out.println("---------------------sort-------------------");
        int[] arr2 = {10,3,1,2,9,8,6,4,5,7};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
