package factory.pizzas;

import factory.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
        public ChicagoStyleCheesePizza() {
            name = "NY style sauce and cheese pizza";
            dough = "Thin crust dough";
            sauce = "Marinara Sauce";

            toppings.add("Grated Reggiano Cheese");
        }
}
