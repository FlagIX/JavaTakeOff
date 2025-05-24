package mycharset;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CharSetDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("JavaTakeOff\\myio\\a.txt");
        FileOutputStream fos = new FileOutputStream("JavaTakeOff\\myio\\copy.txt");

        int b;
        while ((b = fis.read()) != -1){
            fos.write(b);
        }

        fos.close();
        fis.close();
    }
}
