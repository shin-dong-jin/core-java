package ch12exception;

public class ExceptionDemo {
    public static void main(String[] args) {
        // [UNCHECKED] NullPointerException!
//        Car carnival = new Car();
//        carnival.name = "KIA CARNIVAL";
//        System.out.println(carnival.name);
//        carnival = null;
//        if (carnival != null) {
//            System.out.println(carnival.name);
//        } else {
//            System.out.println("NULL");
//        }

        // [UNCHECKED] NumberFormatException!
//        String money = "30_000_000원";
//        int integerMoney = Integer.parseInt(money);

        // [UNCHECKED] InputMismatchException
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Money?(반드시 숫자만 입력하세요) ");
//        int money = scanner.nextInt();
//        System.out.println(money);

        // [UNCHECKED] ArrayIndexOutOfBoundsException
//        int[] array = {1, 2, 3, 4};
//        for (int i = 0; i <= 4; i++) {
//            System.out.println(array[i]);
//        }

        // [UNCHECKED] NegativeArraySizeException
//        int[] array = new int[-3];

        // [CHECKED] FileNotFoundException
//        Scanner scanner = new Scanner(new File("ExceptionDemo.java"));
    }
}

class Car {
    public String name;
}
