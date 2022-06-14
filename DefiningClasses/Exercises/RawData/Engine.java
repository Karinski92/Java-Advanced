package Advanced.DefiningClasses.Exercises.RawData;

public class Engine {
    private int speedEngine;
    private int powerEngine;

    public Engine(int speedEngine, int powerEngine) {
        this.speedEngine = speedEngine;
        this.powerEngine = powerEngine;
    }

    public int getSpeedEngine() {
        return speedEngine;
    }

    public void setSpeedEngine(int speedEngine) {
        this.speedEngine = speedEngine;
    }

    public int getPowerEngine() {
        return powerEngine;
    }

    public void setPowerEngine(int powerEngine) {
        this.powerEngine = powerEngine;
    }
}
