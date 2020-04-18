package Ex07;

public class Rectangle extends Shape {
    private double width;
    private double length;

    // Constructors
    public Rectangle(){
        super();
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // Getters and Setters
    public void setLength(double length) {
        this.length = length;
    }
    public double getLength() {
        return length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth() {
        return width;
    }

    // Methods
    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){
        return (length + length + width + width);
    }

    @Override
    public String toString(){
        return "Rectangle " + this.width + " at width and " + this.length +
                " at length which is a subclass of " + super.toString();
    }
}
