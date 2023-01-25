package transport;


import transport.driver.DriverC;

public class Truck<D extends Truck> extends Transport implements Competing {

    private DriverC driver;

    public void setDriver(DriverC driver) {
        this.driver = driver;
    }

    public static String[] getTruckPitStop = {"Поменять колеса", "Залить топливо 2", "Выйти перекурить"};

    public static String[] getTruckBestLapTime = {"Лучшее время круга №3", "Лучшее время круга у №4", "Лучшее время круга у №5"};

    public static String[] getTruckMaxSpeed = {"Максимальная скорость у №1", "Максимальная скорость у №2", "Максимальная скорость у №6"};

    public static void getTruckPitStop() {
        System.out.println(getTruckPitStop[0]);
    }

    public static void getTruckBestLapTime() {
        System.out.println(getTruckBestLapTime[1]);
    }

    public static void getTruckMaxSpeed() {
        System.out.println(getTruckMaxSpeed[0]);
    }

    //--------------------------------------------
    @Override
    public String[] getPitStop() {
        return new String[0];
    }

    @Override
    public boolean isDiagnosticsPassed() {
        return super.isDiagnosticsPassed();
    }

    @Override
    public String[] getBestLapTime() {
        return new String[0];
    }

    @Override
    public String[] getMaxSpeed() {
        return new String[0]  ;
    }

    //----------------------------------------------------------
    public Truck(String brand, String model, double engineVolume,DriverC driver) {
        super(brand, model, engineVolume);
        setDriver(driver);
    }

    public Truck(double engineVolume) {
        super(engineVolume);
    }

    public void startUp() {
        System.out.println(getBrand() + " Начать движение.");
    }

    public void stopEnd() {
        System.out.println(getBrand() + " Закончить движение.");
    }

    @Override
    public boolean service() {
        return false;
    }

    @Override
    public void repair() {

    }
    //---------------------------------------------------

    @Override
    public  void drive() {
        System.out.println("ПОЕХАЛИ!!");
    }
}