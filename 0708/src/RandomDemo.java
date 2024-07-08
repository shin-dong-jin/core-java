public class RandomDemo {

    public static void main(String[] args) {
        // 1 ~ 10 사이의 랜덤 넘버 추출
        int rand = (int) (10. * Math.random() + 1.);
        System.out.println("rand = " + rand);

        // Switch의 OR처리: 적절하게 break 배치
        switch (rand) {
            case 1:
                System.out.println("Bananas");
                break;
            case 2:
                System.out.println("Oranges");
                break;
            case 3:
                System.out.println("Peach");
            case 4:
                System.out.println("Apples");
            case 5:
                System.out.println("Plum");
                break;
            case 6:
                System.out.println("Pineapple");
                break;
            case 7:
                System.out.println();
                break;
            default:
                System.out.println("Nuts");
        }
    }
}
