package SondaCompany;


import java.util.ArrayList;
import java.util.List;

abstract class Vehicles {
    protected final int price;
    protected List<String> optionals;

    public Vehicles(int price) {
        this.price = price;
        optionals = new ArrayList<>();
    }

    public void setAbs(boolean value) {
        if (value) {
            optionals.add(OptionsEnum.ABS.getDisplayName());
        }
    }

    public void setMusicSystem(boolean value) {
        if (value) {
            optionals.add(OptionsEnum.MUSIC_SYSTEM.getDisplayName());
        }
    }

    public void setAirBag(boolean value) {
        if (value) {
            optionals.add(OptionsEnum.AIR_BAG.getDisplayName());
        }
    }

    public void setSunRoof(boolean value) {
        if (value) {
            optionals.add(OptionsEnum.SUNROOF.getDisplayName());
        }
    }

    public void setSeatHeating(boolean value) {
        if (value) {
            optionals.add(OptionsEnum.SEAT_HEATING.getDisplayName());
        }
    }

    private int calculateOptionalsPrice() {
        int total = 0;
        for (String optional : optionals) {
            OptionsEnum optionalEnum = OptionsEnum.fromString(optional);
            total += optionalEnum.getPrice();
        }
        return total;
    }


    public int totalPrice() {
        return price + calculateOptionalsPrice();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName()).append(" with ");
        for (int i = 0; i < optionals.size(); i++) {
            sb.append(optionals.get(i));
            if (i < optionals.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(" having a total price of ").append(totalPrice()).append(" TL");
        return sb.toString();
    }
}