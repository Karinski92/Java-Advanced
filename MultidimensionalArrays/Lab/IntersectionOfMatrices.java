package Advanced.MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class IntersectionOfMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char [] [] first = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            first[row] = scanner.nextLine().replaceAll("\\s+", "").toCharArray();
        }
        char [] [] second = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            second [row] = scanner.nextLine().replaceAll("\\s+", "").toCharArray();
        }
        char [] [] output = new char[rows][cols];

        for (int row = 0; row < first.length; row++) {
            char [] firstArr = first[row];
            char [] secondArr = second[row];
            for (int col = 0; col < firstArr.length; col++) {
                char firstElement = firstArr[col];
                char secondElement= secondArr[col];
                if (firstElement == secondElement) {
                    output [row] [col] = firstElement;
                } else {
                    output [row] [col] = '*';
                }

            }
        }
        for (int row = 0; row < output.length; row++) {
            for (int col = 0; col < output[0].length; col++) {
                System.out.print(output[row][col] + " ");
            }
            System.out.println();

        }

    }
}
