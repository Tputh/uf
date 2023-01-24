package Driver;

public class DriverC extends Driver.Driver {


    public DriverC(String fio, String driversLicense, int experience) {
        super(fio, driversLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории C " + getFio() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Водитель категорииC " + getFio() + " завершил движение");
    }

    @Override
    public void refuelTheCar() {
        System.out.println("Водитель категории C " + getFio() + " заправляет авто");
    }

    @Override
    public void printsDriversLicense() throws Driver.TypeDriversException {
        if (getDriversLicense()!= null && getDriversLicense().isEmpty() && getDriversLicense().isBlank()){
            System.out.println("Категория прав " + getDriversLicense());
        }else {
            throw new Driver.TypeDriversException("Необходимо указать тип прав!");
        }
    }

}
