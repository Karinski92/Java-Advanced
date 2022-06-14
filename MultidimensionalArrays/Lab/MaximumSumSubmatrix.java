package Advanced.MultidimensionalArrays.Lab;


import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumSubmatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] matrixSize = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(matrixSize[0]);
        int cols = Integer.parseInt(matrixSize[1]);
        int bestSum = Integer.MIN_VALUE;
        int resultRow = 0;
        int resultCol = 0;

        int [][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            int [] arr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = arr;
        }

        for (int row = 0; row < matrix.length-1; row++) {
            for (int col = 0; col < matrix[row].length-1; col++) {
                int sum = matrix[row][col] + matrix[row][col+1] +
                        matrix[row + 1][col] + matrix[row+1][col+1];
                if (sum > bestSum) {
                    bestSum = sum;
                    resultRow = row;
                    resultCol = col;
                }
            }
        }
        int [][] output = {
                {matrix[resultRow][resultCol], matrix[resultRow][resultCol + 1]},
                {matrix[resultRow + 1][resultCol], matrix[resultRow + 1][resultCol + 1]}
        };
        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output[i].length; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println(bestSum);

    }
}
