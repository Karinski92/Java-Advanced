package Advanced.MultidimensionalArrays.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] matrixSize = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = matrixSize[0];
        int cols = matrixSize[1];
        List<List<Integer>> matrix = new ArrayList<>();
        fillMatrix (rows, cols, matrix);

        String input;
        while (!"Nuke it from orbit".equals(input = scanner.nextLine())) {
            int [] coordinates = Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int r = coordinates[0];
            int c = coordinates[1];
            int radius = coordinates[2];

            nukeTarget(matrix, r, c, radius);
            nukeEmpty(matrix);
        }
        for (List<Integer> integers : matrix) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }

    private static void nukeEmpty(List<List<Integer>> matrix) {
        for (int i = 0; i < matrix.size(); i++) {
            if (matrix.get(i).size() == 0) {
                matrix.remove(i--);
            }
        }
    }

    private static void nukeTarget(List<List<Integer>> matrix, int r, int c, int radius) {
        for (int i = c + radius; i >= c - radius; i--) {
            if (validIndex(r, matrix.size()) && validIndex(i, matrix.get(r).size())){
                matrix.get(r).remove(i);
            }
        }
        for (int i = r - radius; i <= r + radius ; i++) {
            if (validIndex(i, matrix.size()) && validIndex(c, matrix.get(i).size()) && i!= r) {
                matrix.get(i).remove(c);
            }
        }
    }

    private static boolean validIndex(int i, int size) {
        return i >=0 && i < size;
    }

    private static void fillMatrix(int rows, int cols, List<List<Integer>> matrix) {
        int number = 1;
        for (int row = 0; row < rows; row++) {
            matrix.add(new ArrayList<>());
            for (int col = 0; col < cols; col++) {
                matrix.get(row).add(number++);

            }
            
        }
    }
}
