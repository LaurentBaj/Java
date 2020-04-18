package Ex07;

public class Circle extends Shape {
    private double radius;

    // Constructors
    public Circle(){
        super();
        this.radius = 1.0;
    }
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    public Circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
    }

    // Getters and Setters
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    // Methods
    public double getPerimeter(){
        return Math.PI * radius * radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public String toString(){
        return "A circle with the radius of " + this.radius +
                ", which is a subclass of " + super.toString();
    }
}