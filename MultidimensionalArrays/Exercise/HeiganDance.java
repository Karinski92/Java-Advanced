package Advanced.MultidimensionalArrays.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class HeiganDance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double hitPoints = Double.parseDouble(scanner.nextLine());
        int rowPlayer = 7;
        int colPlayer = 7;
        double healthHeigan = 3000000;
        int healthPlayer = 18500;
        ArrayDeque<String> spells = new ArrayDeque<>();
        boolean isCloudActive = false;


        do {
            String[] toDo = scanner.nextLine().split("\\s+");
            String spell = toDo[0];
            int damageRow = Integer.parseInt(toDo[1]);
            int damageCol = Integer.parseInt(toDo[2]);
            healthHeigan -= hitPoints;

            if (isCloudActive) {
                healthPlayer -= 3500;
                isCloudActive = false;

            }
            if (healthHeigan <= 0 || healthPlayer <= 0) {
                break;
            }


            if (inDamageArea(rowPlayer, colPlayer, damageRow, damageCol)) {
                if (isValid(rowPlayer - 1) && !inDamageArea(rowPlayer - 1, colPlayer, damageRow, damageCol)) {
                    rowPlayer = rowPlayer - 1;
                } else if (isValid(colPlayer + 1) && !inDamageArea(rowPlayer, colPlayer + 1, damageRow, damageCol)) {
                    colPlayer = colPlayer + 1;
                } else if (isValid(rowPlayer + 1) && !inDamageArea(rowPlayer + 1, colPlayer, damageRow, damageCol)) {
                    rowPlayer = rowPlayer + 1;
                } else if (isValid(colPlayer - 1) && !inDamageArea(rowPlayer, colPlayer - 1, damageRow, damageCol)) {
                    colPlayer = colPlayer - 1;
                } else {
                    switch (spell) {
                        case "Cloud":
                                healthPlayer -= 3500;
                                isCloudActive = true;
                                spells.push("Plague Cloud");
                            break;
                        case "Eruption":

                                healthPlayer -= 6000;
                                spells.push("Eruption");

                            break;
                    }
                }
            }

        } while (healthHeigan > 0 && healthPlayer > 0);

        if (healthHeigan <= 0) {
            if (healthPlayer <= 0) {
                System.out.printf("Heigan: Defeated!%n");
                System.out.printf("Player: Killed by %s%n", spells.peek());
                System.out.printf("Final position: %d, %d%n", rowPlayer, colPlayer);
            }
            System.out.printf("Heigan: Defeated!%n");
            System.out.printf("Player: %d%n", healthPlayer);
            System.out.printf("Final position: %d, %d%n", rowPlayer, colPlayer);

        }
        if (healthPlayer <= 0) {
            System.out.printf("Heigan: %.2f%n", healthHeigan);
            System.out.printf("Player: Killed by %s%n", spells.peek());
            System.out.printf("Final position: %d, %d%n", rowPlayer, colPlayer);
        }
    }

    private static boolean inDamageArea(int rowPlayer, int colPlayer, int damageRow, int damageCol) {
        return rowPlayer <= damageRow + 1 && rowPlayer >= damageRow - 1 && colPlayer <= damageCol + 1 && colPlayer >= damageCol - 1;
    }

    private static boolean isValid (int i) {
        return i >= 0 && i < 15;
    }
}
