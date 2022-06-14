package Advanced.StacksAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class PoisonousPlants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberPlants = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> plants = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).forEach(plants::push);
        int day = -1;
        boolean haveDied = false;
        do {
            haveDied = false;
            for (int i = plants.size()-1; i > 0 ; i--) {
                int holder = plants.pop();
                int leftPlant = plants.peek();
                if (holder > leftPlant) {
                    haveDied = true;
                } else {
                    plants.offer(holder);
                }
            }
            plants.offer(plants.pop());
            day ++;
        } while (haveDied);
            System.out.println(day);
    }
}
