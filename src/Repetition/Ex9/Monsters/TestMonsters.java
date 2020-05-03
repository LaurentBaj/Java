package Repetition.Ex9.Monsters;

import java.util.ArrayList;

public class TestMonsters {
    public static void main(String[] args){
        ArrayList<Monster> monsters = new ArrayList<>();

        Monster m1 = new FireMonster("Scorch");
        Monster m2 = new StoneMonster("Bulk");
        Monster m3 = new WaterMonster("Splash");

        monsters.add(m1);
        monsters.add(m2);
        monsters.add(m3);

        for (Monster m:monsters){
            System.out.println(m.attack());
        }
    }

}
