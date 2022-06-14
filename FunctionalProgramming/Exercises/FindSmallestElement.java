package Advanced.FunctionalProgramming.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        Function<List<Integer>, Integer> getIndex = list -> {
            int minElement = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) <= minElement) {
                    minElement = numbers.get(i);
                    minIndex = i;
                }
            }
            return minIndex;
        };
        System.out.println(getIndex.apply(numbers));
    }
}
