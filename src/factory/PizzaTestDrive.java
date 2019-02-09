package factory;

public class PizzaTestDrive {
    public static void main(String [] args){
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicago = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
    }
}
