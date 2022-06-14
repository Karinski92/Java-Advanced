package Advanced.DefiningClasses.Exercises.SpeedRacing;

public class Car {
    private final String model;
    private double fuelAmount;
    private final double fuelPerKilometer;
    private int distance =0;

    public Car(String model, double fuelAmount, double fuelForKilometer) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelPerKilometer = fuelForKilometer;
    }

    public void move(Car current, double amountOfKm){
        if(current.fuelPerKilometer *amountOfKm <= current.fuelAmount) {
            current.setFuelAmount(amountOfKm);
        } else {
            System.out.println("Insufficient fuel for the drive");
        }
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", model, fuelAmount, distance);
    }

    public void setFuelAmount(double numberKilometers) {
        this.fuelAmount -= fuelPerKilometer *numberKilometers;
        this.distance += numberKilometers;
    }
}