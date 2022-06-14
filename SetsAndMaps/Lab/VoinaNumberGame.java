package Advanced.SetsAndMaps.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));
        Set<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));

        int rounds = 0;

        while (!firstPlayer.isEmpty() && !secondPlayer.isEmpty()) {
            rounds ++;
            if (rounds == 50) {
                break;
            }
            Iterator<Integer> firstIterator = firstPlayer.iterator();
            int firstCardP1 = firstIterator.next();
            firstIterator.remove();

            Iterator<Integer> secondIterator = secondPlayer.iterator();
            int firstCardP2 = secondIterator.next();
            secondIterator.remove();

            if (firstCardP1 > firstCardP2) {
                firstPlayer.add(firstCardP1);
                firstPlayer.add(firstCardP2);
            } else if (firstCardP2 > firstCardP1) {
                secondPlayer.add(firstCardP1);
                secondPlayer.add(firstCardP2);
            }
        }
        if (firstPlayer.size() > secondPlayer.size()) {
            System.out.printf("First player win!");
        } else if (secondPlayer.size() > firstPlayer.size()) {
            System.out.printf("Second player win!");
        } else {
            System.out.printf("Draw!");
        }
    }
}
