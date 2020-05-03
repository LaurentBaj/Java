package Repetition.Ex9.Monsters;

public class StoneMonster extends Monster{
    public StoneMonster(String name){
        super(name);
    }
    @Override
    public String attack(){
        return "Stone Monster sends sharp shards";
    }
}