package transport;

import transport.driver.Driver;

import java.util.HashSet;
import java.util.Set;

public class Mechanic<T extends  Transport> {
    private final String name;
    private final String surName;
    private final String company;




    public Mechanic(String name, String surName, String company) {
        this.name = name;
        this.surName = surName;
        this.company = company;
    }
    public void doService(T transport){
       transport.service();
    }
      public void  doRepair(T transport){
        transport.repair();
      }
    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getCompany() {
        return company;
    }
    public String toString(){
        return "Механик"+ name + " " + surName + " из \n" + company + "\"";
    }

}
