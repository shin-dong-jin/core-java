public class ConditionDemo {
    public static final String SPRING = "spring", SUMMER = "summer", FALL = "fall", WINTER = "winter";

    public static void main(String[] args) {
        System.out.print("Favorite Season(spring, summer, fall, winter): ");

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        String season = scanner.nextLine().toLowerCase();

//        if(season.equals(SPRING)) { // equals()는 String class의 멤버 메소드이기 때문에, 주소가 필요하다.
//            System.out.println("봄: 개나리, 진달래");
//        } else if(season.equals(SUMMER)) {
//            System.out.println("여름: 장미, 아카시아");
//        } else if(season.compareTo(FALL) == 0) {
//            System.out.println("가을: 백합, 코스모스");
//        } else if(season.equals(WINTER)) {
//            System.out.println("겨울: 동백, 매화");
//        }
        
        switch (season) {
            case SPRING:
                System.out.println("봄: 개나리, 진달래");
                break;
            case SUMMER:
                System.out.println("여름: 장미, 아카시아");
                break;
            case FALL:
                System.out.println("가을: 백합, 코스모스");
                break;
            case WINTER:
                System.out.println("겨울: 동백, 매화");
                break;
        }

        scanner.close();
    }
}
