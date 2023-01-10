package Transport;

import Drivers.Driver;
import Drivers.DriverC;

public class Truck extends Transport<DriverC> implements Competing {

    public Truck(String brand, String model, double engineValue) {
        super(brand, model, engineValue);
    }


    @Override
    public void pitStop() {
        System.out.println("Грузовик " + super.getBrand() + " " +  super.getModel() + " заехал на пит-стоп.");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Грузовик " + super.getBrand() + " " +  super.getModel() + " лучшее время круга.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Грузовик " + super.getBrand() + " " +  super.getModel() + " максимальная скорость");
    }

    @Override
    public String toString() {
        return "Truck{} " + super.toString();
    }
}
