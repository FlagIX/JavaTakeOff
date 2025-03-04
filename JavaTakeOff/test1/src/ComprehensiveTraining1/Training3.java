package ComprehensiveTraining1;

import java.util.Random;

public class Training3 {
    public static void main(String[] args) {
        /*
        需求：
        定义方法实现随机产生一个5位的验证码
        验证码格式：
        长度为5
        前四位是大写字母或者小写字母
        最后一位是数字
        */

        //
        String code = "";
        //定义一个数组，存储大小写字母
        char[] arr = new char[52];
        //添加大小写字母
        for (int i = 0; i < arr.length; i++) {
            if(i<=25){
                arr[i] = (char) (65+i);
            }else{
                arr[i] = (char) (97+i-26);
            }
        }
        Random r = new Random();
        //随机获取52个字母中的4个
        for (int i = 0; i < 4; i++) {
            int IndexRandom = r.nextInt(arr.length);
            code = code + arr[IndexRandom];
        }

        //随机获取一个数字
        int number = r.nextInt(10);
        code = code + number;

        //打印验证码
        System.out.println(code);
    }
}
