package Advanced.StacksAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParenthesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String brackets = scanner.nextLine();

        ArrayDeque<Character> openingBrackets = new ArrayDeque<>();
        boolean isBalanced = true;

        for (int i = 0; i < brackets.length(); i++) {
            char currentBracket = brackets.charAt(i);
            if (currentBracket == '(' || currentBracket == '{' || currentBracket == '[') {
                openingBrackets.push(currentBracket);
            } else {
                if (openingBrackets.isEmpty()) {
                    isBalanced = false;
                    break;
                }
                char lastOpening = openingBrackets.pop();
                if (currentBracket == '}' && lastOpening != '{') {
                    isBalanced = false;
                } else if (currentBracket == ']' && lastOpening != '[') {
                    isBalanced = false;
                } else if (currentBracket == ')' && lastOpening != '(') {
                    isBalanced = false;
                }
            }
        }
        if (isBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
