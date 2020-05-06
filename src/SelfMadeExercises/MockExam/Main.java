package SelfMadeExercises.MockExam;

import SelfMadeExercises.Animals.Owner;

public class Main {
    public static void main(String[] args){

        Animal a1 = new Lion();
        System.out.println(a1);

        Animal a2 = new Lion("Simba", " eighth generation of Disney", 3);
        System.out.println(a2);

        Animal a3 = new Goat();
        System.out.println(a3);

        Animal a4 = new Goat("Sindre", " second generation Sauarlia", 24 , "spaghetti");
        System.out.println(a4);
        System.out.println(((Goat)a4).feedAnimal("spaghetti"));

        Stable s1 = new Stable("Orkideveien 10", "Third box", "The Flintstones");
        Animal a5 = new Lion("Ben", "third generation Bajrami", 18, s1);
        System.out.println(a5);

        Stable s2 = new Stable("Kirkegata 24", "Information Tech - Building", "Høyskolen Kristiania");
        Goat a6 = new Goat("Laurent", "third generation Bajrami", 24, "sushi", s2);
        System.out.println(a6);

        Animal a7 = new Lion("Leo", "eighth generation Disney", 1);
        System.out.println(a7);
        Animal a8 = new Lion("Henrik", "third generation Braaten", 23, s2);
        System.out.println(a8);

    }
}
