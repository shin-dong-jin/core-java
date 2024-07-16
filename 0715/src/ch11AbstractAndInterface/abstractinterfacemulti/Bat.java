package ch11AbstractAndInterface.abstractinterfacemulti;

import java.io.PrintStream;

public class Bat extends Mammal implements Bird {

    public static void main(String[] args) {
        Bat bat = new Bat();
        bat.fly();
        bat.hatch();
    }

    @Override
    public void fly() {
        System.out.println("하늘을 날다.");
    }

    @Override
    public void hatch() {
        java.io.PrintStream out = new PrintStream(System.out);
        out.println("새끼를 낳다.");
    }
}