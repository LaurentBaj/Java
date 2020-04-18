package Ex09.Monsters;

public class StoneMonster extends Monster {

    // Constructors
    public StoneMonster(){
        super();
    }
    public StoneMonster(String name){
        super(name);
    }

    // Methods
    @Override
    public String toString(){
        return "Stone Monster[" + super.toString() + ", Special attack = " + attack();
    }
    @Override
    public String attack(){
        return "Rock Projectile";
    }
}
