public class MethodReturnDemo {
    public static void main(String[] args) {
        int result = new MethodReturnDemo().calcTotal(10, 50);
        System.out.println(result);
        result = new MethodReturnDemo().calcTotal(1, 100);
        System.out.println(result);
    }

    // METHOD SIGNATURE: [return type] [method name] [parameters]
    int calcTotal(int start, int end) {
        int total = 0;
        for (int i = start; i <= end; i++) {
            total += i;
        }
        return total;
    }
}