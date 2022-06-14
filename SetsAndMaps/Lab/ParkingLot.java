package Advanced.SetsAndMaps.Lab;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<String> parkingLot = new LinkedHashSet<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("END")) {
                break;
            } else {
                String [] reminder = input.split(", ");
                if (reminder[0].equals("IN")) {
                    parkingLot.add(reminder[1]);
                } else {
                    parkingLot.remove(reminder[1]);
                }
            }
        }
        if (parkingLot.isEmpty()) {
            System.out.printf("Parking Lot is Empty");
        } else {
        for (String car : parkingLot) {
            System.out.println(car);
        }

        }
    }
}
