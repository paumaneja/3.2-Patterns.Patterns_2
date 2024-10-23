package models;

import enums.Doughs;
import enums.Sizes;
import interfaces.PizzaBuilder;

import java.util.List;

public abstract class PizzaMargaritaBuilder extends models.PizzaBuilder implements PizzaBuilder {

    public PizzaMargaritaBuilder(Sizes size, Doughs dough, List<String> toppings) {
        super(size, dough, toppings);
    }

    public PizzaMargaritaBuilder reset(){
        return new PizzaMargaritaBuilder();
    }
    public void setSize(){
        this.s

    }
}
