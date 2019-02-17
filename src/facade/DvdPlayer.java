package facade;

public class DvdPlayer {
    String currentTrack;
    Amplifier amplifier;
    String movie;

    public DvdPlayer(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on(){
        System.out.println("Dvd player is on.");
    }

    public void off(){
        System.out.println("Dvd player is off.");
    }

    public void eject(){
        movie = null;
        System.out.println("Dvd ejected.");
    }

    public void play(String newMovie){
        if(movie == null){
            System.out.println("No dvd inserted.");
        }else{
            currentTrack = newMovie;
            System.out.println("Playing track: " + currentTrack);
        }
    }

    public void stop(){
        currentTrack = "";
        System.out.println("Playback stopped.");
    }

    public void pause(){
        System.out.println("Track " + currentTrack + " paused.");
    }

    public void setTwoChannelAudio() {
        System.out.println("Two channel audio is set.");
    }

    public void setSurroundAudio() {
        System.out.println("Surround audio is set.");
    }
}
