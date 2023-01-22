package Drivers;

public class DriverD extends Driver {

    public DriverD(String name, boolean haveLicense, int experience) {
        super(name, haveLicense, experience);
    }

    @Override
    public void setLicensType(LicensType licensType) {
        super.setLicensType(licensType);
    }

}
