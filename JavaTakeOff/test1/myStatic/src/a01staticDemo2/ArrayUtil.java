package a01staticDemo2;

public class ArrayUtil {

    //私有化构造方法
    //目的：为了不让外界创建他的对象
    private ArrayUtil() {
    }


    //需要定义为静态的，方便调用
    public static String printArr(int arr[]){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                sb.append(arr[i] + "]");
            }else {
                sb.append(arr[i] + ",");
            }
        }
        String str = sb.toString();
        return str;
    }

    public static double getAerage(double arr[]){
        double num = 0.0;
        for (int i = 0; i < arr.length; i++) {
            num = num + arr[i];
        }
        double Aerage = num/arr.length;
        return Aerage;
    }
}
