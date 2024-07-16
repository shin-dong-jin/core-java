package ch11inheritance;

/* private 멤버는 상속되지 않는다. */
public class PrivateInheritanceDemo {

    public static void main(String[] args) {
        Frog frog = new Frog();
    }
}

class Animal {
    private String name;
    int weight;
}

class Frog extends Animal {

}