package Ex07;

public class Square extends Rectangle {
    public Square(){
        super();
    }
    public Square(double side) {
        super(side, side);  // Call superclass Rectangle(double, double)
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Methods
    public double getSide(){
        return super.getLength();
    }
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    public String toString(){
        return "A Square with side length " + this.getSide() +", which is a subclass of " + super.toString();
    }

}