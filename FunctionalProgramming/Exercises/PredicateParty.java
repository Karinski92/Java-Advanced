package Advanced.FunctionalProgramming.Exercises;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> partyList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("Party!")) {
            String [] toDo = input.split("\\s+");
            String command = toDo[0];
            Predicate<String> predicate = getPredicate(toDo);
            switch (command) {
                case "Double":
                    List<String> peopleToAdd = new ArrayList<>();
                    partyList.stream().filter(predicate).forEach(person -> peopleToAdd.add(person));
                    partyList.addAll(peopleToAdd);
                    break;
                case "Remove":
                    partyList.removeIf(predicate);
                    break;

            }
            input = scanner.nextLine();
        }
        if (partyList.isEmpty()) {
            System.out.printf("Nobody is going to the party!");
        } else {
            Collections.sort(partyList);
            String result = String.join(", ", partyList) + " are going to the party!";
            System.out.println(result);
        }
    }
    public static Predicate<String> getPredicate(String[] toDo) {
        Predicate<String> predicate = null;
        String filterName = toDo[1];
        String filterPart = toDo[2];

        switch (filterName) {
            case "StartsWith":
                predicate = name -> name.startsWith(filterPart);
                break;
            case "EndsWith":
                predicate = name -> name.endsWith(filterPart);
                break;
            case "Length":
                predicate = name -> name.length() == Integer.parseInt(filterPart);
                break;
        }
        return predicate;
    }
}
