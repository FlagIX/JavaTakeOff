package a04test;

public class Test2 {
    public static void main(String[] args) {
        /*
        自己实现parseInt方法的效果，将字符串形式的数据转成整数。
        要求：
        字符串中只能是数字不能有其他字符
        最少1位，最多10位
        0不能开头
                */

        String str = "1234567";

        String regex = "[1-9]\\d{1,9}";

        boolean flag = str.matches(regex);
        if(flag){
            int num = Integer.parseInt(str);
            System.out.println(num);
        }else {
            System.out.println("数字不符合要求");
        }
    }
}
