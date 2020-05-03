package Repetition.Ex8;

public class Person {
    private String name;
    private String address;

    // Constructors
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    // GS
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }

    // Methods
    public String toString(){
        return "Person[name = " + name + ", " + address + "]";
    }
}
