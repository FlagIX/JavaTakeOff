package a01staticDemo2;

public class ArrayUtilTest {
    public static void main(String[] args) {
        int arr[] = {10,20,50,34,100};
        String Arr = ArrayUtil.printArr(arr);
        System.out.println(Arr);

        double arr1[] = {11.3,15.1,18.5,19.9,20.7};
        double aerage = ArrayUtil.getAerage(arr1);
        System.out.println(aerage);
    }
}
