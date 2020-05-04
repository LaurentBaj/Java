package Repetition.Ex10;

public class Rectangle extends Shape{
    private double length;
    private double width;

    // Constructors
    public Rectangle(){
        super();
    }
    public Rectangle(double length, double width){
        super();
        this.length = length;
        this.width = width;
    }
    public Rectangle(String color, boolean filled, double length, double width){
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    // GS
    public void setLength(double length){
        this.length = length;
    }
    public double getLength(){
        return length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getWidth() {
        return width;
    }

    // Methods
    public String toString(){
        return "Rectangle[length = " + length + ", width = " + width
                + super.toString() + "]";
    }
    @Override
    public double getArea() {
        return length * width;
    }
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}