package Ex10;

public class Circle extends Ex10.Shape {
    protected double radius;

    // Constructors
    public Circle(){
        super();
    }
    public Circle(double radius){
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
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter(){
        return Math.PI * radius * 2;
    }
    @Override
    public String toString(){
        return "Circle[Radius = " + radius + super.toString() + "]";
    }
}
