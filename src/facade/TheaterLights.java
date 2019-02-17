package facade;

public class TheaterLights {


    public TheaterLights() {
    }

    public void on() {
        System.out.println("Lights on.");
    }

    public void off() {
        System.out.println("Lights off.");
    }

    public void dim(int level) {
        System.out.println("Lights dimming to " + level  + "%");
    }
}
