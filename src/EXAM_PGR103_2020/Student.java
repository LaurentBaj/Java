
public class Student extends Person{
    // Constructors
    public Student(){
        super();
    }
    public Student(String firstName, String lastName){
        super(firstName, lastName);
    }
    public Student(String firstName, String lastName, int age){
        super(firstName, lastName, age);
    }

    @Override
    public String toString() {
        return "Student: " + super.getFirstName() + ", " + super.getLastName() + ", " + getAge();
    }
}
