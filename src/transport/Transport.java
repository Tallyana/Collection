package transport;
import java.util.*;
import transport.driver.Driver;
import transport.Sponsor;

public  abstract class Transport extends Object {

    private String brand;
    private String model;
    private static double engineVolume;
     private List<Sponsor>sponsors;

     private List<Mechanic<?>>mechanics;


    private  boolean diagnosticsPassed;

    public Transport(double engineVolume) {
        this.engineVolume = engineVolume;
    }


    public Transport(
            String brand,
            String model,
            double engineVolume,
            Mechanic<?>...mechanics,
            Sponsor...sponsors) {
        if (brand != null && !brand.isEmpty()) {
            this.brand = brand;
        }
        if (model != null && !model.isEmpty()) {
            this.model = model;
        }
        this.engineVolume = engineVolume;
        this.sponsors = Arrays.asList(sponsors);
        //this.sponsors = Arrays.stream(sponsors).toList();//добавление в список


    }
    public List<Sponsor> getSponsors() {
        return sponsors;}
    //--------------------------------------------
    public abstract String[] getPitStop();

    public boolean isDiagnosticsPassed(){
        return diagnosticsPassed ;}


    public abstract String[] getBestLapTime();

    public abstract String[] getMaxSpeed();

    public abstract void startUp();

    public abstract void stopEnd();

    public String toString() {
        return brand + " Модель " + model + ".Обьем двигателя " + engineVolume;
    }


    public static String getBrand(){
        return getBrand();}

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public static String getModel() {
        return getModel();
    }

    public abstract boolean service();

    public static double getEngineVolume() {
        return engineVolume;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public abstract void repair();

    public void setModel(String model){
        this.model = model;
    }


    public abstract void drive();
}
