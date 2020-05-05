package SelfMadeExercises.Animals;

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
    }
}
