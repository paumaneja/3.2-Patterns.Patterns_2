package models;

import enums.Doughs;
import enums.Sizes;

import java.util.List;

public class Pizza {
    private Sizes size;
    private Doughs dough;
    private List<String> toppings;

    public Pizza(Sizes size, Doughs dough, List<String> toppings) {
        this.size = size;
        this.dough = dough;
        this.toppings = toppings;
    }

    public Sizes getSize() {
        return size;
    }

    public void setSize(Sizes size) {
        this.size = size;
    }

    public Doughs getDough() {
        return dough;
    }

    public void setDough(Doughs dough) {
        this.dough = dough;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", dough=" + dough +
                ", toppings=" + toppings +
                '}';
    }
}
