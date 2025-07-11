package search;

public class a02BinarySearchDemo1 {
    public static void main(String[] args) {
        //二分查找/折半查找
        //核心：
        //每次排除一半的查找范围
        //需求：定义一方法利用二分查找，查询某个元素在数组中的索引
        //数据如下：{7,23,79,81,163,127,131,147}

        int[] arr = {7, 23, 79, 81, 163, 127, 131, 147};
        int i = BinarySearchIndex(arr, 131);
        System.out.println(i);
    }

    public static int BinarySearchIndex(int[] arr, int num) {
        int min = 0;
        int max = arr.length - 1;
        int mid = 0;
        while (true) {
            mid = (min + max) / 2;
            if(min > max){
                System.out.println("元素不在数组中");
                return -1;
            }else if (arr[mid] < num) {
                min = mid + 1;
            } else if (arr[mid] > num) {
                max = mid - 1;
            }else{
                return mid;
            }
        }

    }
}
