package Advanced.SetsAndMaps.Exercises;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Set<String> list = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextLine());
        }
        list.forEach(a -> System.out.println(a));
    }
}
