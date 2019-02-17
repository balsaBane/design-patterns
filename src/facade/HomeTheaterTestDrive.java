package facade;

public class HomeTheaterTestDrive {
    public static void main(String [] args){
        Amplifier amp = new Amplifier();
        DvdPlayer dvdPlayer = new DvdPlayer(amp);
        Tuner tuner = new Tuner(amp);
        CdPlayer cdPlayer = new CdPlayer(amp);
        PopcornPopper popcornPopper = new PopcornPopper();
        Projector projector = new Projector(dvdPlayer);
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp,dvdPlayer,cdPlayer,popcornPopper, projector,screen,lights,tuner);

        homeTheater.watchMovie("Ghost rider");
        homeTheater.endMovie();
    }
}
