import transport.Car;
import  transport.Mechanic;
import  transport.driver.DriverB;
import transport.Transport;
import transport.Sponsor;
import transport.Truck;
import transport.Bus;
import transport.driver.DriverC;
import transport.driver.DriverD;
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
    }

}

