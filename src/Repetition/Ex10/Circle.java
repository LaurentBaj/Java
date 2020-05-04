package Repetition.Ex10;

public class Circle extends Shape{
    private double radius;

    // Constructors
    public Circle(){
        super();
    }
    public Circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
    }

    // GS
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    // Methods
    @Override
    public String toString(){
        return "Circle[radius = " + radius + super.toString() + "]";
    }
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter(){
        return Math.PI * radius * 2;
    }
}