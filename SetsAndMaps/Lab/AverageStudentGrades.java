package Advanced.SetsAndMaps.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class AverageStudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberStudents = Integer.parseInt(scanner.nextLine());
        Map<String, ArrayList<Double>> studentRecord = new TreeMap<>();
        for (int i = 0; i < numberStudents; i++) {
            String [] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            double grade = Double.parseDouble(input[1]);
            studentRecord.putIfAbsent(name, new ArrayList<>());
            studentRecord.get(name).add(grade);
        }
        studentRecord.forEach((k, v) -> {double sum = 0; for (Double score : v) { sum += score;} double averageGrade = sum / v.size();
            System.out.println(k + " -> " + v.stream().map(x -> String.format("%.2f", x)).collect(Collectors.joining(" ")) + " (avg: " + String.format("%.2f", averageGrade) + ")");
        });
    }
}
