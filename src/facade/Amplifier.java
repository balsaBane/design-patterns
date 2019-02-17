package facade;

public class Amplifier  {

    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;

    public Amplifier() {

    }

    public void on(){
        System.out.println("Amplifier on.");
    }

    public void off(){
        System.out.println("Amplifier off.");
    }

    public void setStereoSound(){
        System.out.println("Stereo mode on.");
    }

    public void setSurroundSound(){
        System.out.println("Surround system on.");
    }

    public void setVolume(int level){
        System.out.println("Volume set to: " + level);
    }

    public void setTuner(Tuner tuner){
        this.tuner = tuner;
    }

    public void setDvdPlayer(DvdPlayer dvdPlayer){
        this.dvdPlayer = dvdPlayer;
    }

    public void setCdPlayer(CdPlayer cdPlayer){
        this.cdPlayer = cdPlayer;
    }
}
