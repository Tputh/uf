import Driver.Driver;
import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;

public class Main  {
    public static void main(String[] args) {

        DriverB driverB = new DriverB("Иван", "В", 5);
        Car cars = new Car("Tayota" , " Mark II", 2.5, 300,
                280, " Механика ", "Седан", driverB);
        driverB.printsDriversLicense();
        System.out.println(driverB);
        printInfo(cars);
        System.out.println(cars);
        cars.start();
        cars.getPitStop();
        cars.stop();
        cars.getBestLapTime();
        cars.getMaximumSpeed();
        System.out.println();


        DriverD driverD = new DriverD("Фёдор", "D", 7);
        Bus bus = new Bus("Mercedes-Benz", "Travego M OM 457 LA", 8.0,
                12.82,3.7, 1000, 12, driverD);

        System.out.println(driverD);
        printInfo(bus);
        System.out.println(bus);
        bus.start();
        bus.getPitStop();
        bus.stop();
        bus.getBestLapTime();
        bus.getMaximumSpeed();
        System.out.println();



        DriverC driverC = new DriverC("Анатолий", "C", 3);
        Truck trucks = new Truck("Volvo" , "Wild Viking", 12.6, 158,
                "1600-силовой турбодизель", "Дикий викинг", "Двух местный", driverC);

        printInfo(trucks);
        System.out.println(trucks);
        trucks.start();
        trucks.getPitStop();
        trucks.stop();
        trucks.getBestLapTime();
        trucks.getMaximumSpeed();

        System.out.println("Названный Автотранспорт пребудьте в Бокс А для прохождения диагностики");
        passDiagnostics(cars, bus, trucks);



    }

    private static void printInfo(Transport<?> transport){
        System.out.println("Водитель " + transport.getDriver().getFio() + " управляет автомобилем " +
                transport.getStamp() + " " + transport.getModel() + " и будет участвовать в заезде");
    }

    public static void passDiagnostics(Transport... transports) {
        for (Transport transport : transports) {
            try {
                transport.passDiagnostics();
            } catch (RuntimeException e) {
                System.out.println();
                System.out.println(e.getMessage());
            }
        }
    }

