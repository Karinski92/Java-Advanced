package Advanced.StacksAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int toPush = input[0];
        int toPop = input[1];
        int toCheck = input[2];
        boolean isPresent = false;

        int [] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < toPush; i++) {
            stack.push(numbers[i]);
        }
        for (int i = 0; i < toPop; i++) {
            stack.pop();
        }
        for (Integer integer : stack) {
            if (toCheck == integer) {
                isPresent = true;
            }
        }
        if (isPresent){
            System.out.println("true");
        } else {
            if (!stack.isEmpty()) {
                System.out.println(Collections.min(stack));
            } else {
                System.out.println(0);
            }
        }



    }
}
