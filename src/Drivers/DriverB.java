package Drivers;

import Drivers.Driver;

public class DriverB extends Driver {

    public static final String TYPE_LICENSE = "B";

    public DriverB(String name, boolean haveLicense, int experience) {
        super(name, haveLicense, experience);
    }

}
