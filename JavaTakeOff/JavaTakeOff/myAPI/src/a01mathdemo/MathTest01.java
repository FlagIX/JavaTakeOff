package a01mathdemo;

public class MathTest01 {
    public static void main(String[] args) {
        //求质数
        System.out.println(isPrime(13));
        System.out.println(isPrime(10));
        System.out.println(isPrime(997));

    }

    public static boolean isPrime(int number){
        int count = 0;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            count++;
            if(number % i == 0){
                return false;
            }
        }
        System.out.print(count+" ");
        return true;
    }
}
