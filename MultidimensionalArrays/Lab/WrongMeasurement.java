package Advanced.MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int [][] matrix = new int[rows][];
        for (int row = 0; row < rows; row++) {
            int [] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = arr;
        }

        String [] wrongElementPlace = scanner.nextLine().split("\\s+");
        int wrongRow = Integer.parseInt(wrongElementPlace[0]);
        int wrongCol = Integer.parseInt(wrongElementPlace[1]);
        int wrongElement = matrix[wrongRow][wrongCol];
        int [][] newMatrix = new int[rows][matrix[0].length];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                int currentElement = matrix[row][col];

                if (currentElement == wrongElement) {
                    currentElement = 0;
                    if (row != 0 && matrix[row - 1][col] != wrongElement) {
                        currentElement += matrix[row - 1][col];
                    }
                    if (row != rows-1 && matrix[row+1][col] != wrongElement) {
                        currentElement += matrix[row+1][col];
                    }
                    if (col != matrix[0].length -1 && matrix[row][col + 1] != wrongElement) {
                            currentElement += matrix[row][col + 1];
                        }
                    if (col != 0 && matrix[row][col - 1] != wrongElement) {
                        currentElement += matrix[row][col - 1];
                    }
                    newMatrix[row][col] = currentElement;

                } else {
                    newMatrix[row][col] = currentElement;
                }

            }

        }
        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[i].length; j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();

        }

    }
}
