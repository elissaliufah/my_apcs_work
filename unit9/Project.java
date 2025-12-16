import processing.core.*;
import java.util.*;  
  
 public class Project extends PApplet{
	private int gameState = 0; 
	 PImage actor;
    public void settings(){
    
        fullScreen();  
    }
    
    public void setup() {
		
		
	}
    
    public void draw()
    {
		if (gameState == 0) {
			drawStart();
		}
    }
    
    public void drawStart() {
		background(255);
		
		text("THE FOOD COURT", width/2, height/2);
		fill(0);
		textSize(75);
		textAlign(CENTER);
	}
    
    public static void main(String[] args) {
		PApplet.main("Project");
	}
}
