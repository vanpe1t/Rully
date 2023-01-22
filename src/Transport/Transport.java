package Transport;

import Drivers.*;

import java.util.Objects;

public class Transport<A extends Driver> {

    private final String brand;
    private final String model;
    private final double engineValue;

    public Transport(String brand, String model, double engineValue) {
        this.brand = brand;
        this.model = model;
        this.engineValue = engineValue;
    }

    public void start(A driver) {

        System.out.println("Водитель " + driver.getName() + " управляет транспортным средством типа: " + getTransportType(driver)
                    + ", марки: " + getBrand() + ", модель: " +  getModel() + " и будет участвовать в заезде");
    }

    public void stop(A driver) {
        System.out.println("Водитель " + driver.getName() + " закончил управлять транспортным средством типа: " + getTransportType(driver)
                + ", марки: " + getBrand() + ", модель: " +  getModel() + " и будет участвовать в заезде");
    }

    private String getTransportType(Driver driver) {

        String transportType= "";

        if (driver instanceof DriverD) {
            transportType = "автобус";
        } else if (driver instanceof DriverB) {
            transportType = "легковой автомобиль";
        } else if (driver instanceof DriverC) {
            transportType = "грузовой автомобиль";
        } else {
            transportType = "unknown";
        }

        return transportType;
    }

    public void getDiagnostics(Driver driver) throws CantGetDiagnostic {

        if (driver.getLicensType() == null) {
             throw new UnsupportedOperationException("У воддителя " + driver.getName() + " не выбрана категория прав!");
        }

        System.out.println("Транспорт " + getTransportType(driver) + " " + getBrand() + " " + getModel() + " проходит диагностику!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineValue, engineValue) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineValue);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineValue() {
        return engineValue;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineValue=" + engineValue +
                '}';
    }
}
