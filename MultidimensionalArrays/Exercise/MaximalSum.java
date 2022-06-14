package Advanced.MultidimensionalArrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = input[0];
        int cols = input[1];

        int [][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            int [] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = arr;
        }
        int bestSum = Integer.MIN_VALUE;
        int bestRow = 0;
        int bestCol = 0;

        for (int row = 0; row < matrix.length-2; row++) {
            for (int col = 0; col < matrix[0].length-2; col++) {
                int sum = matrix[row][col] + matrix[row][col+1] + matrix[row][col + 2] +
                        matrix[row+1][col] + matrix[row+1][col+1] + matrix[row+1][col+2] +
                        matrix[row+2][col] + matrix[row+2][col+1] + matrix[row+2][col+2];
                if (sum > bestSum) {
                    bestSum = sum;
                    bestRow = row;
                    bestCol = col;
                }
            }
        }
        int [][] output = {
                {matrix[bestRow][bestCol], matrix[bestRow][bestCol+1], matrix[bestRow][bestCol+2]},
                {matrix[bestRow+1][bestCol], matrix[bestRow+1][bestCol+1], matrix[bestRow+1][bestCol+2]},
                {matrix[bestRow+2][bestCol], matrix[bestRow+2][bestCol+1], matrix[bestRow+2][bestCol+2]}
        };
        System.out.printf("Sum = " + bestSum + "%n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();

        }
    }
}
