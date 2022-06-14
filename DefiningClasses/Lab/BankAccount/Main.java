package Advanced.DefiningClasses.Lab.BankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.IntPredicate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        Map<Integer, BankAccount> accounts = new HashMap<>();
        String error = "Account does not exist";

        while (!"End".equals(line = scanner.nextLine())) {
            String [] toDo = line.split("\\s+");
            switch (toDo[0]) {
                case "Create":
                    BankAccount bankAccount = new BankAccount();
                    int id = bankAccount.getId();
                    accounts.put(id, bankAccount);
                    break;
                case "Deposit":
                    id = Integer.parseInt(toDo[1]);
                    double amount = Double.parseDouble(toDo[2]);
                    if (accounts.containsKey(id)) {
                        accounts.get(id).deposit(amount, id);
                    } else {
                        System.out.println(error);
                    }
                    break;
                case "SetInterest":
                    double interest = Double.parseDouble(toDo[1]);
                    BankAccount.setInterest(interest);
                    break;
                case "GetInterest":
                    id = Integer.parseInt(toDo[1]);
                    int years = Integer.parseInt(toDo[2]);
                    if (accounts.containsKey(id)) {
                        System.out.printf("%.2f%n", accounts.get(id).getInterest(id, years));
                    } else {
                        System.out.println(error);
                    }
                    break;
            }
        }
    }
}
