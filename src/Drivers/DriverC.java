package Drivers;

import Drivers.Driver;

public class DriverC extends Driver {

    public static final String TYPE_LICENSE = "C";

    public DriverC(String name, boolean haveLicense, int experience) {
        super(name, haveLicense, experience);
    }
}
