package a01mathdemo1;

public class MathDemo1 {
    public static void main(String[] args) {
       /*
        public static int  abs( int a)     获取参数绝对值
        public static double  ceil( double a)   向上取整
        public static double  floor( double a)   向下取整
        public static int  round( float a)   四舍五入
        public static int  max( int a, int b)   获取两个int值中的较大值
        public static double  pow( double a, double b)   返回a的b次幂的值
        public static double sqrt(double a)         返回a的平方根
        public static double cbrt(double a)         返回a的立方根
        public static double  random()    返回值为doub1e的随机值，范围[0.0,1.0)

        */

        //abs( int a)     获取参数绝对值
        System.out.println(Math.abs(-88));
        System.out.println(Math.abs(88));
        //bug:
        //以int类型为例，取值范围：-2147483648 ~ 2147483647
        //如果没有正数与负数对应，那么传递负数结果有误
        //-2147483648没有正数与之对应，所以abs结果产生bug
        System.out.println(Math.abs(-2147483648));//-2147483648

        //System.out.println(Math.absExact(-2147483648));//没有对应的数字会报错提示


        System.out.println("=========================");


        //ceil( double a)   向上取整
        System.out.println(Math.ceil(12.34));//13.0
        System.out.println(Math.ceil(12.54));//13.0
        System.out.println(Math.ceil(-12.34));//-12.0
        System.out.println(Math.ceil(-12.54));//-12.0

        System.out.println("=========================");


        //floor( double a)   向下取整
        System.out.println(Math.floor(12.34));//12.0
        System.out.println(Math.floor(12.54));//12.0
        System.out.println(Math.floor(-12.34));//-13.0
        System.out.println(Math.floor(-12.54));//-13.0

        System.out.println("=========================");

        //round( float a)   四舍五入
        System.out.println(Math.round(12.34));//12.0
        System.out.println(Math.round(12.54));//13.0

        System.out.println("=========================");


        //max( int a, int b)   获取两个int值中的较大值
        System.out.println(Math.max(20, 30));

        System.out.println("=========================");

        //min(int a,int b)     获取两个int值中的较小值
        System.out.println(Math.min(20, 30));

        System.out.println("=========================");


        //pow( double a, double b)   返回a的b次幂的值
        System.out.println(Math.pow(2, 3));

        System.out.println("=========================");

        //sqrt(double a)         返回a的平方根
        System.out.println(Math.sqrt(4));

        System.out.println("=========================");

        //cbrt(double a)         返回a的立方根
        System.out.println(Math.cbrt(8));

        System.out.println("=========================");

        //random()    返回值为doub1e的随机值，范围[0.0,1.0)
        System.out.println(Math.random());
    }
}
