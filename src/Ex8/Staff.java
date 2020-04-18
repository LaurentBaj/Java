package Ex8;

public class Staff extends Person{
    private String school;
    private double pay;

    // Constructors
    public Staff(String school, double pay, String name, String address){
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    // Getters and Setters
    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }
    public double getPay() {
        return pay;
    }
    public void setPay(double pay) {
        this.pay = pay;
    }

    // Methods
    @Override
    public String toString(){
        return "Staff[" + super.toString() + ", school = " + school + ", pay = " + pay;
    }
}
