package a06bigintegerdemo;

import java.math.BigInteger;

public class BigIntegerDemo1 {
    public static void main(String[] args) {
        /*
            public BigInteger(int num,Random rnd)           获取随机大整数，范围：[0~2的num次方-1]
            public BigInteger(String val)                   获取指定的大整数
            public BigInteger(String val,int radix)         获取指定进制的大整数

            public static BigInteger valueof(long val)      静态方法获取BigInteger的对象，内部有优化
            细节：
            对象一旦创建里面的数据不能发生改变。
        */


        //1.获取随机大整数，范围：[0~2的num次方-1]
//        Random r = new Random();
//        BigInteger bigInteger1 = new BigInteger(4,r);//[0 ~ 2^4-1]
//        System.out.println(bigInteger1);


        //2.获取指定的大整数
        //细节：字符串中必须是整数，否则会报错
//        BigInteger bigInteger2 = new BigInteger("9223372036854775808");
//        System.out.println(bigInteger2);

//        BigInteger bigInteger3 = new BigInteger("abc");
//        System.out.println(bigInteger3);



        //3.获取指定进制的大整数
        //细节：
        //1.字符串中的数字必须是整数
        //2.字符串中的数字必须要跟进制吻合。
        //比如二进制中，那么只能写0和1，写其他的就报错。
//        BigInteger bigInteger4 = new BigInteger("01010100010010",2);
//        System.out.println(bigInteger4);



        //4.静态方法获取BigInteger的对象，内部有优化
        //细节：
        //1.能表示范围比较小，只能在long的取值范围之内，如果超出long的范围就不行了。
        //2.在内部对常用的数字：-16 ~ 16进行了优化。
        //提前把-16 ~ 16先创建好BigInteger的对象，如果多次获取不会重新创建新的。
//        BigInteger bigInteger5 = BigInteger.valueOf(9223372036854775807L);
//        System.out.println(bigInteger5);


//        BigInteger bd1 = BigInteger.valueOf(16);
//        BigInteger bd2 = BigInteger.valueOf(16);
//
//        System.out.println(bd1 == bd2);
//
//        BigInteger bd3 = BigInteger.valueOf(17);
//        BigInteger bd4 = BigInteger.valueOf(17);
//
//        System.out.println(bd3 == bd4);


        //5.对象一旦创建里面的数据不能发生改变。
        BigInteger bd5 = BigInteger.valueOf(1);
        BigInteger bd6 = BigInteger.valueOf(2);

        BigInteger result = bd5.add(bd6);
        System.out.println(result);
        //此时，不会修改参与计算的BigInteger对象中的值，而是产生了一个新的BigInteger对象记录3
    }
}
