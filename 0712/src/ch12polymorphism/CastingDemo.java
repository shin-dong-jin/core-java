package ch12polymorphism;

/* 다형성
1. 객체 형변환
2. Override method
 */
public class CastingDemo {
    public static void main(String[] args) {
//        int su = 5;
//        long lo = su; // 자동 형변환, implicit conversion, promotion
//        double avg = su; // 강제 형변환, explicit conversion, demotion
//        short sh = (short) avg;

        Test test = new Test();
        Demo demo = new Demo();
//        test = demo;

        if (test instanceof Demo) {
            demo = (Demo) test;
        } else {
            System.out.println("안돼");
        }
    }
}

/*
자동 형변환: 자식객체가 부모객체로 형변환 할 때 (자식 -> 부모, 일반화)
강제 형변환: 부모객체가 자식객체로 형변환 할 때 (부모 -> 자식, 구체화), 단 instance of 연산자가 true를 리턴할 때에만
 */
class Test {

}

class Demo extends Test {

}