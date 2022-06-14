package Advanced.StacksAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int toPush = input[0];
        int toPop = input[1];
        int toCheck = input[2];
        boolean isPresent = false;

        int [] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < toPush; i++) {
            queue.offer(numbers[i]);
        }
        for (int i = 0; i < toPop; i++) {
            queue.poll();
        }
        for (Integer integer : queue) {
            if (toCheck == integer) {
                isPresent = true;
            }
        }
        if (isPresent){
            System.out.println("true");
        } else {
            if (!queue.isEmpty()) {
                System.out.println(Collections.min(queue));
            } else {
                System.out.println(0);
            }
        }
    }
}
