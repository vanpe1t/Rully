package Drivers;

import java.util.Objects;

public class Driver {
    private String name;
    private boolean haveLicense;
    private int experience;
    private LicensType licensType;


    public Driver(String name, boolean haveLicense, int experience) {
        this.name = name;
        this.haveLicense = haveLicense;
        this.experience = experience;
    }

    public void startMoving() {
        System.out.println("Начал движение.");
    }

    public void stopMoving() {
        System.out.println("Остановился.");
    }

    public void refuelTheCar() {
        System.out.println("Заправил.");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHaveLicense(boolean haveLicense) {
        this.haveLicense = haveLicense;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setLicensType(LicensType licensType) {
        this.licensType = licensType;
    }

    public LicensType getLicensType() {
        return licensType;
    }

    public String getName() {
        return name;
    }

    public boolean isHaveLicense() {
        return haveLicense;
    }

    public int isExperience() {
        return experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return haveLicense == driver.haveLicense && experience == driver.experience && Objects.equals(name, driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, haveLicense, experience);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", haveLicense=" + haveLicense +
                ", experience=" + experience +
                '}';
    }
}
