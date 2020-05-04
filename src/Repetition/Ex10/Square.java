package Repetition.Ex10;

public class Square extends Rectangle{
    private double side;

    // Constructors
    public Square(){
        super();
    }
    public Square(double side){
        super(side, side);
    }
    public Square(String color, boolean filled, double side){
        super(color, filled, side, side);
    }

    //GS
    public void setSide(double side){
        this.side = side;
    }
    public double getSide(){
        return side;
    }

    // Methods
    @Override
    public double getArea(){
        return side * side;
    }
    @Override
    public double getPerimeter(){
        return 4 * (side);
    }
    @Override
    public String toString(){
        return "Square[sides = " + side + ", color = " + color + ", filled = " + filled + "]";
    }
}