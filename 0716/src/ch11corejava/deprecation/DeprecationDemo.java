package ch11corejava.deprecation;

import java.util.Date;

public class DeprecationDemo {
    public static void main(String[] args) {
        Date today = new Date();
        System.out.println(today);
        int year = today.getYear();
        System.out.println(year + 1900);
    }
}
