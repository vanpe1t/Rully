package Transport;

import Drivers.Driver;
import Drivers.DriverB;
import Drivers.DriverD;

public class Bus extends Transport<DriverD> implements Competing {

    private BusСapacity type;

    public Bus(String brand, String model, int engineValue) {
        super(brand, model, engineValue);
    }

    public void setType(BusСapacity type) {
        this.type = type;
    }

    public BusСapacity getType() {
        return type;
    }

    public void printType() {
        if (type != null) {
            System.out.println(type);
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }

    @Override
    public void getDiagnostics(Driver driver) throws CantGetDiagnostic{
        throw new CantGetDiagnostic("Автобусы не могут проходить диагностику !");
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
