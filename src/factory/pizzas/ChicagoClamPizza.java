package factory.pizzas;

import factory.Pizza;

public class ChicagoClamPizza extends Pizza {
    public ChicagoClamPizza() {
        name = "Chicago clam pizza";
        dough = "Thick crust dough";
        sauce = "Tomato sauce";

        toppings.add("Ketchup");
    }
}
