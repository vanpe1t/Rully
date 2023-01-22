package Transport;

import java.util.*;

public class ServiceStation {

    private Queue<Transport> transportQueue = new LinkedList<>();

    public void addQueue(Transport transport) {
        if (transport instanceof Bus) {
            System.out.println("Автобусы не могут вставать на техническо обслуживание !");
        } else {
            transportQueue.add(transport);
        }
    }

    public void makeMantance() {
        Transport transport = transportQueue.poll();
        if (transport != null) {
            System.out.println("Проводим тех. осмотр " + transport.getModel() + " " + transport.getBrand());
        } else {
            System.out.println("Очередь пуста");
        }
    }

}
