package Advanced.MultidimensionalArrays.Exercise;

import java.util.Scanner;

public class FillMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(input[0]);
        String pattern = input[1];
        int [][] matrix = new int[rows][rows];


        switch (pattern) {
            case "A":
                MatrixPatternA (rows, matrix);

                break;
            case "B":
                MatrixPatternB (rows, matrix);


                break;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }

    private static void MatrixPatternB(int rows, int[][] matrix) {
        int startNumber = 1;
        for (int col = 0; col < rows; col++) {
            if (col %2 == 0) {
                for (int row = 0; row < rows; row++) {
                    matrix[row][col] = startNumber;
                    startNumber ++;
                }
            } else {
                for (int row = rows-1; row >= 0 ; row--) {
                    matrix[row][col] = startNumber;
                    startNumber ++;

                }
            }

        }
    }

    private static void MatrixPatternA(int rows, int[][] matrix) {
        int startNumber = 1;
        for (int col = 0; col < rows; col++) {
            for (int row = 0; row < rows; row++) {
                matrix[row][col] = startNumber;
                startNumber ++;
            }
        }
    }
}
