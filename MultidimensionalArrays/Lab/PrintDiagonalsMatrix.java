package Advanced.MultidimensionalArrays.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrintDiagonalsMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = rows;
        int [][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            int [] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = arr;
        }
        List<Integer> firstRow = new ArrayList<>();
        List<Integer> secondRow = new ArrayList<>();
        for (int row = 0; row < rows; row++) {
            firstRow.add(matrix[row][row]);
        }
        int index = 0;
        for (int row = rows-1; row > -1; row--) {
            secondRow.add(matrix[row][index]);
            index += 1;
        }

        for (Integer integer : firstRow) {
            System.out.print(integer + " ");
        }
        System.out.println();
        for (Integer integer : secondRow) {
            System.out.print(integer + " ");
        }

    }
}
