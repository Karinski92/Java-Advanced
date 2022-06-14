package Advanced.SetsAndMaps.Lab;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> vip = new TreeSet<>();
        Set<String> regular = new TreeSet<>();
        String guestID = scanner.nextLine();

        while (!guestID.equals("PARTY")) {
            if (Character.isDigit(guestID.charAt(0))) {
                vip.add(guestID);
            } else {
                regular.add(guestID);
            }
            guestID = scanner.nextLine();
        }
        String guestCame = scanner.nextLine();
        while (!guestCame.equals("END")) {
            vip.remove(guestCame);
            regular.remove(guestCame);

            guestCame = scanner.nextLine();
        }
        int guestsMissing = vip.size() + regular.size();
        System.out.println(guestsMissing);
        if (!vip.isEmpty()) {
            for (String s : vip) {
                System.out.println(s);
            }
        }
        if (!regular.isEmpty()) {
            for (String s : regular) {
                System.out.println(s);
            }

        }
    }
}
