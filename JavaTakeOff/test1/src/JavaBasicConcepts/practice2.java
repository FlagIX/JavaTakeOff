package JavaBasicConcepts;

import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int man = sc1.nextInt();
        int woman = sc1.nextInt();
        if(man>woman){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
