/* Method를 호출하는 방법 3가지
1. Call(Pass) by name
2. Call(Pass) by value
3. Call(Pass) by reference
 */
public class MethodCallByValueDemo {

    public static void main(String[] args) {
        new MethodCallByValueDemo().calcTotal(10, 50);
        new MethodCallByValueDemo().calcTotal(1, 100);
    }

    // METHOD SIGNATURE: [return type] [method name] [parameters]
    void calcTotal(int start, int end) {
        int total = 0;
        for (int i = start; i <= end; i++) {
            total += i;
        }
        System.out.printf("%d부터 %d까지의 합은 %d입니다.\n", start, end, total);
    }
}
