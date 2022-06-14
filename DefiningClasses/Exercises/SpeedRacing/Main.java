package Advanced.DefiningClasses.Exercises.SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = Integer.parseInt(scanner.nextLine());
        Map<String, Car> listCars = new LinkedHashMap<>();

        while (line-- > 0) {
            String[] info = scanner.nextLine().split("\\s+");
            Car currentCar = new Car(info[0], Integer.parseInt(info[1]), Double.parseDouble(info[2]));
            listCars.put(info[0], currentCar);
        }

        String command;
        while (!"End".equals(command = scanner.nextLine())) {
            String carModel = command.split("\\s+")[1];
            double numberKilometers = Double.parseDouble(command.split("\\s+")[2]);
            Car current = listCars.get(carModel);
            current.move(current, numberKilometers);
        }
        listCars.values().forEach(System.out::println);
    }
}