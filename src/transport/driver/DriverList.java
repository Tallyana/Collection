package transport.driver;
import transport.Transport;

import java.util.HashSet;
import java.util.Set;

public class DriverList {
    private Set<Driver> drivers = new HashSet<>();

    public void add(Driver driver) {
        if (drivers.contains(driver)) {
            throw new IllegalArgumentException("Такой водитель уже есть!");
        }
                driver.add(driver);
            }

        }


  //  Set setA = new HashSet();
//  String element = "element 1";
//setA.add(element);
//   System.out.println( setA.contains(element) );
