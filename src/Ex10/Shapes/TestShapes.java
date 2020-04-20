package Ex10;

public class TestShapes {
    public static void main(String[] args){
        Ex10.Shape s1 = new Circle("RED", false, 5.5);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());

        Ex10.Rectangle r1 = new Ex10.Rectangle(5, 3, "Red", false);
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());

        Ex10.Square square = new Square(3, "Red", false);
        System.out.println(square);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
    }
}
