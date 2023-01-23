package Transport;

import Drivers.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Transport<A extends Driver> {
    private final String brand;
    private final String model;
    private final double engineValue;
    private List<Mechanics> mechanics;

    private Driver driver;

    public void getDriver() {
        if (driver != null) {
            System.out.println(driver);
        } else {
            System.out.println("Сейчас за рулем транспортного средства нет водителя !");
        }
    }

    public void getMechanics() {
        if (mechanics != null && mechanics.size() > 0) {
            for (Mechanics mechanic : mechanics) {
                System.out.println(mechanic);
            }
        } else {
            System.out.println("За транспортом не назначена команда механников !");
        }
    }

    public Transport(String brand, String model, double engineValue) {
        this.brand = brand;
        this.model = model;
        this.engineValue = engineValue;
    }

    public void start(A driver) {
        this.driver = driver;
        System.out.println("Водитель " + driver.getName() + " управляет транспортным средством типа: " + getTransportType(driver)
                    + ", марки: " + getBrand() + ", модель: " +  getModel() + " и будет участвовать в заезде");
    }

    public void stop() {
        System.out.println("Водитель " + driver.getName() + " закончил управлять транспортным средством типа: " + getTransportType(driver)
                + ", марки: " + getBrand() + ", модель: " +  getModel() + " и будет участвовать в заезде");
        this.driver = null;
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

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineValue() {
        return engineValue;
    }

    public void setMechanics(List mechanics) {
        this.mechanics = mechanics;
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

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineValue=" + engineValue +
                '}';
    }
}
