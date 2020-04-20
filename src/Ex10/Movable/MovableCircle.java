package Ex10.Movable;

public class MovableCircle implements Movable {
    protected int radius;
    protected MovablePoint center;

    // Constructor
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    //Methods
    @Override
    public void moveUp(){
        center.y += center.ySpeed;
    }
    @Override
    public void moveDown(){
        center.y -= center.ySpeed;
    }
    @Override
    public void moveLeft(){
        center.x = center.xSpeed;
    }
    @Override
    public void moveRight(){
        center.x = center.xSpeed;
    }
    @Override
    public String toString(){
        return "x is " + center.x + ", y is " + center.y + ", radius is " + this.radius;
    }
}
