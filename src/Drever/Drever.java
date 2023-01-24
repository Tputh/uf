package Driver;

public abstract class Driver{
    private String fio;
    private String driversLicense;
    private int experience;


    public Driver(String fio, String driversLicense, int experience) {

        this.fio = fio;
        this.driversLicense = driversLicense;
        this.experience = experience;

    }

    public String getFio() {
        return fio;
    }
    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getDriversLicense() throws TypeDriversException {
        if (driversLicense != null && driversLicense.isEmpty() && driversLicense.isBlank()){
            return driversLicense;
        }else {
            throw new TypeDriversException("Необходимо указать тип прав!");
        }
    }

    public void setDriversLicense(String driversLicense) throws TypeDriversException {
        this.driversLicense = driversLicense;
    }

    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }



    public abstract void startMoving();

    public abstract void stop();

    public abstract void refuelTheCar();

    public abstract void printsDriversLicense() throws TypeDriversException;

}
