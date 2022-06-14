package Advanced.StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String currentURL = "";
        ArrayDeque<String> back = new ArrayDeque ();
        ArrayDeque<String> forward = new ArrayDeque<>();

        while (!command.equals("Home")) {
            switch (command) {
                case "back":
                    if (back.size() > 1) {
                        forward.addFirst(currentURL);
                        System.out.println(currentURL = back.pop());
                    } else {
                        System.out.println("no previous URLs");
                    }
                    break;
                case "forward":
                    if (forward.size() > 0) {
                        back.push(currentURL);
                        System.out.println(currentURL = forward.pop());
                    } else {
                        System.out.println("no next URLs");
                    }
                    break;
                default:
                    back.push(currentURL);
                    currentURL = command;
                    forward.clear();
                    System.out.println(currentURL);
            }
            command = scanner.nextLine();
        }

    }
}

