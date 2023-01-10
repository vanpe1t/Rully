package Transport;

import Drivers.Driver;
import Drivers.DriverB;
import Drivers.DriverD;

public class Bus extends Transport<DriverD> implements Competing {

    public Bus(String brand, String model, int engineValue) {
        super(brand, model, engineValue);
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
