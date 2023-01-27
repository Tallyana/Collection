package transport.driver;
import transport.Transport;

public abstract class Driver<T extends Transport> {
    private String name;

    public Driver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  name ;
    }
}
