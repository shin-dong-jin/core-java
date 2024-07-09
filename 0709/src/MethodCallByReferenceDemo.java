/* Method를 호출하는 방법 3가지
1. Call(Pass) by name
2. Call(Pass) by value
3. Call(Pass) by reference
 */
public class MethodCallByReferenceDemo {

    public static void main(String[] args) {
        MethodCallByReferenceDemo demo = new MethodCallByReferenceDemo();
        Product pen = new Product();
        pen.price = 100;
        System.out.println("before = " + pen.price);
        demo.change(pen);
        System.out.println("after = " + pen.price);
    }

    void change(Product product) {
        product.price = 50_000;
    }
}

class Product {
    int price;
}