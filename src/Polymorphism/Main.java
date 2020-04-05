public class Main {
    public static void main(String[] args) {

        Instrument piano = new Instrument(1234, "piano", "clean", true);
        Guitar gibson = new Guitar(1235, "guitar", "clean", false, "Iced Tea", true);

        // Now I am going to use polymorphism
        Instrument standberg = new Guitar(1236, "guitar", "warm", true, "red", true);

        // I can't use isElectricCanShredColor method since it is not in the parent class
        // To fix this:
        acceptInstrument(standberg);
    }

    public static void acceptInstrument(Instrument newInst){

        Guitar tempGuitar = (Guitar) newInst;
        System.out.println(((Guitar) newInst).isElectricCanShredColor());

        if(tempGuitar instanceof Instrument && tempGuitar instanceof Guitar){
            System.out.println("Passed");
        }

    }


    }
