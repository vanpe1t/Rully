package Transport;

public enum BodyType {

    SEDAN("Седан"),
    HATCHBACK("Хетчбек"),
    COUPE("Купе"),
    STATION_WAGON("Универсал"),
    OFF_ROAD("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикпа"),
    WAGON("Фургон"),
    MINIVAN("Минивэн");

    private String bodyType;

    BodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }

    @Override
    public String toString() {
        return "BodyType{" +
                "bodyType='" + getBodyType()  + '\'' +
                "} " + super.toString();
    }

}
