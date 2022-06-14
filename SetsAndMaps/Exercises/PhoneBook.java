package Advanced.SetsAndMaps.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, String> phoneBook = new LinkedHashMap<>();

        while (!input.equals("search")) {
            String [] names = input.split("-");
            String name = names[0];
            String number = names[1];
            phoneBook.put(name, number);
            input = scanner.nextLine();
        }

        while (!"stop".equals(input = scanner.nextLine())) {

            if (phoneBook.containsKey(input)) {
                System.out.println(input + " -> " + phoneBook.get(input));
            } else {
                System.out.println("Contact " + input + " does not exist.");
            }

        }
    }
}
