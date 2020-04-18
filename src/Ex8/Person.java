package Ex8;

public class Person {
    private String name;
    private String address;

    // Constructors
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    // Getters and Setters
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    // Methods
    public String toString(){
        return "Person[name = " + this.name + ", address = " + this.address + "]";
    }
}
