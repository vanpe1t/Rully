package Drivers;

public enum LicensType {
    LICENS_TYPE_C("C"),
    LICENS_TYPE_B("B"),
    LICENS_TYPE_D("D");

    private String licensType;

    LicensType(String licensType) {
        this.licensType = licensType;
    }
}
