package a06bigintegerdemo;

import java.math.BigInteger;

public class BigIntegerDemo2 {
    public static void main(String[] args) {
        /*
            public BigInteger add(BigInteger val)                       加法
            public BigInteger subtract(BigInteger val)                  减法
            public BigInteger multiply(BigInteger val)                  乘法
            public BigInteger divide(BigInteger val)                    除法，获取商
            public BigInteger[]divideAndRemainder(BigInteger val)       除法，获取商和余数
            public boolean equals(Object x)                             比较是否相同
            public BigInteger pow(int exponent)                         次幂
            public BigInteger max/min(BigInteger val)                   返回较大值/较小值
            public int intValue()                                       转为int类型整数，超出范围数据有误
        */


        BigInteger bd1 = BigInteger.valueOf(10);
        BigInteger bd2 = BigInteger.valueOf(2);

        //加法
//        BigInteger bd3 = bd1.add(bd2);
//        System.out.println(bd3);

        //除法，获取商和余数
//        BigInteger[] arr = bd1.divideAndRemainder(bd2);
//        System.out.println(arr.length);
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);

        //比较是否相同
//        boolean result = bd1.equals(bd2);//比的是属性值
//        System.out.println(result);

        //次幂
//        BigInteger num = bd1.pow(3);
//        System.out.println(num);

        //返回较大值/较小值  max/min
//        BigInteger max = bd1.max(bd2);
//        System.out.println(max);

        //没有改变内部的值，只是做了一个判断
//        System.out.println(max == bd1);
//        System.out.println(max == bd2);

        //转为int类型整数，超出范围数据有误
        BigInteger bd3 = BigInteger.valueOf(2146473648);
        int i = bd3.intValue();
        System.out.println(i);
    }
}
