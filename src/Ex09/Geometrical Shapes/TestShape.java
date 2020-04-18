package Ex09;

public class TestShape {
    public static void main(String[] args){
        Shape s1 = new Rectangle(4, 5, "Red");
        System.out.println(s1 + " Surface area = " + s1.getArea());

        Shape s2 = new Rectangle(5, 5, "Blue");
        System.out.println(s2 + " Surface area = " + s2.getArea());
    }
}
