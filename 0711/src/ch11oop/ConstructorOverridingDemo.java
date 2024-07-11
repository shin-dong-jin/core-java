package ch11oop;

public class ConstructorOverridingDemo {
    public static void main(String[] args) {
        MyDate birthday = new MyDate();
        System.out.println(birthday.year);
    }
}

class MyDate {
    int year, month, day;

    // default constructor's overriding
    public MyDate() {
        this.year = 2024;
        this.month = 7;
        this.day = 11;
    }
}