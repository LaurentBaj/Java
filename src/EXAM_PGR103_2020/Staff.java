
public class Staff extends Person implements Payable {
    private double salary;

    // Constructors
    public Staff(){
        super();
    }
    public Staff(String firstName, String lastName){
        super(firstName, lastName);
    }
    public Staff(String firstName, String lastName, int age){
        super(firstName, lastName, age);
    }

    //GS
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }

    // Methods
    @Override
    public String toString() {
        return "Staff: " + super.getFirstName() + ", " + super.getLastName() + ", " + super.getAge() + ", " + getPayment();
    }
    @Override
    public double getPayment() {
        return getSalary() * 12;
    }
}
