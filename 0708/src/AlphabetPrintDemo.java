public class AlphabetPrintDemo {

    public static void main(String[] args) {
        // 홀수행: 대문자 A(65)
        // 짝수행: 소문자 a(97)

        char ch = 'A';
        int count = 0;
        int i = 0; // 초기화

        while (i < 26) {
            System.out.print((char) (ch + i) + "\t");
            count++;

            if (count % 5 == 0) {
                System.out.println();

                if(ch == 'A') {
                    ch = 'a';
                } else {
                    ch = 'A';
                }
            }
            i++; // 증감식
        }
    }
}
