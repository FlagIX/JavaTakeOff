package util;

import java.util.Random;

public class CodeUtil {

    public static String getCode(){
      //自己练习

        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String number = "0123456789";
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int alphabetIndex = r.nextInt(alphabet.length());
            char c = alphabet.charAt(alphabetIndex);
            sb.append(c);
        }
        int numberIndex = r.nextInt(number.length());
        char n = number.charAt(numberIndex);
        sb.append(n);
        return sb.toString();
    }
}