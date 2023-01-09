package Transport;

import Drivers.*;

import java.util.Objects;

public class Transport {

    private final String brand;
    private final String model;
    private final double engineValue;

    public Transport(String brand, String model, double engineValue) {
        this.brand = brand;
        this.model = model;
        this.engineValue = engineValue;
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
