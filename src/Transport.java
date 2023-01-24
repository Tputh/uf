import Driver.Driver;

public abstract class Transport<T extends Driver> implements Cloneable {
    private String stamp;
    private String model;
    private double engineCapacity;
    protected final T drever;
    private static final String DEFAULT_VALUE = "default";
    private static final double DEFAULT_ENGINE_VALUE = 2.0;

    public Transport(String stamp, String model, double engineCapacity, T drever) {
        if (stamp == null || stamp.isBlank()){
            this.stamp = DEFAULT_VALUE;
        }else {
            this.stamp = stamp;
        }
        if (model == null || model.isBlank()) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = model;
        }
        this.engineCapacity = engineCapacity;
        this.drever = drever;
    }



    public String getStamp() {
        return stamp;
    }

    public String getModel() {
        return model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }



    public void start() {}

    public void stop() {}


    public abstract void getPitStop();

    public abstract void getBestLapTime();

    public abstract int getMaximumSpeed();

    public T getDriver() {
        return drever;
    }

    public abstract void passDiagnostics();
    public abstract void printsDriversLicense();

}