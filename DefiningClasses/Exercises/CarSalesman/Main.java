package Advanced.DefiningClasses.Exercises.CarSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Engine> catalogue = new HashMap<>();
        List<Car> carsList = new ArrayList<>();

        while (n-- > 0) {
            String [] info = scanner.nextLine().split("\\s+");
            String model = info[0];
            int power = Integer.parseInt(info[1]);
            Engine current = null;

            if (info.length == 2) current = new Engine(model,power);
            if (info.length == 3) {
                if (info[2].chars().allMatch(Character::isDigit))
                    current = new Engine(model, power, Integer.parseInt(info[2]));
                else current = new Engine(model, power, info[2]);
            }
            if (info.length == 4) current = new Engine(model, power, Integer.parseInt(info[2]), info[3]);
            catalogue.put(model, current);
        }
        n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String [] info = scanner.nextLine().split("\\s+");
            String model = info[0];
            String engine = info[1];
            Car currentCar = null;
            Engine holderEngine = catalogue.get(engine);

            if (info.length == 2) currentCar = new Car(model, holderEngine);
            if (info.length == 3) {
                if (info[2].chars().allMatch(Character::isDigit)) currentCar = new Car(model, holderEngine, Integer.parseInt(info[2]));
                else currentCar = new Car(model, holderEngine, info[2]);
            }
            if (info.length == 4) currentCar = new Car(model, holderEngine, Integer.parseInt(info[2]), info[3]);
            carsList.add(currentCar);
        }
        carsList.forEach(System.out::println);
    }
}
