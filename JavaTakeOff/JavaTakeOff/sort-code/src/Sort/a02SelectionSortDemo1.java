package Sort;

public class a02SelectionSortDemo1 {
    public static void main(String[] args) {
        /*
        选择排序：
        1,从0索引开始，跟后面的元素一一比较。
        2,小的放前面，大的放后面。
        3,第一次循环结束后，最小的数据已经确定。
        4,第二次循环从1索引开始以此类推。
*/

        int[] arr = {5, 2, 1, 3, 4};

        //外循环：几轮
        //:表示这一轮中，我拿着哪个索引上的数据跟后面的数据进行比较并交换
        for (int i = 0; i < arr.length - 1; i++) {

            //内循环：每一轮我要干什么事情？
            //拿着i跟i后面的数据进行比较交换
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
