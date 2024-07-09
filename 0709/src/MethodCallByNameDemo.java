/* Naming Convention
1. PascalCasing: Class, Interface, Enum
2. camelCasing: variable, method
3. Snake_Casing
4. Kebab-Casing
 */

/* Method를 호출하는 방법 3가지
1. Call(Pass) by name
2. Call(Pass) by value
3. Call(Pass) by reference
 */
public class MethodCallByNameDemo {

    public static void main(String[] args) {
        new MethodCallByNameDemo().calcTotal();
    }

    // METHOD SIGNATURE: [return type] [method name] [parameters]
    void calcTotal() {
        int total = 0;
        for (int i = 1; i <= 100; i++) {
            total += i;
        }
        System.out.printf("1부터 100까지의 합은 %d입니다.\n", total);
    }
}
