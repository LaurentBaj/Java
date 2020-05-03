package Repetition.Ex9;

public class Triangle extends Shape{
    private double base;
    private double height;

    // Constructors
    public Triangle(){

    }
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    public Triangle(String color, double base, double height){
        super(color);
        this.base = base;
        this.height = height;
    }

    // Methods
    @Override
    public String toString(){
        return "This is a triangle with surface area " + getArea() + " and has " + super.toString();
    }
    @Override
    public double getArea(){
        return (base * height)/2;
    }
}