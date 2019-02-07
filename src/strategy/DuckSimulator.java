package strategy;

public class DuckSimulator {
    public static void main(String [] args){

        Duck duck = new MalardDuck();
        duck.performFly();
        duck.performQuack();

        Duck duck1 = new ModelDuck();
        duck1.performQuack();
        duck1.performFly();
        System.out.println("---------");
        // Setting behavior dynamically
        duck1.setFlyBehavior(new FlyRocketPowered());
        duck1.performFly();
    }
}
