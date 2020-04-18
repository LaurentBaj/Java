package Ex09;

public class Triangle extends Shape {
    private double length;
    private double width;

    public Triangle(){super();}
    public Triangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public Triangle(double length, double width, String color){
        super(color);
        this.length = length;
        this.width = width;
    }
    @Override
    public String toString(){
        return "Triangle[length = " + length + ", width = " + width + "]";
    }
    @Override
    public double getArea(){
        return (length * width)/2;
    }
}
