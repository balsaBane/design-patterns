package factory.pizzas;

import factory.Pizza;

public class NYStyleClamPizza extends Pizza {

    public NYStyleClamPizza() {
        name = "NY style clam pizza";
        dough = "Thick crust dough";
        sauce = "Tomato sauce";

        toppings.add("Grained cheese");
    }
}
