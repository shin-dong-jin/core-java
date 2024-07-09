public class ArrayCopyDemo {

    public static void main(String[] args) {
        // reference copy
        int[] original = {3, 4, 5};
        int[] target = original;
        target[0] = 100;

        // value copy
        int[] origin = {3, 4, 5};
        int[] tar = new int[10];
        System.arraycopy(origin, 0, tar, 0, origin.length);
        System.out.println(java.util.Arrays.toString(tar));
    }
}
