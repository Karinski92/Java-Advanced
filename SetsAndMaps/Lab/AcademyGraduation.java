package Advanced.SetsAndMaps.Lab;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Double []> studentList = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String [] inputGrades = scanner.nextLine().split("\\s+");
            Double [] grades = new Double[inputGrades.length];

            for (int j = 0; j < inputGrades.length; j++) {
                grades[j] = Double.parseDouble(inputGrades[j]);
            }
            studentList.put(name, grades);
        }
        studentList.forEach((s, g) -> {
            double sum = 0;
            for (Double aDouble : g) {
                sum += aDouble;
            }
            System.out.printf("%s is graduated with %s%n", s, sum/g.length);
        });
    }
}
