package Advanced.StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String files = scanner.nextLine();
        ArrayDeque<String > queue = new ArrayDeque<>();

        while (!files.equals("print")) {
            if (files.equals("cancel")) {
                if (queue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + queue.pollFirst());
                }
            } else {
                queue.offer(files);
            }
            files = scanner.nextLine();
        }
        for (String s : queue) {
            System.out.println(s);
        }
    }
}
