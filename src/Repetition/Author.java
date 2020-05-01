package Repetition;

public class Author {
    private String name;
    private String email;
    private char gender;

    // Constructors
    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        if (gender == 'f') {
            this.gender = gender;
        } else if (gender == 'm') {
            this.gender = gender;
        }
    }

    // GS
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public char getGender() {
     return gender;
    }
    public void setGender(char gender){
        this.gender = gender;
    }

    // Methods
    public String toString(){
        return "Author[name = " + name + ", email = " + email + ", gender = " + gender + "]";
    }
}
