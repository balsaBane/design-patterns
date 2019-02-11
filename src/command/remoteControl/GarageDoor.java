package command.remoteControl;

public class GarageDoor {

    String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up(){
        System.out.println("Garage door is open");
    }

    public void down(){
        System.out.println("Garage door is closed");
    }

    public void stop(){
        System.out.println("Garage door stopped");
    }

    public void lightOn(){
        System.out.println("Garage light is on");

    }

    public void lightOff(){
        System.out.println("Garage light is off");
    }
}
