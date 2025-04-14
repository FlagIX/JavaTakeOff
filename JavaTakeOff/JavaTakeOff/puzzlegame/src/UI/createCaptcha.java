package UI;

import java.util.Random;

public class createCaptcha {
    private createCaptcha() {
    }

    public static String createCaptchaCode(){
        String code = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            char c = code.charAt(random.nextInt(code.length()));
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
