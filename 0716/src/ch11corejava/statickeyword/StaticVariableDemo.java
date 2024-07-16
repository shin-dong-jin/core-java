package ch11corejava.statickeyword;

public class StaticVariableDemo {
    public static void main(String[] args) {
        Tiger[] tigers = new Tiger[4];

        for (int i = 0; i < 4; i++) {
            tigers[i] = new Tiger();
        }

        for(Tiger tiger : tigers) {
            System.out.println("a = " + tiger.a + ", b = " + Tiger.b);
        }
    }
}

class Tiger {
    int a;
    static int b;

    public Tiger() {
        a++;
        b++;
    }
}