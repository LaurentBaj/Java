
public class Instrument {

    // Instance variables
    private int id;
    private String instName, soundSignature;
    private boolean isSecondhand;


    // Getters and Setters
    public String getSoundSignature() {
        return soundSignature;
    }
    public void setSoundSignature(String soundSignature) {
        this.soundSignature = soundSignature;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getInstName() {
        return instName;
    }
    public void setInstName(String instName) {
        this.instName = instName;
    }
    public boolean isSecondhand() {
        return isSecondhand;
    }
    public void setSecondhand(boolean isSecondhand) {
        this.isSecondhand = isSecondhand;
    }


    // Abilities
    public void makeSound(){
        System.out.println(this.instName + " makes a " + soundSignature + " type of sound." );
    }


    // Constructors
    public Instrument(){

    }
    public Instrument(int id, String instName, String soundSignature, boolean isSecondhand){
        this.id = id;
        this.instName = instName;
        this.soundSignature = soundSignature;
        this.isSecondhand = isSecondhand;

        System.out.println(getInstName() + " makes a " + getSoundSignature() + " sound, " +
                "is whether it is secondhand or not is " + isSecondhand() + ". " +
                "It's id-number is " + getId() + ".");
    }
}