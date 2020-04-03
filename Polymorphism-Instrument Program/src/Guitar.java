public class Guitar extends Instrument {
    private String color;
    private boolean isElectric;

    // Inherited ability-methods that are overloaded
    public void makeSound(){
        System.out.println("This is a " + this.getInstName() + "  and makes a " + this.getSoundSignature() + " type of sound." );
    }

    // Ability methods that are exclusive to the Guitar class
    public void isElectricCanShredColor(){
        System.out.println("This " + this.getInstName() + " can shred! " +
                " It's color is " + this.color + ". Is it electric? " + this.isElectric);
    }

    // Constructors
    public Guitar() {

    }
    public Guitar(int id, String instName, String soundSignature, boolean isSecondhand, String color, boolean isElectric){
        super(id, instName, soundSignature, isSecondhand);
        this.color = color; this.isElectric = isElectric;
        isElectricCanShredColor();
    }

}