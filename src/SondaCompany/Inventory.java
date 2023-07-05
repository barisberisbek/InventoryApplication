package SondaCompany;


import java.util.ArrayList;
import java.util.List;

class Inventory {
    private final List<Vehicles> optionals;
    public Inventory() {
        optionals = new ArrayList<>();
    }
    public void add(Vehicles vehicles) {
        optionals.add(vehicles);
    }
    private int carNumber() {
        int count = 0;
        for (Vehicles vehicles : optionals) {
            if (vehicles instanceof Car) {
                count++;
            }
        }
        return count;
    }
    private int motorbikeNumber() {
        int count = 0;
        for (Vehicles vehicles : optionals) {
            if (vehicles instanceof Motorbike) {
                count++;
            }
        }
        return count;
    }
    private int finalCost() {
        int total_cost = 0;
        for (Vehicles vehicles : optionals) {
            total_cost += vehicles.totalPrice();
        }
        return total_cost;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Vehicles vehicles : optionals) {
            sb.append(vehicles.toString()).append("\n");
        }
        sb.append("TOTAL : ").append(optionals.size()).append(" Vehicles including ")
                .append(carNumber()).append(" Cars and ").append(motorbikeNumber())
                .append(" Motorbikes having a total price of ").append(finalCost())
                .append(" TL");
        return sb.toString();
    }
}
