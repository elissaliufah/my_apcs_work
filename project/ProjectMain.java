import processing.core.*;
import java.util.*;  
 
public class ProjectMain extends PApplet{
	
	PImage play;
	PImage bg;
	PImage sale;
	PImage kessner;
	PImage witman;
	PImage sadie;
	PImage lexi;
	PImage ally;
	PImage kira;
	PImage bag;
	PImage motorcycle;
	PImage star;
	private int gameState = 0;
	private int player = 0;
	private int choose = 0;
	private int vx;
	private int vy;
	private int px;
	private int py;
	private int score;

	public void settings(){
       fullScreen();  
	}
   
    public void setup() {
		px = width/2;
		py = height/2;
	}
   
    public void draw(){
		if (gameState == 0){
			drawStart();
		}else if(gameState == 1){
			drawChoose();
		}else if(gameState == 2){
			drawExplain();
		}else if(gameState ==3){
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
		
		bag = loadImage("bag.png");
		bag.resize(bag.width/2, bag.height/2);
		
		motorcycle = loadImage("motorcycle.png");
		motorcycle.resize(motorcycle.width/2, motorcycle.height/2);
		
		star = loadImage("star.png");
		star.resize(star.width/4, star.height/4);
		
		kessner = loadImage("kessner.png");
		
		witman = loadImage("witman.png");
		
		sadie = loadImage("sadie.png");
		
		lexi = loadImage("lexi.png");
		
		ally = loadImage("ally.png");
		
		kira = loadImage("kira.png");
		}

	public void mousePressed(){
		if(gameState == 0){
			if(mouseX > width/2 - play.width/5 && mouseX < width/2 + play.width/2 && mouseY > height/2 + height/6 - play.height/2 && mouseY < height/2 + height/6 + play.height/2){
				gameState = 1;
			}
		}
		if(choose == 1){
			if((mouseX > width/4 - kessner.width/2 && mouseX < width/4 + kessner.width/2 && mouseY > height/3 - kessner.height/2 && mouseY < height/3 + kessner.height/2) && gameState == 1){
				gameState = 2;
				player = 0;
			}
			if((mouseX > width/2 - witman.width/2 && mouseX < width/2 + witman.width/2 && mouseY > height/3 - witman.height/2 && mouseY < height/3 + witman.height/2) && gameState == 1){
				gameState = 2;
				player = 1;
			}
			if((mouseX > width/2 + width/4 - sadie.width/2 && mouseX < width/2 + width/4 + sadie.width/2 && mouseY > height/3 - witman.height/2 && mouseY < height/3 + witman.height/2) && gameState == 1){
				gameState = 2;
				player = 2;
			}
			if((mouseX > width/4 - lexi.width/2 && mouseX < width/4 + lexi.width/2 && mouseY > height/2 + height/4 - lexi.height/2 && mouseY < height/2 + height/4 + lexi.height/2) && gameState == 1){
				gameState = 2;
				player = 3;
			}
			if((mouseX > width/2 - ally.width/2 && mouseX < width/2 + ally.width/2 && mouseY > height/2 + height/4 - ally.height/2 && mouseY < height/2 + height/4 + ally.height/2) && gameState == 1){
				gameState = 2;
				player = 4;
			}
			if((mouseX > width/2 + width/4 - kira.width/2 && mouseX < width/2 + width/4 + kira.width/2 && mouseY > height/2 + height/4 - kira.height/2 && mouseY < height/2 + height/4 + kira.height/2) && gameState == 1){
				gameState = 2;
				player = 5;
			}
		}
	}
	
	public void keyPressed(){
		if(gameState == 2){
			if(key == ' '){
				gameState = 3;
				kessner.resize(kessner.width/2, kessner.height/2);
				witman.resize(witman.width/2, witman.height/2);
				sadie.resize(sadie.width/2, sadie.height/2);
				lexi.resize(lexi.width/2, lexi.height/2);
				ally.resize(ally.width/2, ally.height/2);
				kira.resize(kira.width/2, kira.height/2);
			}
		}
		if(gameState == 3){
			if(keyCode == RIGHT) {
			  vx = width/100;
			} else if (keyCode == LEFT) {
			  vx = -(width/100);
			} else if (keyCode == UP) {
			  vy = -(height/100);
			} else if (keyCode == DOWN) {
			  vy = height/100;
			}
		}
	}
	
	public void drawChoose(){
		background(255, 255, 255);
		fill(0);
		textSize(width/12);
		textAlign(CENTER);
		text("CHOOSE YOUR DASHER", width/2, height/7);
		
		imageMode(CENTER);
		image(kessner, width/4, height/3);
		image(star, width/4, height/3 + (star.height*2));
		
		image(bag, width/4 + kessner.width - width/40, height/3);
		
		imageMode(CENTER);
		image(witman, width/2, height/3);
		image(star, width/2, height/3 + (star.height*2));
		
		imageMode(CENTER);
		image(sadie, width/2 + width/4, height/3);
		image(star, width/2 + width/4, height/3 + (star.height*2));
		
		imageMode(CENTER);
		image(lexi, width/4, height/2 + height/4);
		image(star, width/4, height/2 + height/4 + (star.height*2));
		
		imageMode(CENTER);
		image(ally, width/2, height/2 + height/4);
		image(star, width/2, height/2 + height/4 + (star.height*2));
		
		imageMode(CENTER);
		image(kira, width/2 + width/4, height/2 + height/4);
		image(star, width/2 + width/4, height/2 + height/4 + (star.height*2));
		
		choose = 1;
	}
	
	public void drawExplain(){
		background(255,255,255);
		fill(0);
		textSize(width/24);
		textAlign(CENTER);
		text("YOU ARE A DOORDASHER DURING BLACK FRIDAY.", width/2, height/7);
		text("COLLECT THE ITEMS ON YOUR CUSTOMERS LIST.", width/2, height/6 + height/20);
		text("AVOID LOOSE SHOPPING CARTS(TAKES 1 ITEM).", width/2, height/3);
		text("& ANGRY KARENS(GAME OVER).", width/2, height/4 + height/6);
		text("FINISH AS MANY ORDERS AS POSSIBLE!", width/2, height/2 + height/20);
		text("Press space to start", width/2, height/2 + height/5);
		score = 0;
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
		textSize(width/40);
		text("Score: " + score, width - width/15, 0 + height/20);
		rect(width/2 - (width/6)/2, 0 + (height/10)/18, width/6, height/10);
		rect(0, height/2 - (width/6)/2, height/10, width/6);
		rect(width/2 - (width/6)/2, height - height/10, width/6, height/10);
		image(motorcycle, width - motorcycle.width/2, height/2);
		if(player == 0){
			imageMode(CENTER);
			image(kessner, px, py);
			px += vx;
			py += vy;
		}
		if(player == 1){
			imageMode(CENTER);
			image(witman, px, py);
			px += vx;
			py += vy;
		}
		if(player == 2){
			imageMode(CENTER);
			image(sadie, px, py);
			px += vx;
			py += vy;
		}
		if(player == 3){
			imageMode(CENTER);
			image(lexi, px, py);
			px += vx;
			py += vy;
		}
		if(player == 4){
			imageMode(CENTER);
			image(ally, px, py);
			px += vx;
			py += vy;
		}
		if(player == 5){
			imageMode(CENTER);
			image(kira, px, py);
			px += vx;
			py += vy;
		}
		if(dist(px, py, width/2 - (width/6)/2, 0 + (height/10)/18) < kessner.width + (width/6)/3){
			score += 1;
		}
	}
    
    public void keyReleased() {
		if (gameState == 3) {
			if (keyCode == LEFT || keyCode == RIGHT) {
				vx = 0;
			}
			if (keyCode == UP || keyCode == DOWN) {
				vy = 0;
			}
		}
	}
	
	public void timer(){
		
		
		
	}

		   
	public static void main(String[] args) {
		PApplet.main("ProjectMain");

	}
}
