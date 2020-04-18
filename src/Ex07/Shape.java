package Ex07;

public class Shape {
    private String color;
    private boolean filled;

    // Constructors
    public Shape(){
        this.color = "red";
        this.filled = true;
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    // Getters and Setters
    public void setColor(String color){
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }

    // Output
    public String toString(){
        if(this.isFilled() == true){
            return "Shape with the color " + this.color + " and is filled";
        }
        else {
            return "Shape with the color " + this.color + " and is not filled";
        }
    }
}
