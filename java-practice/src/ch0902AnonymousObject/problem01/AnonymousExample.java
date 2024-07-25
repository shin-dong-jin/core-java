package ch0902AnonymousObject.problem01;

/*
    디자인을 합니다.
    개발을 합니다.
    테스트를 합니다.
 */
public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous();
        anonymous.field.start();
        anonymous.method1();
        anonymous.method2(new Worker() {
            @Override
            public void start() {
                System.out.println("테스트를 합니다.");
            }
        });
    }
}
