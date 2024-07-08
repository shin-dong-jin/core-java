public class ArrayDemo {

    public static void main(String[] args) {
//        // Variables
//        int age; // declaration
//        age = 28; // assignment
//        String name = "한지민"; // initialization
//
//        // Array: primitive types
//        int[] ages; // declaration
//        ages = new int[4]; // creation
//        ages[0] = 6; ages[1] = 7; ages[2] = 8; ages[3] = 9; // assignment
//        char[] array = {'a', 'b', 'c', 'd'}; // initialization
//
//        // Array: reference types
//        String[] words = {"Hello", "World", "Good", "Java", "A"}; // elements: references

//        int[] array; // declaration
//        array = new int[4]; // creation
//        array[0] = 5; array[1] = 6; array[2] = 7; array[3] = 8;
//
//        for (int i = 0; i < 4; i++) {
//            System.out.printf("array[%d] = %d\t", i, array[i]);
//        }
//        System.out.println();

        String[] array = {"Hello", "World", "Good", "JAVA", "A"};
        for (int i = 0; i < 5; i++) {
            System.out.printf("array[%d] = %s%n", i, array[i]);
        }
        System.out.println();
    }
}
