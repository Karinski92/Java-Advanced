package Advanced.SetsAndMaps.Lab;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class LargestNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).sorted(Comparator.reverseOrder()).limit(3).forEach(s-> System.out.print(s + " "));

    }
}
