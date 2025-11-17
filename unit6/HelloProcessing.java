import processing.core.*;


public class HelloProcessing extends PApplet
{
	private float x;
	private Star star;
	
    public void settings()
    {
        size(400, 400);
    }

    public void setup()
    {
        x = 0;        
        star = new Star(this, 200, 200);
    }

    public void draw()
    {
        background(0);
        fill(191,191,191);
        ellipse(x, 150, 50, 50);
        x++;
        star.display();
        if(x > 400){
			background(51,201,250);
			fill(191,191,191);
			ellipse(x, 150, 50, 50);
			x++;
			star.display();
		}
    }


    public static void main(String[] args)
    {
        PApplet.main("HelloProcessing");
    }
}



