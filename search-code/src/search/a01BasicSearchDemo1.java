package search;

public class a01BasicSearchDemo1 {
    public static void main(String[] args) {
        //基本查找
        //核心：
        //从0索引开始挨个往后查找

        //需求：定义一个方法利用基本查找，查询某个元素是否存在
        //数据如下：{131,127,147,81,103,23,7,79}

        int [] arr = {131,127,147,81,103,23,7,79};
        boolean flag = BasicSearch(arr, 111);
        System.out.println(flag);
    }

    public static boolean BasicSearch(int[] arr,int num){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                return true;
            }
        }
        return false;
    }
}
