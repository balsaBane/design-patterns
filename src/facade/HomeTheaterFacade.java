package facade;

public class HomeTheaterFacade {
    Amplifier amp;
    DvdPlayer dvd;
    CdPlayer cdPlayer;
    PopcornPopper popper;
    Projector projector;
    Screen screen;
    TheaterLights lights;
    Tuner tuner;

    public HomeTheaterFacade(Amplifier amplifier, DvdPlayer dvdPlayer, CdPlayer cdPlayer, PopcornPopper popcornPopper,
                             Projector projector, Screen screen, TheaterLights theatherLights, Tuner tuner) {
        this.amp = amplifier;
        this.dvd = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.popper = popcornPopper;
        this.projector = projector;
        this.screen = screen;
        this.lights = theatherLights;
        this.tuner = tuner;
    }

    public void watchMovie(String movie){
        System.out.println("Get ready to watch a movie!");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvdPlayer(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }
}
