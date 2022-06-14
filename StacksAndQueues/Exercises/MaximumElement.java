package Advanced.StacksAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int [] sequence = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            switch (sequence[0]) {
                case 1:
                    stack.push(sequence[1]);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    if (!stack.isEmpty()) {
                        System.out.println(Collections.max(stack));
                    }
            }

        }
    }
}
