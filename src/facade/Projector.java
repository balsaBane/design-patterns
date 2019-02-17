package facade;

public class Projector {
    DvdPlayer dvdPlayer;

    public Projector(  DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    public void on() {
        System.out.println("Projector on.");
    }

    public void off() {
        System.out.println("Projector off.");
    }

    public void wideScreenMode() {
        System.out.println("In widescreen mode (16x9 aspect ratio)");
    }

    public void tvMode() {
        System.out.println("In tv mode (4x3 aspect ratio)");
    }
}
