package Advanced.FunctionalProgramming.Lab;

import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class FindEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] range  = scanner.nextLine().split("\\s+");
        int lowerLimit = Integer.parseInt(range[0]);
        int upperLimit = Integer.parseInt(range[1]);
        String condition = scanner.nextLine();

        IntPredicate numbersSort = "odd".equals(condition) ? n -> n % 2 != 0 : n -> n % 2 == 0;
        IntStream.range(lowerLimit, upperLimit + 1).filter(numbersSort).forEach(n -> System.out.printf("%d ", n));
    }
}
