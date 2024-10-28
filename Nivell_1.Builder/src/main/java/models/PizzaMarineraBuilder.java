package models;

import enums.Doughs;
import enums.Sizes;
import interfaces.PizzaBuilder;

import java.util.ArrayList;
import java.util.List;

public class PizzaMarineraBuilder implements PizzaBuilder {
    private Sizes size;
    private Doughs dough;
    private List<String> toppings;


    @Override
    public void setSize(Sizes size) {
        this.size = size;
    }

    @Override
    public void setDough(Doughs dough) {
        this.dough = dough;
    }

    @Override
    public void setToppings() {
        this.toppings = new ArrayList<>();
        toppings.add("tomato");
        toppings.add("mozarella");
        toppings.add("tuna");
        toppings.add("onion");
    }

    @Override
    public Pizza getPizza() {
        return new Pizza(size, dough, toppings);
    }

}
