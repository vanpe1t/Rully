package Drivers;

public class DriverC extends Driver {

    public DriverC(String name, boolean haveLicense, int experience) {
        super(name, haveLicense, experience);
    }

    @Override
    public void setLicensType(LicensType licensType) {
        super.setLicensType(licensType);
    }

}
