package Ex06;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());

        Circle circle2 = new Circle(22.5);
        System.out.println(circle2.getRadius());
        System.out.println(circle2.getArea());

        // Testing the second constructor
        Circle circle3 = new Circle(5.0, "Blue");
        System.out.println(circle3.getRadius());
        System.out.println(circle3.getArea());
        System.out.println(circle3.getColor());

        // Testing the third constructor
        Circle circle4 = new Circle(10.0, "Purple");
        System.out.println(circle4.getRadius());
        System.out.println(circle4.getArea());
        System.out.println(circle4.getColor());
        System.out.println();

        // Testing compareArea() and toString()
        System.out.println(circle4.compareArea(circle3));
        System.out.println(circle4.toString());
        System.out.println();

        // Testing setShapeCounter()
        // Two ways of getting shapeCounter
        Circle circle5 = new Circle();
        Circle.setShapeCounter();
        System.out.println(Circle.getShapeCounter());
    }
}

