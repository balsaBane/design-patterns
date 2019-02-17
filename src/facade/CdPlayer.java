package facade;

public class CdPlayer {
    int currentTrack;
    Amplifier amplifier;
    String title;

    public CdPlayer(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on(){
        System.out.println("Cd player is on.");
    }

    public void off(){
        System.out.println("Cd player is off.");
    }

    public void eject(){
        title = null;
        System.out.println("Cd ejected.");
    }

    public void play(int track){
        if(title == null){
            System.out.println("No cd inserted.");
        }else{
            currentTrack = track;
            System.out.println("Playing track: " + currentTrack);
        }
    }

    public void stop(){
        currentTrack = 0;
        System.out.println("Playback stopped.");
    }

    public void pause(){
        System.out.println("Track " + currentTrack + " paused.");
    }
}
