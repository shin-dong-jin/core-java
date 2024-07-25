package ch0902AnonymousObject.problem02;

/*
    자전거가 달립니다.
    승용차가 달립니다.
    트럭이 달립니다.
 */
public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous();
        anonymous.field.run();
        anonymous.method1();
        anonymous.method2(() -> System.out.println("트럭이 달립니다."));
    }
}
