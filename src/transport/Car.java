package transport;
import transport.driver.DriverB;
import java.util.List;
import java.util.Arrays;

public class Car extends Transport implements Competing {

    private DriverB driver;
    private  List<Mechanic<Car>> mechanics;

    public Car(String brand,
               String model,
               double engineVolume,
               DriverB driver,
               Mechanic<Car>...mechanics)
    {    super(brand, model, engineVolume);
        setDriver(driver);
        this.mechanics = Arrays.asList(mechanics);

    }
    public void setDriver(DriverB driver) {
        this.driver = driver;
    }



    public List<Mechanic<Car>> getMechanics () {
        return (List<Mechanic<Car>>) mechanics();
    }


        //public static final String[] CAR_PIT_STOP = {"Поменять пробитые колеса", "Залить бензин", "Выйти перекурить"};

   // public static final String[] getCarBestLapTime = {"Лучшее время круга у №7", "Лучшее время круга у №8", " Лучшее время круга у №9"};

   // public static final String[] getCarMaxSpeed = {"Максимальная скорость у №10", " Максимальная скорость у №11", "Максимальная скорость у №12"};


    //public static void CAR_PIT_STOP() {
    //    System.out.println(CAR_PIT_STOP[1]);}

    //public static void getCarBestLapTime() {
     //   System.out.println(getCarBestLapTime[1]);}

    //public static void getCarMaxSpeed() {
        //System.out.println(getCarMaxSpeed[0]);}

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
        System.out.println("ДОЕХАЛИ!!");
        return null;
    }

    @Override
    public List<?> mechanics() {
        return null;
    }


    @Override
    public String toString() {
        return "Автомобиль с водителем" + driver + "\n" + super.toString();
    }

}