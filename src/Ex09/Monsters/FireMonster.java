package Ex09.Monsters;

public class FireMonster extends Monster {

    // Constructors
    public FireMonster(){
        super();
    }
    public FireMonster(String name){
        super(name);
    }

    // Methods
    @Override
    public String toString(){
        return "Fire Monster[" + super.toString() + ", Special attack = " + attack();
    }
    @Override
    public String attack(){
        return "Scorching Fire";
    }
}
