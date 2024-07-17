package inputoutput;

import java.io.IOException;
import java.io.InputStream;

public class IODemo {
    public static void main(String[] args) {
        System.out.print("글자 한 개를 입력하세요> ");
        InputStream inputStream = System.in;
        int ascii = 0;
        try {
            ascii = inputStream.read();
            System.out.println("code = " + (char) ascii);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
