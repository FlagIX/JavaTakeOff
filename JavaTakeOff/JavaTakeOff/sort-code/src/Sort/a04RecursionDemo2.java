package Sort;

public class a04RecursionDemo2 {
    public static void main(String[] args) {
        //需求：利用递归求1-100之间的和
        //100+99+98+97+96+95....+2+1

        //大问题拆解成小问题
        //1~100之间的和=100+(1~99之间的和)
        //1~99之间的和=99+(1~98之间的和)
        //1~98之间的和=98+(1~97之间的和)
        //....
        //1~2之间的和=2+(1~1之间的和)
        //1~1之间的和=1（递归的出口）

        int sum = getSum(100);
        System.out.println(sum);
    }
    public static int getSum(int number){
        if(number == 1){
            return 1;
        }
        return number + getSum(number - 1);
    }
}

