package Task_1;

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
    public Staff(String firstName, String lastName, int age, double salary){
        super(firstName, lastName, age);
        this.salary = salary;
    }
    public Staff(String firstName, String lastName, int age, double salary, Address address){
        super(firstName, lastName, age, address);
        this.salary = salary;
        System.out.println("");
    }

    //GS
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }


    // Methods
    @Override
    public String toString() {
        return "Staff: " + super.getFirstName() + ", " + super.getLastName() + ", " + super.getAge() + ", " + getPayment() + getAddress();
    }
    @Override
    public double getPayment() {
        return salary * 12;
    }
}


