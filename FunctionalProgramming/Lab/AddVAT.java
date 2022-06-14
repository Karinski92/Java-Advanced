package Advanced.FunctionalProgramming.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UnaryOperator<Double> addVAT = value -> value * 1.2;
        Consumer<Double> printer = value -> System.out.printf("%.2f%n", value);
        Function<String, Double> parse = Double::parseDouble;
        System.out.printf("Prices with VAT:%n");

        Arrays.stream(scanner.nextLine().split(",\\s+")).map(parse).map(addVAT).forEach(printer);

    }
}
