package Sort;

public class a04RecursionDemo3 {
    public static void main(String[] args) {
        //需求：用递归求5的阶乘，并把结果在控制台输出
        int factorial = getFactorial(5);
        System.out.println(factorial);
    }
    public static int getFactorial(int number){
        if(number == 0){
            return 1;
        }
        if(number == 1){
            return 1;
        }

        return number*getFactorial(number-1);
    }
}
