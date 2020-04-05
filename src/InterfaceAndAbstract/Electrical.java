package InterfaceAndAbstract;

public abstract class Electrical {

    boolean isElectrical = false;
    String effect;

    public void hasElectricInput(){
        isElectrical = true;
    }
    public abstract void setEffect(String effect);
    public abstract String getEffect();

}
