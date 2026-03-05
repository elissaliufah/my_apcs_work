import processing.core.*;
import java.util.*;  

public class Kessner implements Player{
    public Kessner(){
        
    }

    public String getName()
    {
        return "Kessner";
    }

    public void keyPressed()
    {
		if(gameState == 3){
			if(keyCode == RIGHT) {
			  vx = 6;
			} else if (keyCode == LEFT) {
			  vx = -6;
			} else if (keyCode == UP) {
			  vy = 6;
			} else if (keyCode == DOWN) {
			  vy = -6;
			}
		}
	}
    
    public void keyReleased() {
		if (gameState == 3) {
			if (keyCode == LEFT || keyCode == RIGHT) {
				vx = 0;
			if (keyCode == UP || keyCode == DOWN) {
				vy = 0;
    }
  }
}

    private int vx;
    private int vy;
}
