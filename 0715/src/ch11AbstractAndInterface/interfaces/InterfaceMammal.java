package ch11AbstractAndInterface.interfaces;

// 인터페이스 = 상수 + 추상메소드
public interface InterfaceMammal {
    // 1. public static final이 생략된 상수만 가질 수 있다.
    // static 상수만 선언 가능!
    double PI = 3.14159265358979323846;

    // 2. public abstract이 생략된 추상메소드만을 가질 수 있다.
    void display();
}
