package Ex10.Movable;

public class MovableTest {
    public static void main(String[] args){
        // Testing MovablePoint
        Movable m1 = new MovablePoint(5, 6, 10, 15);
        System.out.println(m1);
        m1.moveDown();
        System.out.println(m1);

        // Testing MovableCircle
        Movable m2 = new MovableCircle(1,2,3,4,20);
        System.out.println(m2);
        m2.moveLeft();
        System.out.println(m2);

        // Testing MovableRectangle
        Movable r1 = new MovableRectangle(4, 4, 8, 8);
        System.out.println(r1);
    }
}
