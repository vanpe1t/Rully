package Transport;

public enum BusСapacity {
    XS(0, 10, "Особо малая"),
    S(0, 10, "Особо малая"),
    M(0, 10, "Особо малая"),
    L(0, 10, "Особо малая"),
    XL(0, 10, "Особо малая");

    int minCapacity;
    int maxCapacity;
    String name;

    BusСapacity(int minCapacity, int maxCapacity, String name) {
        this.maxCapacity = maxCapacity;
        this.minCapacity = minCapacity;
        this.name = name;
    }

    @Override
    public String toString() {
        return "BusСapacity{" +
                "minCapacity=" + minCapacity +
                ", maxCapacity=" + maxCapacity +
                ", name='" + name + '\'' +
                "} " + super.toString();
    }
}
