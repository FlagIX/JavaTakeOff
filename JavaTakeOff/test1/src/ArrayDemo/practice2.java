package ArrayDemo;
//索引
public class practice2 {
    public static void main(String[] args) {
        //索引
        //1.获取数组里的元素
        int [] ages = {11,21,31,41,51};
        int number = ages[0];
        System.out.println(number);
        System.out.println(ages[1]);
        //2.把数据存储到数组里
        //细节：一旦覆盖原来的数据，那么原来的数据就不存在了
        ages[1] = 100;
        System.out.println(ages[1]);
    }
}
