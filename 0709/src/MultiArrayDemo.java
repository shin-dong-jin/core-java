public class MultiArrayDemo {

    public static void main(String[] args) {
        /* Variables */
        int variable; // declaration
        variable = 5; // assignment
        double avg = 89.5; // initialization

        /* Single Array */
        int[] array; // declaration
        array = new int[4]; // creation
        array[0] = 1; // assignment
        double[] avgs = {89.5}; // initialization

        /* Multi Array */
        int[][] multiArray; // declaration
        multiArray = new int[4][]; // creation, Jagged Array
        multiArray = new int[4][3]; // creation, Rectangular Array
        multiArray[0][0] = 5; // assignment
        double[][] multiAvgs = {
                {1., 2., 3.},
                {4., 5., 6.},
                {7., 8., 9.},
                {10., 11., 12.}
        }; // initialization

        int[][] matrix; // declaration
        matrix = new int[4][3]; // creation
        matrix[0] = new int[] {1, 2, 3};
        matrix[1] = new int[] {4, 5, 6};
        matrix[2] = new int[] {7, 8, 9}; // assignment

        int[][] jaggedMatrix = new int[4][]; // row of array: reference of column array
        jaggedMatrix[0] = new int[] {1, 2, 3, 4};
        jaggedMatrix[1] = new int[] {3, 6, 7};
        jaggedMatrix[2] = new int[] {1, 2, 7, 9};
        jaggedMatrix[3] = new int[] {6, 6, 4, 3, 5};

        System.out.println(jaggedMatrix.length); // 4
        System.out.println(jaggedMatrix[3].length); // 5

        for (int i = 0; i < jaggedMatrix.length; i++) {
            for (int j = 0; j < jaggedMatrix[i].length; j++) {
                System.out.printf("array[%d][%d] = %d\t", i, j, jaggedMatrix[i][j]);
            }
            System.out.println();
        }
    }
}
