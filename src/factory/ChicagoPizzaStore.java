package factory;

import factory.pizzas.ChicagoClamPizza;
import factory.pizzas.ChicagoPepperoniPizza;
import factory.pizzas.ChicagoStyleCheesePizza;
import factory.pizzas.ChicagoVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        } else if(type.equals("veggie")){
            return new ChicagoVeggiePizza();
        } else if(type.equals("clam")){
            return new ChicagoClamPizza();
        } else if(type.equals("pepperoni")){
            return new ChicagoPepperoniPizza();
        } else return null;
    }
}
