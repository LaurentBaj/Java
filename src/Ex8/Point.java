package Ex8;

public class Point {
    private int x;
    private int y;

    // Constructors
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    // Getters and Setters
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    // Methods
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
}
