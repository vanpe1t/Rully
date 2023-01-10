package Transport;

import Drivers.Driver;
import Drivers.DriverB;

public class Car extends Transport<DriverB> implements Competing {

    public Car(String brand, String model, int engineValue) {
        super(brand, model, engineValue);
    }

    @Override
    public void pitStop() {
        System.out.println("Автомобиль " + super.getBrand() + " " +  super.getModel() + " заехал на пит-стоп.");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Автомобиль " + super.getBrand() + " " +  super.getModel() + " лучшее время круга.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Автомобиль " + super.getBrand() + " " +  super.getModel() + " максимальная скорость");
    }

}
