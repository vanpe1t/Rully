package Transport;

import Drivers.Driver;
import Drivers.DriverB;

public class Car extends Transport<DriverB> implements Competing {

    private BodyType type;

    public Car(String brand, String model, int engineValue) {
        super(brand, model, engineValue);
    }

    public BodyType getType() {
        return type;
    }

    public void setType(BodyType type) {
        this.type = type;
    }

    public void printType() {
        if (type != null) {
            System.out.println(type);
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
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
