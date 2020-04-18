package Ex8;

public class TestPoint {
    public static void main(String[] args){
        Point point1 = new Point(10, 20);
        System.out.println(point1.getX() + ", " + point1.getY());
        point1.setXY(100, 10);
        System.out.println(point1.getX() + ", " + point1.getY());

    }
}
