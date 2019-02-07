package strategy;

public class MalardDuck extends Duck {

    public MalardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a mallard duck.");
    }
}
