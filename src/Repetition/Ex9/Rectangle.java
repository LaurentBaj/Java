package Repetition.Ex9;

public class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructors
    public Rectangle(){

    }
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public Rectangle(String color, double length, double width){
        super(color);
        this.length = length;
        this.width = width;
    }

    // Methods
    @Override
    public double getArea(){
        return length * width;
    }
    @Override
    public String toString(){
        return "This is a rectangle with surface area " + getArea() + " and has " + super.toString();
    }
}