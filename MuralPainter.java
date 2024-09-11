import org.code.neighborhood.*;

public class MuralPainter extends PainterPlus {
  /*
  *paints the background the color of choice
  */
 public void paintBackground(String color) {
    while (canMove("south")) {
  //sends the painter right and sets itself up for the next line of the background
      paintThenMove(color);
      turnRight();
       paint(color);
      move();
     turnRight();  

      //sends the painter left and sets itself up for the nxt line of the background
      paintThenMove(color);
      turnLeft();
      paint(color);
      if (canMove()) {
        move();
      }
     turnLeft();  
    }

   turnRight();
  
  returnToStart();
 }
}