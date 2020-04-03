public class Main {
    public static void main(String[] args) {

        Instrument piano = new Instrument(1234, "Piano", "clean", false);
        Guitar fender = new Guitar(1235, "guitar", "crunchy", false, "red", true);

        // Now I am going to use polymorphism
        Instrument standberg = new Guitar(1236, "guitar", "warm", true, "red", true);

        // I can't use isElectricCanShredColor method since it is not in the parent class
        // To fix this:

        acceptInstrument(standberg);
    }

    private static void acceptInstrument(Instrument thisInstrument) {
        thisInstrument.makeSound();
        // This first line is overloaded as expected
        // Still can't get the Guitar-abilities and -methods

        Guitar tempGuitar = (Guitar) thisInstrument;
        System.out.println(((Guitar) thisInstrument).isElectricCanShredColor());

        // I can now access them
        // Shorter way to do this:
        // System.out.println(((Guitar)thisInstrument).isElectricCanShredColor());
    }

}