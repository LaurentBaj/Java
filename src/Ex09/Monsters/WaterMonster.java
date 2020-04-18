package Ex09.Monsters;

public class WaterMonster extends Monster{

    // Constructors
    public WaterMonster(){
        super();
    }
    public WaterMonster(String name){
        super(name);
    }

    // Methods
    @Override
    public String toString(){
        return "Water Monster[" + super.toString() + ", Special attack = " + attack();
    }
    @Override
    public String attack(){
        return "Drowning Pour";
    }
}
