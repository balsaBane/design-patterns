package adapter.ducks;

public class DuckTestDrive {
    public static void main(String[]args){

        MallardDuck duck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();

        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("The turkey says:");
        wildTurkey.gobble();
        wildTurkey.fly();
        System.out.println("---------------");

        System.out.println("The duck says:");
        testDuck(duck);
        System.out.println("The TurkeyAdapter says:");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
