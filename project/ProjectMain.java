import processing.core.*;
import java.util.*;  
 
public class ProjectMain extends PApplet{
	
	PImage play;
	PImage bg;
	PImage sale;
	PImage kessner;
	private int gameState = 0;

	public void settings(){
       fullScreen();  
	}
   
    public void setup() {
		
	}
   
    public void draw(){
		if (gameState == 0){
			drawStart();
		}else if(gameState == 1){
			drawGame();
		}
	}
   
    public void drawStart() {
		background(0);

		fill(255,255,255);
		textSize(width/8);
		textAlign(CENTER);
		text("Black Friday", width/2, height/2);
		
		play = loadImage("play.png");
		play.resize(play.width / 2, play.height / 2);
		imageMode(CENTER);
		image(play, width/2, height/2 + height/6);

		sale = loadImage("sale.png");
		sale.resize(sale.width / 2, sale.height / 2);
		imageMode(CENTER);
		image(sale, width/2 + width/3 + width/15, height/2 - height/30);
		
		bg = loadImage("floor.jpg");
		bg.resize(bg.width/3, bg.height/3);
		
		kessner = loadImage("kessner.png");
		kessner.resize(kessner.width, kessner.height);
		}

	public void mousePressed(){
		if(mouseX > width/2 - play.width/5 && mouseX < width/2 + play.width/2 && mouseY > height/2 + height/6 - play.height/2 && mouseY < height/2 + height/6 + play.height/2){
			gameState = 1;
		}
		if(mouseX > width/2 - play.width/5 && mouseX < width/2 + play.width/2 && mouseY > height/2 + height/6 - play.height/2 && mouseY < height/2 + height/6 + play.height/2){
			gameState = 1;
		}
	}
	
	public void drawGame(){
		int x = bg.width/2;
		int y = bg.height/2;
		imageMode(CENTER);
		image(bg, x, y);
		for(int i = 0; i < width/25; i++){
			for(int j = 0; j < width/20; j++){
				image(bg, x, y);
				x += bg.width/2 + bg.width/12;
			}
			x = bg.width/2;
			y += bg.height/2 + bg.height/8;
		}
		
		fill(0);
		textSize(width/12);
		textAlign(CENTER);
		text("CHOOSE YOUR PLAYER", width/2, height/7);
		
		imageMode(CENTER);
		image(kessner, width/4, height/3);
		
	}
	
		
		

		   
		public static void main(String[] args) {
			PApplet.main("ProjectMain");

		}
}
