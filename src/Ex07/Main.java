package Ex07;

public class Main {
    public static void main(String[] args){
        Shape hexagon1 = new Shape();
        System.out.println(hexagon1);

        Shape triangle1 = new Shape("Purple", false);
        System.out.println(triangle1);

        Circle circle1 = new Circle();
        Circle circle2 = new Circle("black", false, 5.5);
        System.out.println(circle1);
        System.out.println(circle2);

        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(3, 2, "blue", false);
        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle2);

        Square square1 = new Square();
        Square square2 = new Square(5, "orange", false);
        System.out.println(square1);
        System.out.println(square2);
        System.out.println(square2.getPerimeter());
    }
}
