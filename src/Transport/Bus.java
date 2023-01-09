package Transport;

import Drivers.Driver;
import Drivers.DriverB;
import Drivers.DriverD;

public class Bus<A extends DriverD> extends Transport implements Competing {

    public Bus(String brand, String model, int engineValue) {
        super(brand, model, engineValue);
    }

    public void start(A driver) {
        System.out.println("Водитель " + driver.getName() + " управляет автобусом " + super.getBrand() + " " +  super.getModel() + " и будет участвовать в заезде");
    }

    public void stop(A driver) {
        System.out.println("Водитель " + driver.getName() + " закончил управлять автобусом " + super.getBrand() + " " +  super.getModel());
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус " + super.getBrand() + " " +  super.getModel() + " заехал на пит-стоп.");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Автобус " + super.getBrand() + " " +  super.getModel() + " лучшее время круга.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Автобус " + super.getBrand() + " " +  super.getModel() + " максимальная скорость");
    }
}
