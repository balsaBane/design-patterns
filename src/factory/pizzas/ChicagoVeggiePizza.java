package factory.pizzas;

import factory.Pizza;

public class ChicagoVeggiePizza extends Pizza {
    public ChicagoVeggiePizza() {
        name = "Chicago sauce and cheese pizza";
        dough = "Thin crust dough";
        sauce = "Green olive sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
