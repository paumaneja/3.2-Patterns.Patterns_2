package models;

import enums.Doughs;
import enums.Sizes;
import interfaces.Builder;

import java.util.List;

public class PizzaBuilder implements Builder {
    private final Sizes size;
    private final Doughs dough;
    private final List<String> toppings;

    public PizzaBuilder(Sizes size, Doughs dough, List<String> toppings){
        this.size = size;
        this.dough = dough;
        this.toppings = toppings;
    }
}
