package Ex09.Monsters;

import Ex07.Shape;

public class Monster {
    private String name;

    // Constructors
    public Monster(){}
    public Monster(String name){
        this.name = name;
    }

    // Methods
    public String toString(){
        return "Monster[name = " + name + "]";
    }
    public String attack(){
        return "Help! I don't know how to attack!";
    }
}
