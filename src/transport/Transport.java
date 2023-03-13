package transport;
import java.util.ArrayList;
import java.util.List;

public  abstract class Transport {

    private String brand;
    private String model;
    private static double engineVolume;

    private List<Sponsor> sponsors;
    private List<Mechanic<?>> mechanics;


    public Transport(
            String brand,
            String model,
            double engineVolume) {

        if (brand != null || !brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || !model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        setEngineVolume(engineVolume);
        this.sponsors = new ArrayList<>();
        this.mechanics = new ArrayList<>();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public static double getEngineVolume()
    {return engineVolume;}




    public void  addSponsor(Sponsor sponsor){
        sponsors.add(sponsor);
    }
    public void addMechanic(Mechanic<?>mechanic){
        mechanics.add(mechanic);
    }

    public Transport(double engineVolume) {
        this.engineVolume = engineVolume;
    }
        public abstract void startUp ();

        public abstract void stopEnd ();

      public void setEngineVolume(double engineVolume){
          if (engineVolume<= 0) {
              this.engineVolume = 1.6;
          } else {
              this.engineVolume = engineVolume;
          }
      }

        public void setBrand (String brand){
            this.brand = brand;
        }
        public abstract boolean service ();


        public List<Sponsor> getSponsors () {
            return sponsors;
        }

        public abstract void repair ();

        public void setModel (String model){
            this.model = model;
        }


        public abstract String drive ();

        public abstract List<?> mechanics ();

    public String toString () {
        StringBuilder result = new StringBuilder();
        if (!sponsors.isEmpty()) {
            result.append("Спонсоры: ");
        }
        for (int i = 0; i < sponsors.size(); i++) {
            result.append(sponsors.get(i));
            if (i != sponsors.size() - 1) {
                result.append((", "));
            }
        }
                result.append("\n");

        if (!mechanics.isEmpty()) {
            result.append("Механики: ");
        }
        for (int i = 0; i < mechanics.size(); i++) {
            result.append(mechanics.get(i));
            if (i != mechanics.size() - 1) {
                result.append(", ");
            }
        }
        return result.toString();
    }
    }







