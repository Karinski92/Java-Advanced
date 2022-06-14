package Advanced.SetsAndMaps.Lab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [] values = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
        Map<Double, Integer> numbersOccurence = new LinkedHashMap<>();
        for (double value : values) {
            if (!numbersOccurence.containsKey(value)) {
                numbersOccurence.put(value, 1);
            } else {
                numbersOccurence.put(value, numbersOccurence.get(value) + 1);
            }
        }
        for (Double key : numbersOccurence.keySet()) {
            System.out.println(String.format("%.1f -> %d", key, numbersOccurence.get(key)));
            
        }
    }
}
