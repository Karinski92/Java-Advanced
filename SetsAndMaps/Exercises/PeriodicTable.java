package Advanced.SetsAndMaps.Exercises;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Set<String> elements = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String [] input = scanner.nextLine().split("\\s+");
            for (int j = 0; j < input.length; j++) {
                elements.add(input[j]);
            }
        }
        System.out.println(String.join(" ", elements));
    }
}
