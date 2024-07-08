public class NestedLoopDemo {

    public static void main(String[] args) {
        int i = 1; // initialization(i)
        while (i <= 9) { // condition(i)
            int dan = 2; // initialization(dan)
            while (dan <= 9) { // condition(dan)
                System.out.printf("%d * %d = %d\t", dan, i, dan * i);
                dan++; // update(dan)
            }
            System.out.println();
            i++; // update(i)
        }
    }
}
