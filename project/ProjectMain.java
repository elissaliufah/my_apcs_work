import processing.core.*;
import java.util.*;

public class ProjectMain extends PApplet {

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
	PImage karen;
	PImage cart;
	PImage star1;
	PImage star2;
	PImage star3;
	PImage star4;
	PImage star5;

	private int gameState = 0;
	private int player = 0;
	private int choose = 0;
	private int vx;
	private int vy;
	private int px;
	private int py;
	private int score;
	private double score1;
	private int klevel = 0;
	private int wlevel = 0;
	private int kilevel = 0;
	private int alevel = 0;
	private int slevel = 0;
	private int llevel = 0;

	//score
	boolean canScoreTop = true;
	boolean canScoreLeft = true;
	boolean canScoreBottom = true;
	boolean canScoreDeliver = true;

	//ORDER SYSTEM
	int currentOrder = 1;

	boolean explainInit = false;
	
	//TIME SYSTEM
	int saleDuration = 90 * 1000; // 1 minute in milliseconds
	int saleStartTime;
	
	//KAREN SYSTEM!!!
	float karenX, karenY;
	float karenVX, karenVY;
	int karenChangeTimer = 0;
	int karenSpawnDelay = 3000; // 3 seconds after game starts
	int karenSpawnTime;
	boolean karenActive = false;
	
	//CART SYSTEM
	float cartX, cartY;
	float cartVX;
	boolean cartActive = false;
	int cartSpawnTimer = 0;
	int cartSpawnDelay = 2000;

	public void settings() {
		fullScreen();
	}

	public void setup() {
		px = width / 2;
		py = height / 2;
		karenX = width / 2;
		karenY = height / 2;
		karenVX = (float) random(-1.2f, 1.2f);
		karenVY = (float) random(-1.2f, 1.2f);	
		cartX = width / 2;
		cartY = height / 2;
		cartSpawnTimer = millis();

		play = loadImage("play.png");
		play.resize(play.width / 2, play.height / 2);

		sale = loadImage("sale.png");
		sale.resize(sale.width / 2, sale.height / 2);

		bg = loadImage("floor.jpg");
		bg.resize(bg.width / 3, bg.height / 3);

		bag = loadImage("bag.png");
		bag.resize(bag.width / 2, bag.height / 2);

		motorcycle = loadImage("motorcycle.png");
		motorcycle.resize(motorcycle.width / 2, motorcycle.height / 2);

		star = loadImage("star.png");
		star.resize(star.width / 4, star.height / 4);
		
		karen = loadImage("karen.png");
		karen.resize(karen.width / 3, karen.height / 3);
		
		cart = loadImage("cart.png");
		cart.resize(cart.width/2, cart.height/2);

		kessner = loadImage("kessner.png");
		witman = loadImage("witman.png");
		sadie = loadImage("sadie.png");
		lexi = loadImage("lexi.png");
		ally = loadImage("ally.png");
		kira = loadImage("kira.png");
	}

	// ORDER FUNCTION
	void newOrder() {
		currentOrder = (int) random(1, 4); // 1–3
	}

	public void draw() {
		if (gameState == 0) {
			drawStart();
		} else if (gameState == 1) {
			drawChoose();
		} else if (gameState == 2) {
			drawExplain();
		} else if (gameState == 3) {
			drawGame();
		} else if (gameState == 4){
			drawEnd();
		}
	}

	public void drawStart() {
		background(0);

		fill(255);
		textSize(width / 8);
		textAlign(CENTER);
		text("Black Friday", width / 2, height / 2);

		imageMode(CENTER);
		image(play, width / 2, height / 2 + height / 6);
		image(sale, width / 2 + width / 3 + width / 15, height / 2 - height / 30);
	}

	public void mousePressed() {
		if (gameState == 0) {
			if (mouseX > width / 2 - play.width / 2 &&
				mouseX < width / 2 + play.width / 2 &&
				mouseY > height / 2 + height / 6 - play.height / 2 &&
				mouseY < height / 2 + height / 6 + play.height / 2) {
				gameState = 1;
			}
		}
		
		if (gameState == 4) {
			if (mouseX > width/2 - 100 &&
				mouseX < width/2 + 100 &&
				mouseY > height/2 + 50 &&
				mouseY < height/2 + 110) {

				resetGame();
				gameState = 1; 
			}
		}

		if (choose == 1 && gameState == 1) {

			if (dist(mouseX, mouseY, width / 4, height / 3) < kessner.width / 2) {
				player = 0; gameState = 2; explainInit = false;
			}
			if (dist(mouseX, mouseY, width / 2, height / 3) < witman.width / 2) {
				player = 1; gameState = 2; explainInit = false;
			}
			if (dist(mouseX, mouseY, width / 2 + width / 4, height / 3) < sadie.width / 2) {
				player = 2; gameState = 2; explainInit = false;
			}
			if (dist(mouseX, mouseY, width / 4, height / 2 + height / 4) < lexi.width / 2) {
				player = 3; gameState = 2; explainInit = false;
			}
			if (dist(mouseX, mouseY, width / 2, height / 2 + height / 4) < ally.width / 2) {
				player = 4; gameState = 2; explainInit = false;
			}
			if (dist(mouseX, mouseY, width / 2 + width / 4, height / 2 + height / 4) < kira.width / 2) {
				player = 5; gameState = 2; explainInit = false;
			}
		}
	}

	public void keyPressed() {
		if (gameState == 2 && key == ' ') {
			gameState = 3;

			kessner.resize(kessner.width / 2, kessner.height / 2);
			witman.resize(witman.width / 2, witman.height / 2);
			sadie.resize(sadie.width / 2, sadie.height / 2);
			lexi.resize(lexi.width / 2, lexi.height / 2);
			ally.resize(ally.width / 2, ally.height / 2);
			kira.resize(kira.width / 2, kira.height / 2);
		}

		if (gameState == 3) {
			if (keyCode == RIGHT) vx = width/30;
			if (keyCode == LEFT) vx = -width/30;
			if (keyCode == UP) vy = -width/30;
			if (keyCode == DOWN) vy = width/30;
		}
	}

	public void keyReleased() {
		if (gameState == 3) {
			if (keyCode == LEFT || keyCode == RIGHT) vx = 0;
			if (keyCode == UP || keyCode == DOWN) vy = 0;
		}
	}

	public void drawChoose() {
		background(255);

		fill(0);
		textSize(width / 12);
		textAlign(CENTER);
		text("CHOOSE YOUR DASHER", width / 2, height / 7);

		imageMode(CENTER);

		image(kessner, width/4, height/3);
		if(klevel == 1){
			star1 = loadImage("star1.png");
			star1.resize(star1.width / 4, star1.height / 4);
			image(star1, width/4, height/3 + kessner.height/2 + star.height);
		}else if(klevel == 2){
			star2 = loadImage("star2.png");
			star2.resize(star2.width / 4, star2.height / 4);
			image(star2, width/4, height/3 + kessner.height/2 + star.height);
		}else if(klevel == 3){
			star3 = loadImage("star3.png");
			star3.resize(star3.width / 4, star3.height / 4);
			image(star3, width/4, height/3 + kessner.height/2 + star.height);
		}else if(klevel == 4){
			star4 = loadImage("star4.png");
			star4.resize(star4.width / 4, star4.height / 4);
			image(star4, width/4, height/3 + kessner.height/2 + star.height);
		}
		else if(klevel >= 5){
			star5 = loadImage("star5.png");
			star5.resize(star5.width / 4, star5.height / 4);
			image(star5, width/4, height/3 + kessner.height/2 + star.height);
		}
		else{
			image(star, width/4, height/3 + kessner.height/2 + star.height);
		}
		image(bag, width/4 + kessner.width/2 + bag.width/3, height/3);

		image(witman, width/2, height/3);
		image(star, width/2, height/3 + witman.height/2 + star.height);
		if(wlevel == 1){
			star1 = loadImage("star1.png");
			star1.resize(star1.width / 4, star1.height / 4);
			image(star1, width/2, height/3 + witman.height/2 + star.height);
		}else if(wlevel == 2){
			star2 = loadImage("star2.png");
			star2.resize(star2.width / 4, star2.height / 4);
			image(star2, width/2, height/3 + witman.height/2 + star.height);
		}else if(wlevel == 3){
			star3 = loadImage("star3.png");
			star3.resize(star3.width / 4, star3.height / 4);
			image(star3, width/2, height/3 + witman.height/2 + star.height);
		}else if(wlevel == 4){
			star4 = loadImage("star4.png");
			star4.resize(star4.width / 4, star4.height / 4);
			image(star4, width/2, height/3 + witman.height/2 + star.height);
		}else if(wlevel >= 5){
			star5 = loadImage("star5.png");
			star5.resize(star5.width / 4, star5.height / 4);
			image(star5, width/2, height/3 + witman.height/2 + star.height);
		}
		else{
			image(star, width/2, height/3 + witman.height/2 + star.height);
		}
		image(bag, width/2 + witman.width/2 + bag.width/3, height/3);

		image(sadie, width/2 + width/4, height/3);
		if(slevel == 1){
			star1 = loadImage("star1.png");
			star1.resize(star1.width / 4, star1.height / 4);
			image(star1, width/2 + width/4, height/3 + sadie.height/2 + star.height);
		}else if(slevel == 2){
			star2 = loadImage("star2.png");
			star2.resize(star2.width / 4, star2.height / 4);
			image(star2, width/2 + width/4, height/3 + sadie.height/2 + star.height);
		}else if(slevel == 3){
			star3 = loadImage("star3.png");
			star3.resize(star3.width / 4, star3.height / 4);
			image(star3, width/2 + width/4, height/3 + sadie.height/2 + star.height);
		}else if(slevel == 4){
			star4 = loadImage("star4.png");
			star4.resize(star4.width / 4, star4.height / 4);
			image(star4, width/2 + width/4, height/3 + sadie.height/2 + star.height);
		}else if(slevel >= 5){
			star5 = loadImage("star5.png");
			star5.resize(star5.width / 4, star5.height / 4);
			image(star5, width/2 + width/4, height/3 + sadie.height/2 + star.height);
		}
		else{
			image(star, width/2 + width/4, height/3 + sadie.height/2 + star.height);
		}
		image(bag, width/2 + width/4 + sadie.width/2 + bag.width/3, height/3);
		
		image(lexi, width/4, height/2 + height/4);
		if(llevel == 1){
			star1 = loadImage("star1.png");
			star1.resize(star1.width / 4, star1.height / 4);
			image(star1, width/4, height/2 + height/4 + lexi.height/2 + star.height);
		}else if(llevel == 2){
			star2 = loadImage("star2.png");
			star2.resize(star2.width / 4, star2.height / 4);
			image(star2, width/4, height/2 + height/4 + lexi.height/2 + star.height);
		}else if(llevel == 3){
			star3 = loadImage("star3.png");
			star3.resize(star3.width / 4, star3.height / 4);
			image(star3, width/4, height/2 + height/4 + lexi.height/2 + star.height);
		}else if(llevel == 4){
			star4 = loadImage("star4.png");
			star4.resize(star4.width / 4, star4.height / 4);
			image(star4, width/4, height/2 + height/4 + lexi.height/2 + star.height);
		}else if(llevel >= 5){
			star5 = loadImage("star5.png");
			star5.resize(star5.width / 4, star5.height / 4);
			image(star5, width/4, height/2 + height/4 + lexi.height/2 + star.height);
		}else{
			image(star, width/4, height/2 + height/4 + lexi.height/2 + star.height);
		}
		image(bag, width/4 + lexi.width/2 + bag.width/3, height/2 + height/4);

		image(ally, width/2, height/2 + height/4);
		image(star, width/2, height/2 + height/4 + ally.height/2 + star.height);
		if(alevel == 1){
			star1 = loadImage("star1.png");
			star1.resize(star1.width / 4, star1.height / 4);
			image(star1, width/2, height/2 + height/4 + ally.height/2 + star.height);
		}else if(alevel == 2){
			star2 = loadImage("star2.png");
			star2.resize(star2.width / 4, star2.height / 4);
			image(star2, width/2, height/2 + height/4 + ally.height/2 + star.height);
		}else if(alevel == 3){
			star3 = loadImage("star3.png");
			star3.resize(star3.width / 4, star3.height / 4);
			image(star3, width/2, height/2 + height/4 + ally.height/2 + star.height);
		}else if(alevel == 4){
			star4 = loadImage("star4.png");
			star4.resize(star4.width / 4, star4.height / 4);
			image(star4, width/2, height/2 + height/4 + ally.height/2 + star.height);
		}else if(alevel >= 5){
			star5 = loadImage("star5.png");
			star5.resize(star5.width / 4, star5.height / 4);
			image(star5, width/2, height/2 + height/4 + ally.height/2 + star.height);
		}else{
			image(star, width/2, height/2 + height/4 + ally.height/2 + star.height);
		}
		image(bag, width/2 + ally.width/2 + bag.width/3, height/2 + height/4);

		image(kira, width/2 + width/4, height/2 + height/4);
		image(star, width/2 + width/4, height/2 + height/4 + kira.height/2 + star.height);
		if(kilevel == 1){
			star1 = loadImage("star1.png");
			star1.resize(star1.width / 4, star1.height / 4);
			image(star1, width/2 + width/4, height/2 + height/4 + kira.height/2 + star.height);
		}else if(kilevel == 2){
			star2 = loadImage("star2.png");
			star2.resize(star2.width / 4, star2.height / 4);
			image(star2, width/2 + width/4, height/2 + height/4 + kira.height/2 + star.height);
		}else if(kilevel == 3){
			star3 = loadImage("star3.png");
			star3.resize(star3.width / 4, star3.height / 4);
			image(star3, width/2 + width/4, height/2 + height/4 + kira.height/2 + star.height);
		}else if(kilevel == 4){
			star4 = loadImage("star4.png");
			star4.resize(star4.width / 4, star4.height / 4);
			image(star4, width/2 + width/4, height/2 + height/4 + kira.height/2 + star.height);
		}else if(kilevel >= 5){
			star5 = loadImage("star5.png");
			star5.resize(star5.width / 4, star5.height / 4);
			image(star5, width/2 + width/4, height/2 + height/4 + kira.height/2 + star.height);
		}else{
			image(star, width/2 + width/4, height/2 + height/4 + kira.height/2 + star.height);
		}
		image(bag, width/2 + width/4 + kira.width/2 + bag.width/3, height/2 + height/4);


		choose = 1;
	}

	public void drawExplain() {
		background(255);

		fill(0);
		textSize(width / 24);
		textAlign(CENTER);

		text("YOU ARE A DOORDASHER DURING BLACK FRIDAY.", width / 2, height / 7);
		text("COLLECT THE ORDERS", width / 2, height / 4);
		text("1 = TOP, 2 = LEFT, 3 = BOTTOM", width / 2, height / 3);
		text("COLLIDING WITH KAREN ENDS THE GAME", width/2, height/3 + height/11);
		text("COLLIDING WITH SHOPPING CART LOSES 1 INVENTORY", width/2, height/2);
		text("Press SPACE to start",width/2, height/3 + height/4);

		// RESET
		if (!explainInit) {
			score = 0;
			score1 = 0;
			newOrder();
			explainInit = true;
			saleStartTime = millis();
			karenSpawnTime = millis();
			karenActive = false;
		}
	}

	public void drawGame() {

		// background
		imageMode(CENTER);
		for (int i = 0; i < width; i += bg.width / 2) {
			for (int j = 0; j < height; j += bg.height / 2) {
				image(bg, i, j);
			}
		}
		
		// timer
		drawSaleTimer();
		if (millis() - saleStartTime >= saleDuration) {
			gameState = 4;
			return;
		}
		
		//karen
		if (!karenActive && millis() - karenSpawnTime > karenSpawnDelay) {
			karenActive = true;

			karenX = random(width);
			karenY = random(height);

			karenVX = random(-4.0f, 4.0f);
			karenVY = random(-4.0f, 4.0f);
		}
		if (karenActive) {

			float dx = px - karenX;
			float dy = py - karenY;

			float dist = sqrt(dx*dx + dy*dy);

			if (dist != 0) {
				dx /= dist;
				dy /= dist;
			}

			float chaseSpeed = 4.0f;

			karenVX = dx * chaseSpeed;
			karenVY = dy * chaseSpeed;

			karenX += karenVX;
			karenY += karenVY;

			imageMode(CENTER);
			image(karen, karenX, karenY);
		}
		
		//shopping cart
		if (!cartActive && millis() - cartSpawnTimer > cartSpawnDelay) {
			cartActive = true;

			int side = (int) random(2); 

			cartY = random(height * 0.2f, height * 0.8f);

			if (side == 0) {
				cartX = -cart.width;
				cartVX = width/7;
			} else {
				cartX = width + cart.width;
				cartVX = -width/7;  
			}
		}

		// MOVE CART
		if (cartActive) {
			cartX += cartVX;

			pushMatrix();
			translate(cartX, cartY);

			if (cartVX < 0) {
				scale(-1, 1);
			}

			imageMode(CENTER);
			image(cart, 0, 0);
			popMatrix();
			
			if (cartX < -cart.width || cartX > width + cart.width) {
				cartActive = false;
				cartSpawnTimer = millis();
			}
			
		}

		//bakcground!
		fill(150);
		rect(width / 2 - (width / 6) / 2, 0, width / 6, height / 10); // top
		rect(0, height / 2 - (width / 6) / 2, width / 10, width / 6); // left
		rect(width / 2 - (width / 6) / 2, height - height / 10, width / 6, height / 10); // bottom

		image(motorcycle, width - motorcycle.width / 2, height / 2);
		
		px += vx;
		py += vy;

		PImage currentPlayer = kessner;
		if (player == 1) currentPlayer = witman;
		if (player == 2) currentPlayer = sadie;
		if (player == 3) currentPlayer = lexi;
		if (player == 4) currentPlayer = ally;
		if (player == 5) currentPlayer = kira;

		image(currentPlayer, px, py);

		fill(0);
		textSize(30);
		text("Inventory: " + score, width - width/18, 0 + height/20);
		text("Order: " + currentOrder, width - width/18, 0 + height/8);
		text("CASH: $" + score1, width - width/18, 0 + height/12);

		// TOP
		if (isCollidingRect(px, py, currentPlayer.width, currentPlayer.height,
			width / 2 - (width / 6) / 2, height / 20, width / 6, height / 10)) {

			if (canScoreTop && currentOrder == 1) {
				score++;
				newOrder();
				canScoreTop = false;
			}
		} else canScoreTop = true;

		// LEFT
		if (isCollidingRect(px, py, currentPlayer.width, currentPlayer.height,
			0, height / 2 - (width / 6) / 2, width / 10, width / 6)) {

			if (canScoreLeft && currentOrder == 2) {
				score++;
				newOrder();
				canScoreLeft = false;
			}
		} else canScoreLeft = true;

		// BOTTOM
		if (isCollidingRect(px, py, currentPlayer.width, currentPlayer.height,
			width / 2 - (width / 6) / 2, height - height / 10, width / 6, height / 10)) {

			if (canScoreBottom && currentOrder == 3) {
				score++;
				newOrder();
				canScoreBottom = false;
			}
		} else canScoreBottom = true;
		
		// MOTORCYCLE
		if (isCollidingRect(px, py, currentPlayer.width, currentPlayer.height,
			width - motorcycle.width, height / 2 - motorcycle.height / 2,
			motorcycle.width, motorcycle.height)) {

			if (canScoreDeliver && score >= 1) {
				score1 += score * 7.0;
				score = 0;
				newOrder();
				canScoreDeliver = false;
			}
		} else canScoreDeliver = true;
		
		// KAREN
		if (karenActive &&
			isCollidingRect(
				px, py,
				currentPlayer.width, currentPlayer.height,
				karenX - karen.width / 2,
				karenY - karen.height / 2,
				karen.width,
				karen.height
			)) {

			gameState = 4;
		}
		
		// CART
		if (cartActive && isCollidingRect(
    px, py, currentPlayer.width, currentPlayer.height,
    cartX - cart.width/2, cartY - cart.height/2, cart.width, cart.height)) {
			if (score > 0) {
				score--;
			}

			cartActive = false;
			cartSpawnTimer = millis();
		}
	}

	boolean isCollidingRect(float px, float py, float pw, float ph,
		float rx, float ry, float rw, float rh) {

		float scaleX = 0.5f;
		float scaleY = 0.5f;

		float hitW = pw * scaleX;
		float hitH = ph * scaleY;

		float playerLeft = px - hitW / 2;
		float playerRight = px + hitW / 2;
		float playerTop = py - hitH / 2;
		float playerBottom = py + hitH / 2;

		return (playerRight > rx &&
			playerLeft < rx + rw &&
			playerBottom > ry &&
			playerTop < ry + rh);
	}
	
	void drawSaleTimer() {

		int elapsed = millis() - saleStartTime;
		int remaining = saleDuration - elapsed;

		if (remaining < 0) remaining = 0;

		int seconds = remaining / 1000;
		int minutes = seconds / 60;
		seconds = seconds % 60;

		String timeText = nf(minutes, 2) + ":" + nf(seconds, 2);

		fill(0);
		textAlign(CENTER);
		textSize(32);

		text("TIME TILL SALE ENDS: " + timeText, width/7 , height/20);
	}
	
	public void drawEnd(){
		background(0);

		fill(255);
		textAlign(CENTER);
		textSize(48);
		text("SALE OVER!", width/2, height/2 - 100);

		textSize(32);
		text("MONEY MADE: $" + score1, width/2, height/2 - 40);

		// BUTTON
		fill(255);
		rectMode(CENTER);
		rect(width/2, height/2 + 80, 200, 60, 10);

		fill(0);
		textSize(24);
		text("PLAY AGAIN", width/2, height/2 + 88);
	}
	
	void resetGame() {
		
		kessner = loadImage("kessner.png");
		witman = loadImage("witman.png");
		sadie = loadImage("sadie.png");
		lexi = loadImage("lexi.png");
		ally = loadImage("ally.png");
		kira = loadImage("kira.png");
		
		if(score1 == 7.0){
			if(player == 1){
				wlevel += 1;
			}
			else if(player == 2){
				slevel += 1;
			}
			else if(player == 3){
				llevel += 1;
			}
			else if(player == 4){
				alevel += 1;
			}
			else if(player == 5){
				kilevel += 1;
			}else{
				klevel += 1;
			}
		}if(score1 == 14.0){
			if(player == 1){
				wlevel += 2;
			}
			else if(player == 2){
				slevel += 2;
			}
			else if(player == 3){
				llevel += 2;
			}
			else if(player == 4){
				alevel += 2;
			}
			else if(player == 5){
				kilevel += 1;
			}else{
				klevel += 2;
			}
		}
		if(score1 >= 21.0){
			if(player == 1){
				wlevel += 3;
			}
			else if(player == 2){
				slevel += 3;
			}
			else if(player == 3){
				llevel += 3;
			}
			else if(player == 4){
				alevel += 3;
			}
			else if(player == 5){
				kilevel += 1;
			}else{
				klevel += 3;
			}
		}
		
		score = 0;
		score1 = 0;
		currentOrder = 1;

		px = width / 2;
		py = height / 2;

		vx = 0;
		vy = 0;

		// timers
		saleStartTime = millis();
		karenSpawnTime = millis();
		karenActive = false;

		cartActive = false;
		cartSpawnTimer = millis();

		canScoreTop = true;
		canScoreLeft = true;
		canScoreBottom = true;
		canScoreDeliver = true;

		explainInit = false;
		
	}

	public static void main(String[] args) {
		PApplet.main("ProjectMain");
	}
}



