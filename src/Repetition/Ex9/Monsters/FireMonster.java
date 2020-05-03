package Repetition.Ex9.Monsters;

public class FireMonster extends Monster{
    public FireMonster(String name){
        super(name);
    }
    @Override
    public String attack(){
        return "Fire monster sends blazing breath";
    }

}