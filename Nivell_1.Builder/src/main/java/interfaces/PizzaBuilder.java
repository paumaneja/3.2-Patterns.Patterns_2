package interfaces;

import enums.Doughs;
import enums.Sizes;
import models.Pizza;

public interface PizzaBuilder {

    void setSize(Sizes size);
    void setDough(Doughs dough);
    void setToppings();
    Pizza getPizza();
}
