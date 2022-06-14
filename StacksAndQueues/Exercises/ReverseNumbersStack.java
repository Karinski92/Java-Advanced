package Advanced.StacksAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> numbersStack= new ArrayDeque<>();
        for (String number : numbers) {
            numbersStack.push(Integer.parseInt(number));
        }

        for (Integer integer : numbersStack) {
            System.out.print(integer + " ");

        }
    }
}
