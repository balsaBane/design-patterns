package observer.observerByHand;

import java.util.ArrayList;

public class WeatherData implements Subject{

    float temp;
    float humidity;
    float preasure;
    private ArrayList<Observer> observers;

    public WeatherData(){
        observers = new ArrayList();
    }
    public void measurementsChanged(){
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer O) {
        observers.add(O);
    }


    @Override
    public void removeObserver(Observer O) {
        int i = observers.indexOf(O);
        if (i >= 0){
            observers.remove(O);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(temp, humidity, preasure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temp = temperature;
        this.humidity = humidity;
        this.preasure = pressure;
        measurementsChanged();
    }

}
