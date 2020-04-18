package Ex8;

public class Line {
    private Point begin;
    private Point end;

   // Constructors
   public Line(Point begin, Point end){
       this.begin = begin;
       this.end = end;
   }
   public Line(int beginX, int beginY, int endX, int endY){
       begin = new Point(beginX, beginY);
       end = new Point(endX, endY);
   }

   // Getters and Setters
  public void setBegin(Point begin){this.begin = begin;}
  public void setEnd(Point end){this.end = end;}
  public Point getBegin(){return begin;}
  public Point getEnd(){return end;}

  public void setBeginX(int x){
       begin.setX(x);
  }
  public void setBeginY(int y){
       begin.setY(y);
  }
  public void setEndX(int x){
       end.setX(x);
  }
  public void setEndY(int y){
       end.setY(y);
  }
  public void setBeginXY(int x, int y){
       begin.setXY(x, y);
  }
  public void setEndXY(int x, int y){
       end.setXY(x, y);
  }

  public int getBeginX(){
       return begin.getX();
  }
  public int getBeginY(){
       return begin.getY();
  }
  public int getEndX(){
       return end.getX();
  }
  public int getEndY(){
       return end.getY();
  }

  // Methods
  public int getLineLength(){
       int xDifference;
       int yDifference;

       if(getBeginX() < getEndX()){
           xDifference = ( getEndX() - getBeginX() );
       }
       else if(getBeginX() > getEndX()){
           xDifference = ( getBeginX() - getEndX() );
       }
       if(getBeginY() < getEndY()){
           yDifference = ( getEndY() - getBeginY() );
       }
       else if(getBeginY() > getEndY()){
           yDifference = ( getBeginY() - getEndY() );
       }
       return (int) Math.sqrt( (getBeginX() * getEndX()) + (getEndY() * getBeginY()) );
   }
   public int getGradient(){
       int xDifference = 0;
       int yDifference = 0;

       if(getBeginX() < getEndX()){
           xDifference = ( getEndX() - getBeginX() );
       }
       else if(getBeginX() > getEndX()){
           xDifference = ( getBeginX() - getEndX() );
       }
       if(getBeginY() < getEndY()){
           yDifference = ( getEndY() - getBeginY() );
       }
       else if(getBeginY() > getEndY()){
           yDifference = ( getBeginY() - getEndY() );
       }
       return (int) Math.atan2(yDifference, xDifference);
   }







}
