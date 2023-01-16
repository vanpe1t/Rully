package Transport;

public enum Tonnage {
    N1(0.0f, 3.5f, "C полной массой до 3,5 тонн"),
    N2(3.5f, 12.0f, "C полной массой свыше 3,5 до 12 тонн"),
    N3(12.0f, Float.MAX_VALUE, "C полной массой свыше 12 тонн");

    Float minTonnage;
    Float maxTonnage;
    String name;

    @Override
    public String toString() {
        return "Tonnage{" +
                "minTonnage=" + minTonnage +
                ", maxTonnage=" + maxTonnage +
                ", name='" + name + '\'' +
                "} " + super.toString();
    }

    Tonnage(Float minTonnage, Float maxTonnage, String name) {
        this.minTonnage = minTonnage;
        this.maxTonnage = maxTonnage;
        this.name = name;
    }
}
