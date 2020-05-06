package SelfMadeExercises.MockExam;

public class Main {
    public static void main(String[] args){

        Animal a1 = new Lion();
        System.out.println(a1);

        Animal a2 = new Lion("Simba", " eighth generation of Disney", 3);
        System.out.println(a2);

        Animal a3 = new Goat();
        System.out.println(a3);

        Animal a4 = new Goat("Sindre", " second generation Sauarlia", 24 , "spaghetti");
        System.out.println(((Goat)a4).feedAnimal("spaghetti"));


    }
}
