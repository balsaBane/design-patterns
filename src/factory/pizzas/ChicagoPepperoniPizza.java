package factory.pizzas;

import factory.Pizza;

public class ChicagoPepperoniPizza extends Pizza {
    public ChicagoPepperoniPizza() {
        name = "Chicago peperoni pizza";
        dough = "Thin crust dough";
        sauce = "Special sauce";

        toppings.add("Peperoni");
    }
}
