package Advanced.SetsAndMaps.Exercises;

import java.util.*;

public class SetOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split("\\s+");
        int elementOne = Integer.parseInt(elements[0]);
        int elementTwo = Integer.parseInt(elements[1]);
        Set<Integer> numbersOne = new LinkedHashSet<>();
        Set<Integer> numbersTwo = new LinkedHashSet<>();
        for (int i = 0; i < elementOne; i++) {
            int addNumber = Integer.parseInt(scanner.nextLine());
            numbersOne.add(addNumber);
        }
        for (int i = 0; i < elementTwo; i++) {
            int addNumber = Integer.parseInt(scanner.nextLine());
            numbersTwo.add(addNumber);
        }
        numbersOne.retainAll(numbersTwo);
        numbersOne.forEach(number -> System.out.print(number + " "));
    }
}
