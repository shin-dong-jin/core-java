public class GradeManagement {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        int[][] points = {
                {67, 89, 100},
                {55, 84, 66},
                {76, 43, 72}
        };

        for (int i = 0; i < points.length; i++) {
            int total = 0;

            for (int j = 0; j < points[i].length; j++) {
                total += points[i][j];
            }

            double avg = (double) total / points[i].length;
            char grade = avg >= 90. ? 'A' : avg >= 80. ? 'B' : avg >= 70. ? 'C' : avg >= 60. ? 'D' : 'F';

            for (int j = 0; j < points[i].length; j++) {
                builder.append(points[i][j]).append("\t");
            }
            builder.append(String.format("%.1f\t%c%n", avg, grade));
        }

        System.out.println(builder);
    }
}
