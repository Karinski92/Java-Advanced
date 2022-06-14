package Advanced.StacksAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class InfixToPostfix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        ArrayDeque<String> output = new ArrayDeque<>();
        ArrayDeque<String> operators = new ArrayDeque<>();
        HashMap<String, Integer> listOps = new LinkedHashMap<>();
        listOps.put("+", 2);
        listOps.put("-", 2);
        listOps.put("/", 3);
        listOps.put("*", 3);
        listOps.put("(", 1);
        listOps.put(")", 1);

        for (String s : input) {
            if (listOps.containsKey(s)) {
                if (s.equals("(")) {
                    operators.push(s);
                } else if (s.equals(")")) {
                    while (!"(".equals(operators.peek())) {
                        output.offer(operators.pop());
                    }
                    operators.pop();
                } else {
                    while (operators.size()>0 && listOps.get(operators.peek()) >= listOps.get(s)) {
                        output.offer(operators.pop());
                    }
                    operators.push(s);
                }
            } else {
                output.offer(s);
            }
        }
        while (operators.size() > 0) {
            output.offer(operators.pop());
        }
        for (String s : output) {
            System.out.print(s + " ");
        }
    }
}

