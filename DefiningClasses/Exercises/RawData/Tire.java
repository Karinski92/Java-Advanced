package Advanced.DefiningClasses.Exercises.RawData;

public class Tire {
    private double Pressure1;
    private double Pressure2;
    private double Pressure3;
    private double Pressure4;
    private int age1;
    private int age2;
    private int age3;
    private int age4;

    public Tire(double pressure1, int age1, double pressure2, int age2, double pressure3, int age3, double pressure4, int age4) {
        Pressure1 = pressure1;
        Pressure2 = pressure2;
        Pressure3 = pressure3;
        Pressure4 = pressure4;
        this.age1 = age1;
        this.age2 = age2;
        this.age3 = age3;
        this.age4 = age4;
    }

    public double getPressure1() {
        return Pressure1;
    }

    public void setPressure1(double pressure1) {
        Pressure1 = pressure1;
    }

    public double getPressure2() {
        return Pressure2;
    }

    public void setPressure2(double pressure2) {
        Pressure2 = pressure2;
    }

    public double getPressure3() {
        return Pressure3;
    }

    public void setPressure3(double pressure3) {
        Pressure3 = pressure3;
    }

    public double getPressure4() {
        return Pressure4;
    }

    public void setPressure4(double pressure4) {
        Pressure4 = pressure4;
    }

    public int getAge1() {
        return age1;
    }

    public void setAge1(int age1) {
        this.age1 = age1;
    }

    public int getAge2() {
        return age2;
    }

    public void setAge2(int age2) {
        this.age2 = age2;
    }

    public int getAge3() {
        return age3;
    }

    public void setAge3(int age3) {
        this.age3 = age3;
    }

    public int getAge4() {
        return age4;
    }

    public void setAge4(int age4) {
        this.age4 = age4;
    }
}
