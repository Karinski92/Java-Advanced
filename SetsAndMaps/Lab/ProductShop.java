package Advanced.SetsAndMaps.Lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, LinkedHashMap<String, Double>> storeList = new TreeMap<>();

        while (!input.equals("Revision")) {
            String [] info = input.split(", ");
            String storeName = info[0];
            String product = info[1];
            double price = Double.parseDouble(info[2]);
            storeList.putIfAbsent(storeName, new LinkedHashMap<>());
            storeList.get(storeName).put(product, price);
            input = scanner.nextLine();
        }
        System.out.println(storeList.entrySet().stream().map(shop -> String.format("%s->%n%s", shop.getKey(), shop.getValue().entrySet().stream().map(product ->
                String.format("Product: %s, Price: %.1f", product.getKey(), product.getValue())).collect(Collectors.joining(System.lineSeparator()))
        )).collect(Collectors.joining(System.lineSeparator())));
    }
}
