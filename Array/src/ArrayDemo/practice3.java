package ArrayDemo;
//数组的遍历
public class practice3 {
    public static void main(String[] args) {
        int [] arr = {11,22,33,44,55};
        //1.在Java中，数组的长度属性，length
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //拓展
        //idea中提供了一个快捷键，可以快速生成数组遍历的方式
        //arr.fori
    }
}
