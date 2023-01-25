package transport;

public class Sponsor {

  private final  String name;
  private int offSum;

    public Sponsor(String name, int offSum) {
        this.name = name;
        this.offSum = offSum;
    }

    public String getName() {
        return name;
    }

    public int getOffSum() {
        return offSum;
    }
    public  void sponsorRace(){
        offSum = 0;
    }
}
