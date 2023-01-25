package transport;
import java.util.*;
import transport.driver.Driver;
import transport.Sponsor;

public  abstract class Transport extends Object {

    private String brand;
    private String model;
    private static double engineVolume;
    private List<Sponsor> sponsors;

    private List<Mechanic<?>> mechanics;


    private boolean diagnosticsPassed;

    public Transport(double engineVolume) {
        this.engineVolume = engineVolume;
    }


    public Transport(
            String brand,
            String model,
            double engineVolume
            //Sponsor...sponsors
    ) {
        if (brand != null && !brand.isEmpty()) {
            this.brand = brand;
        }
        if (model != null && !model.isEmpty()) {
            this.model = model;
        }
        this.engineVolume = engineVolume;
        this.sponsors = new ArrayList<>();
        this.mechanics = new ArrayList<>();
        //this.sponsors = Arrays.stream(sponsors).toList();//добавление в список


    }

    //--------------------------------------------
    public abstract String[] getPitStop();

    public boolean isDiagnosticsPassed() {
        return diagnosticsPassed;
    }


    public abstract String[] getBestLapTime();

    public abstract String[] getMaxSpeed();

    public abstract void startUp();

    public abstract void stopEnd();


    public static String getBrand() {
        return getBrand();
    }

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

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public abstract void repair();

    public void setModel(String model) {
        this.model = model;
    }


    public abstract void drive();

    public void addSponsor(Sponsor sponsor) {
        sponsors.add(sponsor);
    }

    public void addMechanic(Mechanic<?> mechanic) {
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        if (!sponsors.isEmpty()) {
            result.append("Спонсоры: ");
        }
        for (int i = 0;i< sponsors.size();i++) {
            result.append(sponsors.get(i));
            if (i!= sponsors.size() - 1){
                result.append((", "));
            }
        }
        result.append("\n");
        if (!mechanics.isEmpty()) {
            result.append("Механики: ");
        }
        for (int i = 0;i< mechanics.size();i++) {
            result.append(mechanics.get(i));
            if (i!= mechanics.size() - 1){
                result.append((", "));
            }
        }
        return result.toString();
    }
}

