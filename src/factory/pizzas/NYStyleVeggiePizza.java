package factory.pizzas;

import factory.Pizza;

public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        name = "NY style veggie pizza";
        dough = "Thin crust dough";
        sauce = "Some sauce";

        toppings.add("Origano");
    }
}
