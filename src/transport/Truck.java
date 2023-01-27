package transport;
import transport.driver.DriverC;
import java.util.Arrays;
import java.util.List;
import transport.Mechanic;
import transport.Truck;
public class Truck extends Transport implements Competing {

    private DriverC driver;

    private List<Mechanic<Truck>>mechanics;

    public Truck(
            String brand,
            String model,
            double engineVolume,
            DriverC driver,
            Mechanic<Truck>...mechanics) {
        super(brand, model, engineVolume);
        setDriver(driver);
        this.mechanics = Arrays.asList(mechanics);
    }

    public void setDriver(DriverC driver) {
        this.driver = driver;
    }

    public List<Mechanic<Truck>> getMechanics () {
        return getMechanics();
    }
    //public static String[] getTruckPitStop = {"Поменять колеса", "Залить топливо 2", "Выйти перекурить"};

    //public static String[] getTruckBestLapTime = {"Лучшее время круга №3", "Лучшее время круга у №4", "Лучшее время круга у №5"};

   // public static String[] getTruckMaxSpeed = {"Максимальная скорость у №1", "Максимальная скорость у №2", "Максимальная скорость у №6"};

    //public static void getTruckPitStop() {System.out.println(getTruckPitStop[0]);}

    //public static void getTruckBestLapTime() {System.out.println(getTruckBestLapTime[1]);}


    @Override
    public boolean isDiagnosticsPassed() {
        return super.isDiagnosticsPassed();
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

    @Override
    public String drive() {
        System.out.println("ПОЕХАЛИ!!");
        return null;
    }

    @Override
    public List<?> mechanics() {
        return null;
    }

    public String toString() {
            return "Грузовик с водителем" + driver + "\n" + super.toString();
    }


    }
