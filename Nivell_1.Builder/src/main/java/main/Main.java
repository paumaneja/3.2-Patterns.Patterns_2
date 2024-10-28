package main;

import models.Pizza;
import models.PizzaManager;
import models.PizzaMargaritaBuilder;
import models.PizzaMarineraBuilder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pizza> pizzas = new ArrayList<>();
        PizzaManager pizzaManager = new PizzaManager();
        PizzaMargaritaBuilder builder = new PizzaMargaritaBuilder();
        pizzaManager.createPizzaMargarita(builder);
        Pizza pizza = builder.getPizza();
        pizzas.add(pizza);

        PizzaMarineraBuilder builder1 = new PizzaMarineraBuilder();
        pizzaManager.createPizzaMarinera(builder1);
        pizza = builder1.getPizza();
        pizzas.add(pizza);

        for (Pizza p : pizzas) {
            String result = p.toString();
            System.out.println(result);
        }
    }
}