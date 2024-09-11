import org.code.neighborhood.*;

public class PainterPlus extends Painter {

 

 /*
  *Turns the Painter to the right
  */
  
  public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }
  /*
  *Turns the painter around
  */
  public void turnAround() {
    turnRight();
     turnRight();
  }
/*
  *Takes all of the paint from a paint bucket
  */
  public void takeAllPaint() {
    while (isOnBucket()) {
      takePaint();
    }
  }
/*
  *If there is paint (which there isnt) it will pick it up or continue moving, which just keeps the painter moving
  */
  public void moveOrTakePaint() {
    if (!isOnBucket()) {
      move();
    }

    takeAllPaint();
  }
/*
  *Makes the painter paint if the painter has paint
  */
  public void paintIfHasPaint(String color) {
    if (hasPaint()) {
      paint(color);
    }
  }
/*
  * turns south if it can
  */
  public void turnSouth() {
    if (canMove("south")) {
      turnRight();
    }
  }
/*
  * turns the painter left
  */
  public void makeTurn() {
    if (!canMove()) {
      turnLeft();
    }
  }
/*
  * returns the painter to start after completing the background so it can start on the heart
  */
  public void returnToStart() {
    if (isFacingWest()) {
      if (canMove("north")) {
        turnRight();
      }
    }
  }
  /*
  * Moves the painter after paint the square it is on
  */
    public void paintThenMove(String color) {
    while (canMove()) {
      paint(color);
      move();
    }
  }
 /*
  * paints a line based on the int
  */
  public void paintLine(String color, int spaces) {
    setPaint(spaces);
    int count = 0;  
/*
  * counts the spaces it has painted I think
  */
    while (count < spaces && hasPaint()) {
        paint(color); 
        move();       
        count++;   
    }   
    paint(color);
}

}