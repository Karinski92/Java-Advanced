package Advanced.FunctionalProgramming.Lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> listPeople = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String [] person = scanner.nextLine().split(",\\s+");
            listPeople.put(person[0], Integer.parseInt(person[1]));
        }
        String condition = scanner.nextLine();
        Integer age = Integer.parseInt(scanner.nextLine());
        String sort = scanner.nextLine();

        BiPredicate<Integer, Integer> sortByAge;
        if ("younger".equals(condition)) {
            sortByAge = (personAge, ageLimit) -> personAge <= ageLimit;
        } else {
            sortByAge = (personAge, ageLimit) -> personAge >=  ageLimit;
        }
        Consumer<Map.Entry<String, Integer>> printData;

        switch (sort) {
            case "name":
                printData = person -> System.out.println(person.getKey());
                break;
            case "age":
                printData = person -> System.out.println(person.getValue());
                break;
            case "name age":
                printData = person -> System.out.println(person.getKey() + " - " + person.getValue());
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + sort);
        }
        listPeople.entrySet().stream().filter(person -> sortByAge.test(person.getValue(), age)).forEach(printData);
    }
}
