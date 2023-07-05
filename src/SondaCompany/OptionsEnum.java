package SondaCompany;

public enum OptionsEnum {
    AIR_BAG("Air Bag", 3000),
    MUSIC_SYSTEM("Music System", 1000),
    ABS("ABS", 5000),
    SEAT_HEATING("Seat Heating", 2000),
    SUNROOF("Sunroof", 2000);

    private final String displayName;
    private final int price;

    OptionsEnum(String displayName, int price) {
        this.displayName = displayName;
        this.price = price;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getPrice() {
        return price;
    }

    public static OptionsEnum fromString(String value) {
        for (OptionsEnum optional : OptionsEnum.values()) {
            if (optional.displayName.equalsIgnoreCase(value)) {
                return optional;
            }
        }
        throw new IllegalArgumentException("Invalid optional: " + value);
    }


}
