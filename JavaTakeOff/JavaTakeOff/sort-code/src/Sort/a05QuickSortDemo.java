package Sort;

import java.util.Random;

public class a05QuickSortDemo {
    public static void main(String[] args) {
        /*
            快速排序：
            第一轮：以0索引的数字为基准数，确定基准数在数组中正确的位置。
            比基准数小的全部在左边，比基准数大的全部在右边。
            后面以此类推。
*/
//        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 16, 8};

        int[] arr = new int[1000000];

        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
        }

        long start = System.currentTimeMillis();
        quickSort(arr, 0, arr.length - 1);
        long end = System.currentTimeMillis();

        System.out.println(end - start);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
    }

    public static void quickSort(int[] arr, int i, int j) {
        //定义两个变量记录要查找的范围
        int start = i;
        int end = j;

        if (start > end) {
            return;
        }
        //记录基准数
        int baseNumber = arr[i];

        //利用循环找到需要交换的数字
        while (start != end) {
            //利用end，从后往前，找比基准数小的元素
            while (true) {
                if (end <= start || arr[end] < baseNumber) {
                    break;
                }
                end--;
            }
            //利用start，从前往后，找比基准数大的元素
            while (true) {
                if (end <= start || arr[start] > baseNumber) {
                    break;
                }
                start++;
            }
            //将start和end对应的元素交换
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
        }

        //当start和end指向了同一个元素的时候，那么上面的循环就会结束
        //表示已经找到了基准数在数组中应存入的位置
        //基准数归位
        //就是拿着这个范围中的第一个数字，跟start指向的元素进行交换
        int temp = arr[start];
        arr[start] = arr[i];
        arr[i] = temp;

        //确定6左边的范围，重复刚刚所做的事情
        quickSort(arr, i, start - 1);
        //确定6右边的范围，重复刚刚所做的事情
        quickSort(arr, start + 1, j);
    }
}
