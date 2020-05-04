package Repetition.Ex10;

abstract class Shape{
    protected String color;
    protected boolean filled;

    // Constructors
    public Shape(){
        this.color = "Red";
        this.filled = true;
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    // GS
    public void setColor(String color){
        this.color = color;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public boolean isFilled(){
        return filled;
    }

    // Methods
    public String toString(){
        return ", color = " + color + ", filled = " + filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}