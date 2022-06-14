package Advanced.SetsAndMaps.Exercises;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<Character, Integer> output = new TreeMap<>();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            output.putIfAbsent(currentChar, 0);
            output.put(currentChar, output.get(currentChar) + 1);
        }
        output.forEach((e,v) -> System.out.printf("%s: %d time/s%n", e, v));
    }
}
