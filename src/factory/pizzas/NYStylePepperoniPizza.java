package factory.pizzas;

import factory.Pizza;

public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza() {
        name = "NY style peperoni pizza";
        dough = "Thick crust dough";
        sauce = "Cream sauce";

        toppings.add("Peperoni");
    }
}
