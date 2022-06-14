package Advanced.MultidimensionalArrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class MatrixShuffle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = input[0];
        int cols = input[1];

        String [][] matrix = new String[rows][cols];
        for (int row = 0; row < rows; row++) {
            String [] arr = scanner.nextLine().split("\\s+");
            matrix[row] = arr;
        }
        String toDo = scanner.nextLine();
        while (!toDo.equals("END")) {
            String [] command = toDo.split("\\s+");
            if (command.length != 5 || !command[0].equals("swap")) {
                System.out.printf("Invalid input!%n");

            } else {

                String swap = command[0];
                int row1 = Integer.parseInt(command[1]);
                int col1 = Integer.parseInt(command[2]);
                int row2 = Integer.parseInt(command[3]);
                int col2 = Integer.parseInt(command[4]);
                if (row1 < 0 || row1 > rows || col1 < 0 || col1 > cols ||
                        row2 < 0 || row2 > rows || col2 < 0 || col2 > cols) {
                    System.out.printf("Invalid input!%n");

                } else {

                    String holder = matrix[row1][col1];
                    matrix[row1][col1] = matrix[row2][col2];
                    matrix[row2][col2] = holder;

                    for (int row = 0; row < rows; row++) {
                        for (int col = 0; col < cols; col++) {
                            System.out.print(matrix[row][col] + " ");
                        }
                        System.out.println();
                    }
                }
            }
            toDo = scanner.nextLine();
        }

    }
}
