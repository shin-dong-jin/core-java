package ch11AbstractAndInterface.abstractClass;

public class AbstractClassDemo extends Normal {
    public AbstractClassDemo(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Normal normal = new AbstractClassDemo("한지민");
        System.out.println(normal);
    }
}

// abstract class: 상속을 강제화한다
abstract class Normal {
    private String name;

    public Normal(String name) {
        this.name = name;
    }

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

