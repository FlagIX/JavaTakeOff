package ArrayDemo;

public class practice5 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        //长度为5的数组，索引范围是0~4
        System.out.println(arr[2]);
        //小结：
        //索引越界异常
        //原因：访问了不存在的索引
        //避免：索引的范围
    }
}
