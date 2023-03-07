package transport;
import transport.driver.DriverD;
import java.util.List;
import java.util.Arrays;

public class Bus extends Transport implements Competing {

    private DriverD driver;
    private    List<Mechanic<Bus>>mechanics;


    public Bus(String brand,
               String model,
               double engineVolume,
               DriverD driver,
               Mechanic<Bus>...mechanics) {
        super(brand, model, engineVolume);
        setDriver(driver);
        this.mechanics = Arrays.asList((mechanics));
    }

    public void setDriver(DriverD driver) {
        this.driver = driver;
    }

    public List<Mechanic<Bus>> getMechanics () {
        return getMechanics();
    }



    //public static final String[] BUS_PIT_STOP = {"Поменять колеса", "Залить топливо 2", "Выйти перекурить"};

    //public static final String[] getBusBestLapTime = {"Лучшее время круга у №13", "Лучшее время круга у №14", "Лучшее время круга у №15"};

   // public static final String[] getBusMaxSpeed = {"Максимальная скорость у №16", "Максимальная скорость у №17", "Максимальная скорость у №18"};



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


    public String drive() {
        System.out.println("УЕХАЛИ!!");
        return null;
    }

    @Override
    public List<?> mechanics() {
        return null;
    }

    @Override
    public String toString() {
        return "Автобус с водителем"  + driver + "\n" + super.toString();
    }
}
