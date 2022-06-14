package Advanced.FunctionalProgramming.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        Predicate<String> check = name -> name.length() >= length+1;
        names.removeIf(check);
        for (String name : names) {
            System.out.println(name);
        }
    }
}
