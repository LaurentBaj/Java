package Repetition.Ex9.Shapes;

public class Shape{
    private String color;

    // Constructors
    public Shape(){

    }
    public Shape(String color){
        this.color = color;
    }

    // Methods
    public String toString(){
        return "color[" + color + "]";
    }
    public double getArea(){
        System.out.println("Unknown shape");
        return 0;
    }
}