package a02systemdemo;

public class SystemDemo2 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            boolean flag = isPrine2(i);
            if(flag){
                System.out.println(i);
            }
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }


    public static boolean isPrine1(int number){
        for (int i = 2; i < number; i++) {
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean isPrine2(int number){
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
