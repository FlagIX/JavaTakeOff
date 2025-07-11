package a04test;

public class Test3 {
    public static void main(String[] args) {
        //定义一个方法自己实现toBinaryString方法的效果，将一个十进制整数转成字符串表示的二进制

        String str = toBinaryString(6);

        System.out.println(str);
    }
    public static String toBinaryString(int num){
        StringBuilder sb = new StringBuilder();
        while (true){

            if(num == 0){
                break;
            }

            int i = num % 2;

            num = num / 2;

            sb.append(i);

        }
        StringBuilder reverse = sb.reverse();
        return reverse.toString();
    }
}
