package Ex10.Movable;

public class MovableRectangle implements Movable {
    private MovablePoint top;
    private MovablePoint bottom;

    // Constructors
    public MovableRectangle(int x, int y, int xSpeed, int ySpeed){
        top = new MovablePoint(x, y, xSpeed, ySpeed);
        bottom = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    // GS
    public void setTop(MovablePoint top){
        this.top = top;
    }
    public MovablePoint getTop(){
        return top;
    }
    public void setBottom(MovablePoint bottom){
        this.bottom = bottom;
    }
    public MovablePoint getBottomTop(){
        return top;
    }

    // Methods
    @Override
    public void moveUp() {
        top.y += top.ySpeed;
    }
    @Override
    public void moveDown() {
        top.y -= top.ySpeed;
    }
    @Override
    public void moveLeft() {
        top.x -= top.xSpeed;
    }
    @Override
    public void moveRight() {
        top.x += top.xSpeed;
    }

    public String toString(){
        return "top x is " + top.x + ", top y is " + top.y + ", bottom x is " + bottom.xSpeed + ", bottom y is " + bottom.ySpeed ;
    }
}
