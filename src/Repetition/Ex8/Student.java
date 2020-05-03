package Repetition.Ex8;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    // Constructors
    public Student(String name, String address, String program, int year, double fee){
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    // GS
    public void setProgram(String program){
        this.program = program;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setFee(double fee){
        this.fee = fee;
    }
    public String getProgram(String program){
        return program;
    }
    public int getYear(){
        return year;
    }
    public double getFee(){
        return fee;
    }

    // Methods
    @Override
    public String toString(){
        return "Student[" + super.toString() + ", program = " + program +
                ", year = " + year + ", fee = " + fee + "]";
    }
}
