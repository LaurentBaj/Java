package SelfMadeExercises.MockExam;

public class Stable {
    private String address, box, farm;

    // Constructor
    public Stable(){

    }
    public Stable(String address, String box, String farm){
        this.address = address;
        this.box = box;
        this.farm = farm;
    }

    // Methods
    public String toString(){
        return "\nLocation " + address + "\nBox: " + box + "\nFarm: " + farm;
    }
}
