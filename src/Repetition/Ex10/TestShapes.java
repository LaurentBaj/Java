package Repetition.Ex10;

public class TestShapes {
    public static void main(String[] args){

        Shape s1 = new Rectangle("blue", false, 5, 4);
        Shape s2 = new Circle("purple", false, 10);
        Shape s3 = new Rectangle();
        Shape s4 = new Circle();

        System.out.println(s1 + " Perimeter = " + s1.getPerimeter() + ", Surface area = " + s1.getArea());
        System.out.println(s2 + " Surface area = " + s2.getArea());
        System.out.println(s3);
        System.out.println(s4);
        System.out.println("");

        // Exercise Text
        Shape s5 = new Circle("Red", false, 5.5);
        System.out.println(s5.getColor());
        System.out.println(s5.isFilled());
        // Downcast
        Circle c1 = (Circle)s5;
        System.out.println(((Circle) s5).getRadius());

        System.out.println("");

        Shape s6 = new Rectangle("red", false, 1, 2);
        System.out.println(s6.getArea());
        System.out.println(s6.getPerimeter());
        System.out.println(s6.getColor());
        Rectangle r1 = (Rectangle)s6;
        System.out.println(((Rectangle) s6).getLength());

        System.out.println("");

        Shape s7 = new Square();
        System.out.println(s7);
        ((Square) s7).setSide(5);
        System.out.println(s7);
        System.out.println(s7.getArea());
        System.out.println(s7.getPerimeter());

    }
}
