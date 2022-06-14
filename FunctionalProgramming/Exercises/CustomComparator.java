package Advanced.FunctionalProgramming.Exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer [] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).toArray(Integer[] :: new);
        Comparator<Integer> sortedNumbers = (num1, num2) -> {
            if (num1 % 2 == 0 && num2 % 2 != 0) {
                return -1;
            } else if (num1 % 2 != 0 && num2 % 2 == 0) {
                return 1;
            } else {
                return num1.compareTo(num2);
            }
        };
        Arrays.sort(numbers, sortedNumbers);
        Arrays.stream(numbers).forEach(number -> System.out.print(number + " "));
    }
}
