import transport.*;
import  transport.driver.Driver;
import  transport.driver.DriverB;
import transport.driver.DriverC;
import transport.driver.DriverD;
import java.util.*;
import transport.Car;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        DriverB vasya = new DriverB(" Вася");
        DriverC casha = new DriverC(" Саша");
        DriverD dima = new DriverD(" Дима");

        Mechanic<Car>petya = new Mechanic<>("Петр","Петров","ООО АЛЬФА");
        Mechanic<Truck>ivan = new Mechanic<>("Иван","Иванов","ООО Бета");
        Mechanic<Bus>sergey = new Mechanic<>("Сергей","Сергеев","ООО Гамма");
        Mechanic<Transport>universal = new Mechanic<>("Универсальный","механик","ООО Сигма");

        Sponsor alfa = new Sponsor("ООО Альфа",10_000);
        Sponsor beta = new Sponsor("ООО Бета",15_000);
        Sponsor gamma = new Sponsor("ООО Гамма",30_000);

        Car car = new Car("Toyota","Rav4",2.0,vasya,petya);
        car.addSponsor(alfa);
        car.addMechanic(petya);

        Truck truck = new Truck("Kamaz","234",6.0,casha,ivan);
        truck.addSponsor(alfa);
        truck.addSponsor(beta);

        Bus bus = new Bus("Ikarus","305",10.0,dima,sergey);
        bus.addSponsor(gamma);
        bus.addMechanic(sergey);

        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);

        car.toString();
        car.startUp();
        car.stopEnd();
        bus.drive ();
//  --------------------------------------------------------------
      /* Map<String,String> spisok = new HashMap<String,String>();
        spisok.put("Toyota ","Механик Петр Петров");
        spisok.put("Kamaz ","Механик Иван Иванов");
        spisok.put("Ikarus ","Механик Сергей Сергеев");
        for (Map.Entry<String,String> item : spisok.entrySet()) {
            System.out.println("Ключ: " + item.getKey() + "Значение: " + item.getValue());
        }*/
       //Map<Car, ArrayList<Mechanic<Car>>>spisok = new  HashMap();


        Map<Car, List<Mechanic<Car>>> spisok1 = new HashMap<>();
        spisok1.put(car, car.getMechanics()); // вот сюда кладу ОБЪЕКТ типа Car, он инициализирован выше
        List<Mechanic<Car>> listOfMechanics2 = spisok1.get(car); // а вот тут достаю объект список механиков, используя в качестве ключа ОБЪЕКТ car
        for (Map.Entry<Car, List<Mechanic<Car>>> item : spisok1.entrySet()){
            System.out.println("Ключ: " + item.getKey().getBrand() + "     Значение: "  + item.getValue());
        }

        //------------------------------------------------------------

        Set<Driver> driverSet = new HashSet<>();

        for (Driver driver : driverSet){
            driverSet.add(driver);
        }
        Iterator<Driver> iterator = driverSet.iterator();

        while (iterator.hasNext()) {
            Driver driver = iterator.next();
            System.out.println(driver);
        }

    }

}

