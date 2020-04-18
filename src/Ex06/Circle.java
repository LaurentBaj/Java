package Ex06;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    private static int shapeCounter;

    // Constructors
    public Circle(){
        System.out.println("\n=====================");
        shapeCounter++;
    }
    public Circle(double radius){
        System.out.println("\n=====================");
        this.radius = radius;
        shapeCounter++;
    }
    public Circle(double radius, String color){
        System.out.println("\n=====================");
        this.radius = radius;
        this.color = color;
        shapeCounter++;
    }

    // Getters and Setters
    public void setColor(String color){
        this.color = color;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.PI * (radius * radius);
    }

    // Methods
    public double compareArea(Circle c){
        double difference = (this.getArea() - c.getArea()) * -1;
        // Always returns an absolute value
        if(difference < 0){
            difference = difference * -1;
        }
        return difference;
    }

    public String toString(){
        return "Circle[radius=" + radius + " color=" + color + "]";
    }

    // Two ways of getting shapeCounter
    static void setShapeCounter() {
        System.out.println(shapeCounter);
    }
    static int getShapeCounter(){
        return shapeCounter;
    }
}
