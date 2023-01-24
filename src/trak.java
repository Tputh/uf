import Driver.DriverC;
import Driver.TypeDriversException;

public class Truck extends Transport<DriverC> {
    private int averageSpeed;
    private String engine;
    private String name;
    private String cabin;

    public Truck(String stamp, String model, double engineCapacity, int averageSpeed, String engine, String name,
                 String cabin,DriverC drever) {
        super(stamp, model, engineCapacity, drever);
        this.averageSpeed = averageSpeed;
        this.engine = engine;
        this.name = name;
        this.cabin = cabin;
    }

    public int getAverageSpeed() {
        return averageSpeed;
    }

    public String getEngine() {
        return engine;
    }

    public String getName() {
        return name;
    }

    public String getCabin() {
        return cabin;
    }

    @Override
    public void start() {
        System.out.println("Грузовик " + getStamp() + getModel() + " начал движение.");
    }
    @Override
    public void stop() {
        System.out.println("Грузовик " + getStamp() + getModel() + " закончил движение.");
    }



    @Override
    public String toString() {
        return "Марка " + getStamp() + "; " + "Модель " + getModel() + "; " + "Объём двигателя " + getEngineCapacity() +
                "; " + "Средня скорость " + averageSpeed + " км/час" + "; " + "Двигатель " + engine + "; " + "Прозвище " +
                name + "; " + "Тип кузова " + cabin;
    }

    @Override
    public void getPitStop() {
        System.out.println("У грузовика пит-стоп");
    }

    @Override
    public void getBestLapTime() {
        int minTime = 10;
        int maxTime = 14;
        int theBestTime = (int) (minTime + (maxTime - minTime) * Math.random());
        System.out.println("Лучшее время прохождения круга " + theBestTime + " мин");
    }

    @Override
    public int getMaximumSpeed() {
        int minSpeed = 80;
        int maxSpeed = 220;
        int theBestSpeed = (int) (minSpeed + (maxSpeed - minSpeed) * Math.random());
        System.out.println("Максимальная скорость " + theBestSpeed + " км/час");
        return minSpeed;
    }

    @Override
    public void passDiagnostics() {
        throw new RuntimeException("Грузовики могут проходить диагностику");
    }

    @Override
    public void printsDriversLicense() {

    }


}
