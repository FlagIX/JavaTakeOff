package ArrayDemo;
//变化数据
//遍历数组，如果为奇数，乘以2，如果为偶数，除以2
public class test2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0) {
                arr[i] = arr[i] / 2;
            }
            else{
                arr[i] = arr[i] * 2;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
