import processing.core.*;
import java.util.*;  
 
public class ProjectMain extends PApplet{
	private int gameState = 0;
	private float x = 225;
	private float y = 300;
	private float w = 175;
	private float h = 150;
	private float round = 30;
	ArrayList<Scene> scenes = new ArrayList<Scene>();
	//ArrayList <Job> jobs;
	public void settings()
		{
       fullScreen();  
		}
   
    public void setup() {

		scenes.add(new SceneLawyers(this));
	}
   
    public void draw(){
		if (gameState == 0) {
		drawStart();
		}
		else if(gameState == 1){
		scenes.get(0).display();
		}
	}
   
    public void drawStart() {
		background(210,248,243);

		fill(0);
		textSize(50);
		textAlign(CENTER);
		text("Pick a Job to learn more", width/2, 100);


		rectMode(CENTER);
		fill(255,192,203);
		rect(x,y,w,h,round);
		rect(x*2.5f,y,w,h,round);
		rect(x*4f,y,w,h,round);
		rect(x*5.5f,y,w,h,round);
		rect(x,y*2f,w,h, round);
		rect(x*2.5f,y*2f,w,h, round);
		rect(x*4f,y*2f,w,h, round);
		rect(x*5.5f,y*2f,w,h, round);

		fill(0);
		textSize(30);
		text("Lawyers", x,y-100);
		text("Financial Analysts", x*2.5f,y-100);
		text("Computer programmers", x*4f, y-100);
		text("Architects", x*5.5f,y-100);
		text("Biomedical Engineers", x,y*2f-100);
		text("Psychologists", x*2.5f,y*2f-100);
		text("Emergency medicince", x*4f,y*2f-100);
		text("Firefighters", x*5.5f,y*2f-100);


		//for(Job a: jobs){
		//a.drawJobBox();
		}

		public void mousePressed(){
		if(mouseX > x && mouseX < x+w && mouseY > y && mouseY < y+h){
		gameState = 1;
		}
		}

		   
			public static void main(String[] args) {
		PApplet.main("ProjectMain");


		}
}
