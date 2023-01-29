package Drivers;

public class DriverB extends Driver {

    public DriverB(String name, boolean haveLicense, int experience) {
        super(name, haveLicense, experience);
    }

    @Override
    public void setLicensType(LicensType licensType) {
        super.setLicensType(licensType);
    }
}
