package Ex4;

public class Author {
    private String name;
    private String email;
    private char gender;

    public String getName() {
        return name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public char getGender(){
        return gender;
    }

    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String toString(){
        return "Author[name = " + this.name + ", email =  " + this.email + ", gender = " + this.gender + "]";
    }
}
