package Advanced.DefiningClasses.Exercises.RawData;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private Tire tire;

    public Car(String model, int speedEngine, int powerEngine, int weight, String type,
               double pressure1, int age1, double pressure2, int age2, double pressure3, int age3, double pressure4, int age4) {
        this.model = model;
        this.engine = new Engine(speedEngine, powerEngine);
        this.cargo = new Cargo(weight, type);
        this.tire = new Tire(pressure1, age1, pressure2, age2, pressure3, age3, pressure4,age4);
    }

    @Override
    public String toString () {
        return model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }
}
