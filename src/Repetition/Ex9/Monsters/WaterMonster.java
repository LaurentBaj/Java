package Repetition.Ex9.Monsters;

public class WaterMonster extends Monster{
    public WaterMonster(String name){
        super(name);
    }
    @Override
    public String attack(){
        return "Water Monster sends waves of destruction";
    }
}