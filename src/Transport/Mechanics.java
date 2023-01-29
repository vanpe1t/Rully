package Transport;

import java.util.Objects;

public class Mechanics {

    private final String name;

    private String company;

    public void fixVehicle(Transport... transports) {
        for (Transport transport : transports) {
            System.out.println("Починяем " + transport.getModel() + " " + transport.getBrand());
        }
    }

    public void maintenanceService(Transport... transports) {
        for (Transport transport : transports) {
            System.out.println("Проводим тех. обслуживание " + transport.getModel() + " " + transport.getBrand());
        }
    }

    public Mechanics(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public Mechanics(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanics mechanics = (Mechanics) o;
        return Objects.equals(name, mechanics.name) && Objects.equals(company, mechanics.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company);
    }

    @Override
    public String toString() {
        return "Mechanics{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
