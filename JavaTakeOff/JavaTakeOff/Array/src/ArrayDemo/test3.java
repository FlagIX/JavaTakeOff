package ArrayDemo;
//求最值
public class test3 {
    public static void main(String[] args) {
        int [] arr = {33,5,22,17,55};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("最大值是："+max);
    }
}
