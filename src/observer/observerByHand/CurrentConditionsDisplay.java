package observer.observerByHand;



public class CurrentConditionsDisplay implements Observer,  DisplayElement{

    private float temp;
    private float humi;
    private Subject whetherData;

    public CurrentConditionsDisplay(Subject whetherData) {
        this.whetherData = whetherData;
        whetherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float preasure) {
        this.temp = temp;
        this.humi = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temp + "F and " + humi + "% humidity.");
    }
}
