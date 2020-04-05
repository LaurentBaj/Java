package InterfaceAndAbstract;

public class Main {
    public static void main(String[] args){

        Instrument guitar = new Instrument("guitar", "comping");
        System.out.println(guitar.getSound() + ", " + guitar.getBandRole());

        guitar.setEffect("Wah wah");
        System.out.println(guitar.getEffect());
        System.out.println(guitar.isElectrical);

    }
}
