package facade;

public class Tuner {
    String description;
    Amplifier amplifier;
    double frequency;

    public Tuner( Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void setFrequency(double frequency) {
        System.out.println("Setting frequency to " + frequency);
        this.frequency = frequency;
    }

    public void setAm() {
        System.out.println("Setting AM mode");
    }

    public void setFm() {
        System.out.println("Setting FM mode");
    }

}
