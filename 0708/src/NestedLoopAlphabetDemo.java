public class NestedLoopAlphabetDemo {

    public static void main(String[] args) {
        // 행: 26개
        // 열 <= 행

        int i = 0;
        while (i < 26) {
            int j = 0;
            while (j <= i) {
                System.out.print((char) ('A' + j));
                j++;
            }
            System.out.println();
            i++;
        }

//        for (int i = 0; i < 26; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.printf("%c", (char) ('A' + j));
//            }
//            System.out.println();
//        }

    }
}
