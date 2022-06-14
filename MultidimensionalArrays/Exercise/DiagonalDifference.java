package Advanced.MultidimensionalArrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int [][] matrix = new int[n][n];

        for (int row = 0; row < n; row++) {
            int [] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = arr;
        }
        int sumDiagonalRight = 0;
        int sumDiagonalLeft = 0;

        for (int row = 0; row < n; row++) {
            sumDiagonalRight += matrix[row][row];
        }
        int index = n - 1;
        for (int row = 0; row < n; row++) {
            sumDiagonalLeft += matrix[row][index];
            index --;

        }
        System.out.println(Math.abs(sumDiagonalLeft - sumDiagonalRight));
    }
}
