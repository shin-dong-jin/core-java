package ch0902AnonymousObject.problem02;

public class Anonymous {
    Vehicle field = () -> System.out.println("자전거가 달립니다.");

    public void method1() {
        Vehicle localVar = () -> System.out.println("승용차가 달립니다.");

        localVar.run();
    }

    public void method2(Vehicle vehicle) {
        vehicle.run();
    }
}
