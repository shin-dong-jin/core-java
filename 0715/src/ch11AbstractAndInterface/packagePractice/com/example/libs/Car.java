package ch11AbstractAndInterface.packagePractice.com.example.libs;

public class Car {
    public String name = "EF Sonata";
    protected int price = 30_000_000; // 자식만 접근가능
    String color = "Gray"; // 패키지 내부에서만 접근가능
    private int commition = 10_000_000; // 클래스 내부에서만 접근가능
}
