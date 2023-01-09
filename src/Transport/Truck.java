package Transport;

import Drivers.Driver;
import Drivers.DriverC;

public class Truck<A extends Driver> extends Transport implements Competing {

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


    public void start(A driver) {
        System.out.println("Водитель " + driver.getName() + " управляет грузовиком " + super.getBrand() + " " +  super.getModel() + " и будет участвовать в заезде");
    }


    public void stop(A driver) {
        System.out.println("Водитель " + driver.getName() + " закончил управлять грузовиком " + super.getBrand() + " " +  super.getModel());
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
