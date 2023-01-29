package Transport;

import Drivers.Driver;
import Drivers.DriverC;

public class Truck extends Transport<DriverC> implements Competing {

    private Tonnage type;

    public Truck(String brand, String model, double engineValue) {
        super(brand, model, engineValue);
    }

    public Tonnage getType() {
        return type;
    }

    public void setType(Tonnage type) {
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
        System.out.println("Грузовик " + super.getBrand() + " " +  super.getModel() + " заехал на пит-стоп.");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Грузовик " + super.getBrand() + " " +  super.getModel() + " лучшее время круга.");
    }

    @Override
    public void getDiagnostics(Driver driver) throws CantGetDiagnostic{
        super.getDiagnostics(driver);
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
