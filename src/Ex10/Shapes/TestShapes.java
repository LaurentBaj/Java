package Ex10.Shapes;

import Ex10.Circle;
import Ex10.Square;

public class TestShapes {
    public static void main(String[] args){
        Ex10.Shape s1 = new Circle("RED", false, 5.5);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());

        Rectangle r1 = new Rectangle(5, 3, "Red", false);
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());

        Square square = new Square(3, "Red", true);
        System.out.println(square);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
    }
}
