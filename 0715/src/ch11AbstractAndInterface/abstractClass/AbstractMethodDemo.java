package ch11AbstractAndInterface.abstractClass;

public class AbstractMethodDemo extends Normal1 {
    public AbstractMethodDemo(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Normal1 normal1 = new AbstractMethodDemo("한지민");
        normal1.display();
    }

    @Override
    public void display() {
        System.out.println(super.getName());
    }
}

abstract class Normal1 {
    private String name;

    public Normal1(String name) {
        this.name = name;
    }

    public abstract void display();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Normal{" +
                "name='" + name + '\'' +
                '}';
    }
}
