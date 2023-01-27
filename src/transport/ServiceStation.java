package transport;

import java.util.Queue;

public class ServiceStation {

    private Queue<Transport> queue;

    public void addTransport(Transport transport){
        queue.offer(transport);
    }


}
