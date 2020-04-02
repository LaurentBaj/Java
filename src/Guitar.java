public class Guitar extends Instrument {
    private String color;

    // Inherited ability-methods that are overloaded
    public void makeSound(){
        System.out.println(this.getInstName() + " makes a " + this.getSoundSignature() + " type of sound." );
    }

    // Ability methods that are exclusive to the Guitar class
    public void canShred(){
        System.out.println(this.getInstName() + " can shred!");
    }
    public boolean IsElectric(){
        return true;
    }



}