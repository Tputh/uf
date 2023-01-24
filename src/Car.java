import Driver.DriverB;
import Driver.TypeDriversException;

public class Car extends Transport<DriverB> {


    private int enginePower;
    private int maximumSpeed;
    private String transmission;
    private String bodyType;


    public Car(String stamp, String model, double engineCapacity, int enginePower, int maximumSpeed,
               String transmission, String bodyType, DriverB driver) {
        super(stamp, model, engineCapacity, driver);
        this.enginePower = enginePower;
        this.maximumSpeed = maximumSpeed;
        this.transmission = transmission;
        this.bodyType = bodyType;
    }

    public int getEnginePower() {
        return enginePower;
    }
    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }
    @Override
    public void start() {
        System.out.println("Машина " + getStamp() + getModel() + " начал движение.");
    }
    @Override
    public void stop() {
        System.out.println("Машина " + getStamp() + getModel() + " закончил движение.");
    }



    @Override
    public String toString() {
        return "Автомобиль марки " + getStamp() + "; " + "Модель " + getModel() + "; " + "Объём двигателя " + getEngineCapacity() +
                "; " + "Мощность двигателя " + enginePower + " лошадиных сил" + "; " + "Максимальная мкорость " +
                maximumSpeed + "км/час" + "; " + "Коробка передач " +
                transmission + "; " + "Тип кузова " + bodyType + "; ";
    }

    @Override
    public void getPitStop() {
        System.out.println("У автомобиля " + getStamp()+ getModel() +" пит-стоп");
    }

    @Override
    public void getBestLapTime() {
        int minTime = 3;
        int maxTime = 5;
        int theBestTime = (int) (minTime + (maxTime - minTime) * Math.random());
        System.out.println("Лучшее время прохождения круга " + theBestTime +" мин");
    }

    @Override
    public int getMaximumSpeed() {
        int minSpeed = 110;
        int maxSpeed = 280;
        int theBestSpeed = (int) (minSpeed + (maxSpeed - minSpeed) * Math.random());
        System.out.println("Максимальная скорость " + theBestSpeed + " км/час");

        return minSpeed;
    }

    @Override
    public void passDiagnostics() {
        throw new RuntimeException("Машины могут проходить диагностику");
    }

    @Override
    public void printsDriversLicense() {

    }


}