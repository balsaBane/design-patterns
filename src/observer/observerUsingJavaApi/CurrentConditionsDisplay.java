package observer.observerUsingJavaApi;

import observer.observerByHand.DisplayElement;
import java.util.Observer;

import java.util.Observable;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    Observable observable;
    float temperature;
    float humidity;

    public CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and "+ humidity + "% humidity");
    }


    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
