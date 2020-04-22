package Ex10.Shapes;

import Ex10.Shape;

public class Rectangle extends Shape {
    protected double length;
    protected double width;

    // Constructors
    public Rectangle(){
        super();
    }
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public Rectangle(double length, double width, String color, boolean filled){
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    // Getters and Setters
    public void setLength(double length){
        this.length = length;
    }
    public double getLength(){
        return length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getWidth(){
        return width;
    }

    // Methods
    @Override
    public double getArea(){
        return length * width;
    }
    @Override
    public double getPerimeter(){
        return 2 * (length * width);
    }
    @Override
    public String toString(){
        return "Rectangle[" + super.toString() + ", length = " + length + ", width = " + width + "]";
    }
}
