package ch11AbstractAndInterface.cloneableinterface;

// Cloneable: flag interface
public class Product extends Object implements Cloneable {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product copy() {
        Product target = null;
        try {
            Object object = this.clone();
            if (object instanceof Product) {
                target = (Product) object;
            } else {
                System.out.println("형변환 안됨");
            }
            return target;
        } catch (CloneNotSupportedException e) {
            System.out.println("복제 안됨");
            throw new RuntimeException(e);
        }
    }
}
