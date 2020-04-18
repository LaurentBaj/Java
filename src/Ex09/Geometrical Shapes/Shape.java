package Ex09;

public class Shape {
    private String color;

    // Constructors
    public Shape(){}
    public Shape(String color){
        this.color = color;
    }

    // Methods
    @Override
    public String toString(){
        return "Shape[color = " + color + "]";
    }
    public double getArea(){
        System.out.println("Shape unknown! Cannot compute area!");
        return 0;
    }
}
