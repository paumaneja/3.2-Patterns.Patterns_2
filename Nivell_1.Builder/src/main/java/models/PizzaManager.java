package models;

import enums.Doughs;
import enums.Sizes;
import interfaces.PizzaBuilder;

public class PizzaManager {

    public void createPizzaMargarita(PizzaBuilder builder){
        builder.setSize(Sizes.LARGE);
        builder.setDough(Doughs.ORIGINAL);
        builder.setToppings();
        //builder.getPizza();
    }

    public void createPizzaMarinera(PizzaBuilder builder){
        builder.setSize(Sizes.SMALL);
        builder.setDough(Doughs.CHICAGO);
        builder.setToppings();
        //builder.getPizza();
    }
}
