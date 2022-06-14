package Advanced.FunctionalProgramming.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        Predicate<String> checkUpperCase = word -> Character.isUpperCase(word.charAt(0));
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            if(checkUpperCase.test(words.get(i))) {
                result.add(words.get(i));
            }
        }
        System.out.println(result.size());
        for (String s : result) {
            System.out.println(s);

        }
    }
}
