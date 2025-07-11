package ComprehensiveTrainingDemo;

public class Training4 {
    public static void main(String[] args) {
        /*需求：
        把一个数组中的元素复制到另一个新数组中去。*/
        //分析：
        //1.定义一个老数组并存储一些元素
        int[] arr = {1,2,3,4,5};
        //2.定义一个新数组的长度跟老数组一致
        int[] newArr = new int[arr.length];
        //3.遍历老数组，得到老数组中的每一个元素，依次存入到新数组当中
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        //4.打印新数组
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
    }
}
