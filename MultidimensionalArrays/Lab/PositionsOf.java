package Advanced.MultidimensionalArrays.Lab;

import java.util.*;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dimentions = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(dimentions[0]);
        int cols = Integer.parseInt(dimentions[1]);
        int[][] matrix = new int[rows][cols];
        List<String> numbersFound = new ArrayList<>();

        for (int row = 0; row < rows; row++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = arr;
        }
        int numberToFind = Integer.parseInt(scanner.nextLine());

        for (int row = 0; row < matrix.length; row++) {
            int[] arr = matrix[row];
            for (int col = 0; col < arr.length; col++) {
                int element = arr[col];
                if (element == numberToFind) {
                    numbersFound.add(row + " " + col);
                }
            }
        }
        if (numbersFound.isEmpty()) {
            System.out.println("not found");
        } else {
            for (String s : numbersFound) {
                System.out.println(s);
            }
        }
    }
}

