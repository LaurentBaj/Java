package SelfMadeExercises.Animals;

public class Owner {
    // Read-only
    private String name, email;
    private char gender;
    private int birthYear;
    private static boolean ownAnimal = true;

    // Constructors
    public Owner(){

    }
    public Owner(String name, String email, char gender, int birthYear){
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.birthYear = birthYear;
    }

    // GS
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }
    public int getBirthYear() {
        return birthYear;
    }

    // Methods
    public String toString(){
        return "Owner[name = " + name + ", email = " + email + ", gender = " + gender + ", birthyear = " + birthYear + "]";
    }
}
