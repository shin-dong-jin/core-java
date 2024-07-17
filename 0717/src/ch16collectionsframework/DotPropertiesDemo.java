package ch16collectionsframework;

import java.io.FileInputStream;
import java.util.Properties;
import java.io.IOException;

public class DotPropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("./productinfo.properties"));
        System.out.println("나이 = " + prop.getProperty("age"));
        System.out.println("거주지 = " + prop.getProperty("city"));
    }
}
