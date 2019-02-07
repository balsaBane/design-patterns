package decorator;

public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "House blend";
    }

    @Override
    public double cost() {
        return .89;
    }
}
