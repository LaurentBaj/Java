package Task_1;

public class Address {
    private String street, postcode, country;

    // Constructor
    public Address(){

    }
    public Address(String street, String postcode, String country){
        this.street = street;
        this.postcode = postcode;
        this.country = country;
    }

    // GS
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getPostcode() {
        return postcode;
    }
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    // Method
    public String toString(){
        return "\nStreet: " + street + "\nPostcode: " + postcode + "\nCountry: " + country;
    }
}
