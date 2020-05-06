package SelfMadeExercises.Animals;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        // Testing default animal
        Animal a1 = new Dog();
        System.out.println(a1);

        // Testing animal with par
        Animal a2 = new Dog("Dexter", "Border Collie", 'M', 3, 300.3, false, "black", 15.7);
        System.out.println(a2);

        // Testing empty Owner and Dog with owner
        Owner o1 = new Owner();
        System.out.println(o1);
        Animal a3 = new Dog("Olaf", "Pit Bull", 'M', 1, 12.4, true, o1, "white", 19.4);
        System.out.println(a3);

        // Testing owner with dog
        Owner o2 = new Owner("Karoline", "Karonline@hotmail.com", 'F', 1996);
        Dog a4 = new Dog("Jenny", "Bernese", 'F', 4, 20000.2, true, o2, "Black", 34.6);
        System.out.println(a4);

        // Testing integrated methods
        System.out.println(a4.makeSound());
        System.out.println(((Dog)a3).makeSound());
        System.out.println(a4.eat());
        a4.setGender('a');
        System.out.println(a4.eat());
        System.out.println(a4.temperature());

        // Duck class
        Animal a5 = new Duck();
        System.out.println(a5);
        Animal a6 = new Duck("Donald", "American", 'M', 85, 100000.2, false);
        System.out.println(a6);
        String[] container = new String[1];
        container[0] = "red"; container[1] = "Blue";
        Duck a7 = new Duck("Daisy", "American", 'F', 67, 1000.3, false, container);
    }
}
