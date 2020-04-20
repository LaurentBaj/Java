package Ex10;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    // Constructors
    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getters and Setters
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    // Methods
    public abstract double getArea();
    public abstract double getPerimeter();

    public String toString() {
        if (this.isFilled() == true) {
            return "[Color = " + color + ", Filled]";
        }
        else {
            return "[Color = " + color + ", Not filled";
        }
    }
}
