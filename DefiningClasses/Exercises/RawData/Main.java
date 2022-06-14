package Advanced.DefiningClasses.Exercises.RawData;

import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Car>> catalogueCars = new HashMap<>();
        catalogueCars.put("fragile", new ArrayList<>());
        catalogueCars.put("flamable", new ArrayList<>());
        while (n-- > 0) {
            String [] info = scanner.nextLine().split("\\s+");
            String model = info[0];
            int speedEngine = Integer.parseInt(info[1]);
            int powerEngine = Integer.parseInt(info[2]);
            int weight = Integer.parseInt(info[3]);
            String type = info[4];
            double pressure1 = Double.parseDouble(info[5]);
            int age1 = Integer.parseInt(info[6]);
            double pressure2 = Double.parseDouble(info[7]);
            int age2 = Integer.parseInt(info[8]);
            double pressure3 = Double.parseDouble(info[9]);
            int age3 = Integer.parseInt(info[10]);
            double pressure4 = Double.parseDouble(info[11]);
            int age4 = Integer.parseInt(info[12]);

            Car current = new Car(model, speedEngine, powerEngine, weight, type, pressure1, age1, pressure2, age2, pressure3, age3, pressure4, age4);
            catalogueCars.get(type).add(current);
        }
        String toDo = scanner.nextLine();
        Predicate<Car> sort = getPredicate(toDo);
        catalogueCars.get(toDo).stream().filter(Objects.requireNonNull(sort)).forEach(System.out::println);


    }
    private static Predicate<Car> getPredicate (String toDo) {
        switch (toDo) {
            case "flamable":
                return e -> e.getEngine().getPowerEngine() > 250;
            case "fragile":
                return e -> e.getTire().getPressure1() < 1 || e.getTire().getPressure2() < 1 || e.getTire().getPressure3() < 1 || e.getTire().getPressure4() < 1;
        }
        return  null;
    }
}
