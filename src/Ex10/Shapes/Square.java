package Ex10;

public class Square extends Ex10.Rectangle {
    private double side;

    // Constructors
    public Square(){
        super();
    }
    public Square(double side){
        super();
        this.side = side;
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    // GS
    public void setSide(double side){
        super.length = side;
        super.width = side;
    }
    public double getSide(){
        return super.length;
    }

    // Methods
    @Override
    public String toString(){
        return "Square[Side = " + getSide() + ", " + super.toString() + "]";
    }

    // No need to override the getArea and getPerimeter
    // Square object inherit these methods from Rectangle
    // Since the math is the same
}
