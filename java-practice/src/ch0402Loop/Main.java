package ch0402Loop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Problem problem = new Problem();
//        problem.run02(1, 100);
//        problem.run03();
        problem.run04();
//        problem.run06(4);
//        problem.run05(4);
    }
}

class Problem {
    public void run02(int from, int to) {
        int sum = 0;
        for(int i = from; i <= to; i++) {
            if(i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public void run03() {
        int a, b;
        while((a = (int) (Math.random() * 6 + 1)) + (b = (int) (Math.random() * 6 + 1)) != 5) {

        }
        System.out.println("(" + a + ", " + b + ")");
    }

    public void run04() {
        List<int[]> solutions = new ArrayList<>();
        for(int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if(4 * i + 5 * j == 60) {
                    solutions.add(new int[] {i, j});
                }
            }
        }

        for (int[] solution : solutions) {
            System.out.println("(" + solution[0] + ", " + solution[1] + ")");
        }
    }

    public void run05(int size) {
        // for
        for(int i = 0; i < size; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // while
        int row = 0;
        while(row < size) {
            int col = 0;
            while(col <= row) {
                System.out.print("*");
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public void run06(int size) {
        // for
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(j >= size - 1 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // while
        int row = 0;
        while(row < size) {
            int col = 0;
            while(col < size) {
                if(col >= size - 1 - row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                col++;
            }
            System.out.println();
            row++;
        }
        System.out.println();
    }
}