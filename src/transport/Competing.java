package transport;

public interface Competing {
    String[]  getPitStop();
    String[] getBestLapTime();
    String[]  getMaxSpeed ();

    void  drive();
}
