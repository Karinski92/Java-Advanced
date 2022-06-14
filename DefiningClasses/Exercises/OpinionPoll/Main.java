package Advanced.DefiningClasses.Exercises.OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> peopleList = new ArrayList<>();
        while (n-- > 0) {
            String [] tokens = scanner.nextLine().split("\\s+");
            Person man = new Person(tokens[0], Integer.parseInt(tokens[1]));
            peopleList.add(man);
        }
        peopleList.stream().filter(man -> man.getAge() > 30).sorted(Comparator.comparing(Person::getName)).forEach(System.out::println);
    }
}
