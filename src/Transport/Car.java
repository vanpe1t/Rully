package Transport;

import Drivers.Driver;
import Drivers.DriverB;

public class Car<A extends DriverB> extends Transport implements Competing {

    public Car(String brand, String model, int engineValue) {
        super(brand, model, engineValue);
    }

    public void start(A driver) {
        System.out.println("Водитель " + driver.getName() + " управляет автомобилем " + super.getBrand() + " " +  super.getModel() + " и будет участвовать в заезде");
    }

    public void stop(A driver) {
        System.out.println("Водитель " + driver.getName() + " закончил управлять автомобилем " + super.getBrand() + " " +  super.getModel());
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
