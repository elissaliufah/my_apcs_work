import processing.core.*;


public class Star
{
    public Star(PApplet pIn, int xIn, int yIn)
    {
        p = pIn;
        x = xIn;
        y = yIn;
        
    }

    public void display()
    {
		p.fill(125,212,39);
        p.ellipse(x, y, 50, 50);
    }

    private PApplet p;
    private int x;
    private int y;
}
