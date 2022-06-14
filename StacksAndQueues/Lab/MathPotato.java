package Advanced.StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine().split("\\s+");
        ArrayDeque<String> children = new ArrayDeque<>();
        Collections.addAll(children, input);
        int n = Integer.parseInt(scanner.nextLine());
        int primeCircle = 1;
        while (children.size() > 1) {
            for (int i = 1; i < n; i++) {
                children.offer(children.poll());
            }
            if(primeCircle==1 || primeCircle==4 || (primeCircle>5 && (primeCircle%2==0 || primeCircle%3==0 || primeCircle%5==0))) {
                System.out.println("Removed " + children.poll());
            } else {
                System.out.println("Prime " + children.peek());
            }
            primeCircle++;
        }
        System.out.println("Last is " + children.peek());
    }
}
