package Ex8;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    // Constructors
    public Student(String program, int year, double fee, String name, String address){
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    // Getters and Setters
    public String getProgram() {
        return program;
    }
    public void setProgram(String program) {
        this.program = program;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getFee() {
        return fee;
    }
    public void setFee(double fee) {
        this.fee = fee;
    }

    // Methods
    @Override
    public String toString(){
        return "Student[ " + super.toString() + ", Program = " +
                program + ", year = " + year + ", fee = " + fee;
    }

}
