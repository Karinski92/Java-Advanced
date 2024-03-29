package Advanced.DefiningClasses.Lab.Constructor;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Car> cars = new LinkedHashSet<>();
        int line = Integer.parseInt(scanner.nextLine());

        while (line-- > 0) {
            String [] tokens = scanner.nextLine().split("\\s+");
            Car car = tokens.length == 1 ? new Car(tokens[0]) : new Car(tokens[0], tokens[1], Integer.parseInt(tokens[2]));
            cars.add(car);
        }
        cars.forEach(car -> System.out.println(car.carInfo()));
    }
}
