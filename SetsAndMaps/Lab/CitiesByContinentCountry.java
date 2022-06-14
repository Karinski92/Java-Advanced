package Advanced.SetsAndMaps.Lab;

import java.util.*;

public class CitiesByContinentCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>> listCountries = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String [] info = scanner.nextLine().split("\\s+");
            String continent = info[0];
            String country = info[1];
            String city = info[2];
            listCountries.putIfAbsent(continent, new LinkedHashMap<>());
            listCountries.get(continent).putIfAbsent(country, new ArrayList<>());
            listCountries.get(continent).get(country).add(city);
        }
        listCountries.entrySet().forEach(entry -> {String continent = entry.getKey();
            LinkedHashMap<String, ArrayList<String>> countryCities = entry.getValue();
            System.out.println(continent + ":");
            countryCities.entrySet().forEach(c -> {
                System.out.println("  " + c.getKey() + " -> " + String.join(", ", c.getValue()));
            });
        });
    }
}
