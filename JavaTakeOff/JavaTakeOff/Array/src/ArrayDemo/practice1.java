package ArrayDemo;

public class practice1 {
    public static void main(String[] args) {
        //1.定义数组存储5个学生的年龄
        int [] ages = {11,21,31,41,51};
        //2.定义数组存储3个学生的姓名
        String [] names = {"张三","李四","王五"};
        //3.定义数组存储3个学生的身高
        double [] heights = {1.71,1.72,1.73};
        System.out.println(heights);//[D@4eec7777

        //拓展
        //解释一下地址值的格式含义
        //[D@4eec7777
        //[  代表数组
        //D  代表double类型
        //@  分隔符
        //4eec7777  十六进制的内存地址
        //十六进制的内存地址  可以转换为十进制
    }
}
