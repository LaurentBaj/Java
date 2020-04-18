package Ex09;

public class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructors
    public Rectangle(){super();}
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public Rectangle(double length, double width, String color){
        super(color);
        this.length = length;
        this.width = width;
    }
    @Override
    public String toString(){
        return "Rectangle[length = " + length + ", width = " + width + ", color = " + super.toString() +  "]";
    }
    @Override
    public double getArea(){
        return (length * width);
    }
}
