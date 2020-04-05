package InterfaceAndAbstract;

public class Instrument extends Electrical implements Playable{

    private String bandRole;
    private String sound;

    // Implementations
    public void setSound(String sound){
        this.sound = sound;
    }
    public String getSound(){
        return sound;
    }
    public void setBandRole(String bandRole){
        this.bandRole = bandRole;
    }
    public String getBandRole(){
        return bandRole;
    }

    // Constructor
    public Instrument(String sound, String bandRole){
        this.bandRole = bandRole; this.sound= sound;
    }

    // Abstract methods
    public void setEffect(String effect){
        this.effect = effect;
    }
    public String getEffect(){
        return effect;
    }



}
